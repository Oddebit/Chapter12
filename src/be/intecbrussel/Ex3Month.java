package be.intecbrussel;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Scanner;

public class Ex3Month {

    public static void main(String[] args) {

        System.out.println("Months (and length) :");
        for (Month month : Month.values()) {
            System.out.format("%s : [%d,%d] %n", month, month.minLength(), month.maxLength());
        }

        System.out.println("\nDays of the week :");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.printf("%s %n", day);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter a day of the week.");
        DayOfWeek day = DayOfWeek.valueOf(scanner.next().toUpperCase());

        System.out.println("How many days do you want to add ?");
        day = day.plus(scanner.nextInt());

        String dayToSay = day.toString();
        dayToSay = dayToSay.substring(0,1) + dayToSay.substring(1).toLowerCase();

        System.out.println(dayToSay);
    }
}
