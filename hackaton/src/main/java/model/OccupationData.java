package model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.query.Query;

import java.util.Date;
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

    protected static <T extends OccupationData> List<T> findByReferenceDate(Datastore ds, Date referenceDate, Class<T> clazz) {
        List<T> list = ds.find(clazz, "referenceDate", referenceDate).asList();
        return list;
    }

    protected static <T extends OccupationData> void deleteByHour(Datastore ds, Integer restaurant, String hour, Class<T> clazz) {
        Query<T> query = ds.find(clazz, "hour", hour).filter("restaurant", restaurant);
        ds.delete(query);
    }

    protected static <T extends OccupationData> void deleteByDay(Datastore ds, Integer restaurant, Integer dayOfWeek, Class<T> clazz) {
        Query<T> query = ds.find(clazz, "dayOfWeek", dayOfWeek).filter("restaurant", restaurant);
        ds.delete(query);
    }

    protected static <T extends OccupationData> void deleteByDayHour(Datastore ds, Integer restaurant, Integer dayOfWeek, String hour, Class<T> clazz) {
        Query<T> query = ds.find(clazz, "dayOfWeek", dayOfWeek).filter("hour", hour).filter("restaurant", restaurant);
        ds.delete(query);
    }
}
