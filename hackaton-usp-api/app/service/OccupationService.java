package service;

import config.MongoConfig;
import model.CollectedOccupationData;
import model.EstimatedOccupationData;
import model.OccupationData;
import org.mongodb.morphia.Datastore;
import out.APIResponse;
import out.ApiStatus;
import out.OccupationInfo;
import out.OccupationRepresentation;
import util.DateUtil;

import java.util.*;

public class OccupationService {

    public APIResponse getOccupation(Integer restaurantId) {

        Map<Integer, OccupationRepresentation> occupations = new HashMap<>();

        // find data
        Datastore ds = MongoConfig.datastore();

        String lastMonday = DateUtil.getLastMonday();

        List<CollectedOccupationData> collectedList = CollectedOccupationData.findByReferenceDate(ds, lastMonday, restaurantId);
        List<EstimatedOccupationData> estimatedList = EstimatedOccupationData.findByReferenceDate(ds, lastMonday, restaurantId);

        Integer dayOfWeek = DateUtil.getDayOfWeek();

        if(collectedList != null){
            for (CollectedOccupationData occupationData : collectedList) {
                //collected data when past day
                if(occupationData.getDayOfWeek() >= dayOfWeek){
                    continue;
                }
                OccupationRepresentation representation = occupations.get(occupationData.getDayOfWeek());
                if(representation == null){
                    representation = new OccupationRepresentation();
                    representation.setDayOfWeek(occupationData.getDayOfWeek());
                    representation.setOccupation(new ArrayList<>());
                    occupations.put(occupationData.getDayOfWeek(), representation);
                }
                OccupationInfo info = parseData(occupationData);
                representation.getOccupation().add(normalizaData(info));
            }
        }

        if(estimatedList != null){
            for (EstimatedOccupationData occupationData : estimatedList) {
                //collected data when past day
                if(occupationData.getDayOfWeek() >= dayOfWeek){
                    continue;
                }
                OccupationRepresentation representation = occupations.get(occupationData.getDayOfWeek());
                if(representation == null){
                    representation = new OccupationRepresentation();
                    representation.setDayOfWeek(occupationData.getDayOfWeek());
                    representation.setOccupation(new ArrayList<>());
                    occupations.put(occupationData.getDayOfWeek(), representation);
                }
                representation.getOccupation().add(parseData(occupationData));
            }
        }

        Comparator comp = (Comparator<OccupationInfo>) (o1, o2) -> o1.getHour().compareTo(o2.getHour());

        //sort infoData
        for (OccupationRepresentation representation : occupations.values()) {
            Collections.sort(representation.getOccupation(), comp);
        }

        APIResponse<OccupationRepresentation> response = new APIResponse(ApiStatus.OK);
        response.addData(occupations.values());

        return response;
    }

    private OccupationInfo normalizaData(OccupationInfo data) {
        Integer newValue = data.getOccupation();
        if(newValue > 75){
            newValue = 4;
        } else if(newValue > 50){
            newValue = 3;
        } else if(newValue > 25){
            newValue = 2;
        } else {
            newValue = 1;
        }
        data.setOccupation(newValue);
        return data;
    }

    private OccupationInfo parseData(OccupationData data) {

        String hourKey = data.getHour();
        String[] split = hourKey.split("_");
        String hour = split[0];
        String minuteKey = split[1];

        String formattedHour;
        if (minuteKey.equals("0")) {
            formattedHour = hour + ":00:00";
        } else if (minuteKey.equals("1")) {
            formattedHour = hour + ":15:00";
        } else if (minuteKey.equals("2")) {
            formattedHour = hour + ":30:00";
        } else {
            formattedHour = hour + ":45:00";
        }

        OccupationInfo info = new OccupationInfo();
        info.setHour(formattedHour);
        info.setOccupation(data.getOccupation());
        return info;
    }
}
