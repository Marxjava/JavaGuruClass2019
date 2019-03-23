package lv.javaguru.tests6;

import java.util.Scanner;

public class CycleForMethodOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number 1 : ");

        double number = scanner.nextDouble();

        System.out.print("Input number 2 : ");

        number = number + scanner.nextDouble();

        System.out.print("Input number 3 : ");

        number = number + scanner.nextDouble();

        double average = number / 3;

        System.out.println("Average = " + average);

    }
}
