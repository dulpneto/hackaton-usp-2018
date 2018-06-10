package util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static String getLastMonday(){
        LocalDate localDate = LocalDate.now().with(DayOfWeek.MONDAY);
        return formatter.format(localDate);
    }

    public static Integer getDayOfWeek(){
        LocalDate localDate = LocalDate.now();
        return localDate.getDayOfWeek().getValue();
    }
}
