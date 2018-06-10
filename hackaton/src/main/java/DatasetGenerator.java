import config.MongoConfig;
import model.CollectedOccupationData;
import model.InitialData;
import org.mongodb.morphia.Datastore;
import service.InitialDataLoad;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class DatasetGenerator {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    /**
     * File format
     *
     * referenceDate,restaurant,dayOfWeek,menu,hour,occupation
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        Path filePath = Paths.get("/Users/eduardolopes/workspace/hackatonUsp/", "dataset.csv");

        Datastore ds = MongoConfig.datastore();


        try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(filePath, StandardOpenOption.CREATE, StandardOpenOption.APPEND))) {

            //write header
            String header = "referenceDate,restaurant,dayOfWeek,menu,hour,occupation";
           // out.write(header.getBytes());

            List<LocalDate> mondays = getMondays();
            for (LocalDate monday : mondays) {
                List<InitialData> dataList = generateWeekData();

                for (InitialData data : dataList) {
                    for (Map.Entry<String, Integer> entry : data.getExpandedOccupation().entrySet()) {
                        StringBuilder sb = new StringBuilder("\n");
                        sb.append(monday);
                        sb.append(",");
                        sb.append(data.getRestauranteId());
                        sb.append(",");
                        sb.append(data.getDayOfWeek());
                        sb.append(",");
                        sb.append(data.getMenu());
                        sb.append(",");
                        sb.append(entry.getKey());
                        sb.append(",");
                        sb.append(normalizaData(entry.getValue()));
                        //out.write(sb.toString().getBytes());

                        CollectedOccupationData colData = new CollectedOccupationData();
                        colData.setReferenceDate(formatter.format(monday));
                        colData.setRestaurant(data.getRestauranteId());
                        colData.setDayOfWeek(data.getDayOfWeek());
                        colData.setMenu(data.getMenu());
                        colData.setHour(entry.getKey());
                        colData.setOccupation(entry.getValue());
                        ds.save(colData);

                    }

                }
            }


        } catch (IOException x) {
            throw new RuntimeException(x);
        }

        try {
            ds.getMongo().close();
        } catch (Throwable e) {
            // ignore
        }


    }

    private static Integer normalizaData(Integer value) {
        Integer newValue = value;
        if(newValue > 75){
            newValue = 4;
        } else if(newValue > 50){
            newValue = 3;
        } else if(newValue > 25){
            newValue = 2;
        } else {
            newValue = 1;
        }
        return newValue;
    }

    private static List<LocalDate> getMondays(){
        LocalDate endDate = LocalDate.now().plusWeeks(1).with(DayOfWeek.MONDAY);
        LocalDate startDate = endDate.minusMonths(3);

        List<LocalDate> mondays = new ArrayList<>();

        LocalDate thisMonday = startDate.with(DayOfWeek.MONDAY);

        if (startDate.isAfter(thisMonday)) {
            startDate = thisMonday.plusWeeks(1); // start on next monday
        } else {
            startDate = thisMonday; // start on this monday
        }

        while (startDate.isBefore(endDate)) {
            mondays.add(startDate);
            startDate = startDate.plusWeeks(1);
        }
        return mondays;

    }

    private static List<InitialData> generateWeekData(){

        List<InitialData> initialDataList = InitialDataLoad.getWithExpandedTimeBox();

        Map<String, List<InitialData>> initDataByRestaurant = new HashMap<>();
        Map<String, List<Integer>> daysByRestaurant = new HashMap<>();

        //split by restaurant and meal time(lunch or dinner)
        for (InitialData initialData : initialDataList) {
            String key;

            if(initialData.getOccupation().containsKey(11)){
                key = initialData.getRestauranteId() + "_l";
            } else {
                key = initialData.getRestauranteId() + "_d";
            }

            List<InitialData> list = initDataByRestaurant.get(key);
            if(list == null){
                list = new ArrayList<>();
                initDataByRestaurant.put(key, list);

                daysByRestaurant.put(key, new ArrayList<Integer>());
            }
            list.add(initialData);
            daysByRestaurant.get(key).add(initialData.getDayOfWeek());

        }

        //shuffle days of week
        for (Map.Entry<String, List<Integer>> entry : daysByRestaurant.entrySet()) {
            Collections.shuffle(entry.getValue());
        }

        //set new days and add noise to occupation
        for (Map.Entry<String, List<InitialData>> entry : initDataByRestaurant.entrySet()) {
            String key = entry.getKey();
            List<Integer> daysOfWeek = daysByRestaurant.get(key);
            for (int i = 0; i < entry.getValue().size(); i++) {
                InitialData data = entry.getValue().get(i);
                data.setDayOfWeek(daysOfWeek.get(i));

                //add noise
                for (Map.Entry<String, Integer> occEntry : data.getExpandedOccupation().entrySet()) {
                    int randomNum = ThreadLocalRandom.current().nextInt(-20, 20);
                    int noise = occEntry.getValue() * randomNum / 100;
                    int newValue = occEntry.getValue() + noise;
                    if(newValue > 100){
                        newValue = 100;
                    } else if(newValue < 0){
                        newValue = 1;
                    }
                    occEntry.setValue(newValue);
                }
            }
        }
        return initialDataList;

    }

}
