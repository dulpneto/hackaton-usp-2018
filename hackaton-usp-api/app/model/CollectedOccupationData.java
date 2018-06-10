package model;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.annotations.Entity;

import java.util.List;

@Entity(noClassnameStored = true)
public class CollectedOccupationData extends OccupationData {

    public static List<CollectedOccupationData> findByReferenceDate(Datastore ds, String referenceDate, Integer restaurantId) {
        return findByReferenceDate(ds, referenceDate, restaurantId, CollectedOccupationData.class);
    }
}
