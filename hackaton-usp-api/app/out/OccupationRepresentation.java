package out;

import java.util.List;

public class OccupationRepresentation {

    private Integer dayOfWeek;
    private List<OccupationInfo> occupation;

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public List<OccupationInfo> getOccupation() {
        return occupation;
    }

    public void setOccupation(List<OccupationInfo> occupation) {
        this.occupation = occupation;
    }
}
