import java.time.*;
import java.time.temporal.ChronoUnit;
public class DateCalculations {
    public static void main(String[] args) {
        int year1 = 2020, year2 = 2025;
        LocalDate start = LocalDate.of(year1, 1, 1);
        LocalDate end = LocalDate.of(year2, 1, 1);
        long daysBetweenYears = ChronoUnit.DAYS.between(start, end);
        System.out.println("Days between " + year1 + " and " + year2 + " = " + daysBetweenYears);
        LocalDate date1 = LocalDate.of(2023, 5, 10);
        LocalDate date2 = LocalDate.of(2025, 8, 26);
        long daysBetweenDates = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Difference between " + date1 + " and " + date2 + " = " + daysBetweenDates + " days");
        long secondsSince1970 = System.currentTimeMillis() / 1000;
        System.out.println("Seconds since 1970: " + secondsSince1970);
    }
}