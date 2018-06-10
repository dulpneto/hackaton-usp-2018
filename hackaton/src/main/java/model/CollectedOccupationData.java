package model;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.annotations.Entity;

import java.util.Date;
import java.util.List;

@Entity(noClassnameStored = true)
public class CollectedOccupationData extends OccupationData {

    public static List<CollectedOccupationData> findByReferenceDate(Datastore ds, Date referenceDate) {
        return findByReferenceDate(ds, referenceDate, CollectedOccupationData.class);
    }

    public static void deleteByHour(Datastore ds, Integer restaurant, String hour) {
        deleteByHour(ds, restaurant, hour, CollectedOccupationData.class);
    }

    public static void deleteByDay(Datastore ds, Integer restaurant, Integer dayOfWeek) {
        deleteByDay(ds, restaurant, dayOfWeek, CollectedOccupationData.class);
    }

    public static void deleteByDayHour(Datastore ds, Integer restaurant, Integer dayOfWeek, String hour) {
        deleteByDayHour(ds, restaurant, dayOfWeek, hour, CollectedOccupationData.class);
    }
}
