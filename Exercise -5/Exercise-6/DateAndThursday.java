import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateAndThursday {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Date & Time: " + now.format(format));
        LocalDate today = LocalDate.now();
        LocalDate nextThursday = today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        LocalDate prevThursday = today.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println("Today: " + today);
        System.out.println("Next Thursday: " + nextThursday);
        System.out.println("Previous Thursday: " + prevThursday);
    }
}
