package be.intecbrussel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex4LocalDateTime {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1995, 6, 28);
        System.out.format("You are born on %s.%n", birthday.format(DateTimeFormatter.ISO_LOCAL_DATE));

        System.out.format("It was the %dth day of the year.%n", birthday.getDayOfYear());
        System.out.format("It was the %dth day of the month.%n", birthday.getDayOfMonth());

        String dayToSay = birthday.getDayOfWeek().toString();
        dayToSay = dayToSay.substring(0,1) + dayToSay.substring(1).toLowerCase();
        System.out.format("It was a %s.%n", dayToSay);

        System.out.format("It was%s a leapyear.", birthday.isLeapYear()? "" : " not");
    }
}
