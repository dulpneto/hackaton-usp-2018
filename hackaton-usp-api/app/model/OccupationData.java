package model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.annotations.Id;

import java.util.List;


public abstract class OccupationData {

    @Id
    private ObjectId id;
    private String referenceDate;
    private Integer restaurant;
    private Integer dayOfWeek;
    private Integer menu;
    private String hour;
    private Integer occupation;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getReferenceDate() {
        return referenceDate;
    }

    public void setReferenceDate(String referenceDate) {
        this.referenceDate = referenceDate;
    }

    public Integer getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Integer restaurant) {
        this.restaurant = restaurant;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getMenu() {
        return menu;
    }

    public void setMenu(Integer menu) {
        this.menu = menu;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Integer getOccupation() {
        return occupation;
    }

    public void setOccupation(Integer occupation) {
        this.occupation = occupation;
    }

    protected static <T extends OccupationData> List<T> findByReferenceDate(Datastore ds, String referenceDate, Integer restaurantId, Class<T> clazz) {
        List<T> list = ds.find(clazz, "referenceDate", referenceDate).filter("restaurant", restaurantId).asList();
        return list;
    }
}
