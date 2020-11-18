package be.intecbrussel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex7DateTimeFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.format("Today is : %1$td/%1$tm/%1$tY %n", LocalDateTime.now());
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter a date (dd/mm/yyyy)");
        String input = scanner.nextLine();

        LocalDate date = LocalDate.parse(input, myFormat);
        System.out.println(date);
    }
}
