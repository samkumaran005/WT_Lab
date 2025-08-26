import java.time.*;
import java.util.Scanner;
public class DateTimeAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime current = LocalDateTime.now();
        System.out.print("Enter hours to go back: ");
        int hours = sc.nextInt();
        System.out.print("Enter minutes to go back: ");
        int minutes = sc.nextInt();
        LocalDateTime beforeTime = current.minusHours(hours).minusMinutes(minutes);
        System.out.println("Current DateTime: " + current);
        System.out.println("DateTime before " + hours + " hours and " + minutes + " minutes: " + beforeTime);
        System.out.print("Enter your birth year: ");
        int year = sc.nextInt();
        System.out.print("Enter your birth month: ");
        int month = sc.nextInt();
        System.out.print("Enter your birth day: ");
        int day = sc.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);
        System.out.println("Your age is: " + age.getYears() + " years, " +
                           age.getMonths() + " months, and " +
                           age.getDays() + " days.");
    }
}