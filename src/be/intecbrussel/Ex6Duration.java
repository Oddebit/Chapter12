package be.intecbrussel;

import java.time.LocalDate;
import java.time.Period;

public class Ex6Duration {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1995,6,28);

        Period period = Period.between(birthday, now);

        System.out.format("It has been %d years, ", period.getYears());
        System.out.format("%d months ", period.getMonths());
        System.out.format("and %d days of happiness since you are born.", period.getDays());
    }
}
