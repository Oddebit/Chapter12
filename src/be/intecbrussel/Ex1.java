package be.intecbrussel;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        System.out.println("Enter a number :");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Integer integer = Integer.parseInt(input);
        System.out.println(integer + 100);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
}
