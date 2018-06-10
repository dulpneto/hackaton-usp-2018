package model;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.annotations.Entity;

import java.util.List;

@Entity(noClassnameStored = true)
public class EstimatedOccupationData extends OccupationData {

    public static List<EstimatedOccupationData> findByReferenceDate(Datastore ds, String referenceDate, Integer restaurantId) {
        return findByReferenceDate(ds, referenceDate, restaurantId, EstimatedOccupationData.class);
    }
}
