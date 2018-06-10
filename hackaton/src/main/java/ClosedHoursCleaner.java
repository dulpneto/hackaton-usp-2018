import config.MongoConfig;
import model.CollectedOccupationData;
import model.EstimatedOccupationData;
import org.mongodb.morphia.Datastore;

public class ClosedHoursCleaner {

    public static void main(String[] args) {
        Datastore ds = MongoConfig.datastore();

        //all
        String[] remove = new String[]{"11_0","14_1","14_2","14_3", "17_0","17_1"};
        String[] removeQuimica = new String[]{"14_0","14_1","14_2","14_3", "17_0","17_1"};

        //central
        for (String hour : remove) {
            CollectedOccupationData.deleteByHour(ds, 1, hour);
            EstimatedOccupationData.deleteByHour(ds, 1, hour);
        }
        CollectedOccupationData.deleteByDay(ds, 1, 6);
        EstimatedOccupationData.deleteByDay(ds, 1, 6);
        for (int i = 17; i <= 19 ; i++) {
            for (int j = 0; j <= 3 ; j++) {
                CollectedOccupationData.deleteByDayHour(ds, 1, 5, i+"_"+j);
                EstimatedOccupationData.deleteByDayHour(ds, 1, 5,i+"_"+j);
            }

        }

        //fisica
        for (String hour : remove) {
            CollectedOccupationData.deleteByHour(ds, 2, hour);
            EstimatedOccupationData.deleteByHour(ds, 2, hour);
        }
        CollectedOccupationData.deleteByDay(ds, 2, 5);
        EstimatedOccupationData.deleteByDay(ds, 2, 5);
        CollectedOccupationData.deleteByDay(ds, 2, 6);
        EstimatedOccupationData.deleteByDay(ds, 2, 6);

        //quimica
        for (String hour : removeQuimica) {
            CollectedOccupationData.deleteByHour(ds, 3, hour);
            EstimatedOccupationData.deleteByHour(ds, 3, hour);
        }
        CollectedOccupationData.deleteByDay(ds, 3, 5);
        EstimatedOccupationData.deleteByDay(ds, 3, 5);
        for (int i = 17; i <= 19 ; i++) {
            for (int j = 0; j <= 3 ; j++) {
                CollectedOccupationData.deleteByDayHour(ds, 3, 6, i+"_"+j);
                EstimatedOccupationData.deleteByDayHour(ds, 3, 6,i+"_"+j);
            }

        }


        //prefeitura
        for (String hour : remove) {
            CollectedOccupationData.deleteByHour(ds, 4, hour);
            EstimatedOccupationData.deleteByHour(ds, 4, hour);
        }
        CollectedOccupationData.deleteByDay(ds, 4, 5);
        EstimatedOccupationData.deleteByDay(ds, 4, 5);
        CollectedOccupationData.deleteByDay(ds, 4, 6);
        EstimatedOccupationData.deleteByDay(ds, 4, 6);
        for (int i = 17; i <= 19 ; i++) {
            for (int j = 0; j <= 3 ; j++) {
                CollectedOccupationData.deleteByHour(ds, 4, i+"_"+j);
                EstimatedOccupationData.deleteByHour(ds, 4,i+"_"+j);
            }

        }

        try {
            ds.getMongo().close();
        } catch (Throwable e) {
            // ignore
        }
    }
}
