package model;

import java.util.Map;

public class InitialData {

    private Integer restauranteId;
    private Integer dayOfWeek;
    private Integer menu;
    private Map<Integer, Integer> occupation;
    private Map<String, Integer> expandedOccupation;

    public Integer getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(Integer restauranteId) {
        this.restauranteId = restauranteId;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Map<Integer, Integer> getOccupation() {
        return occupation;
    }

    public void setOccupation(Map<Integer, Integer> occupation) {
        this.occupation = occupation;
    }

    public Integer getMenu() {
        return menu;
    }

    public void setMenu(Integer menu) {
        this.menu = menu;
    }

    public Map<String, Integer> getExpandedOccupation() {
        return expandedOccupation;
    }

    public void setExpandedOccupation(Map<String, Integer> expandedOccupation) {
        this.expandedOccupation = expandedOccupation;
    }
}
