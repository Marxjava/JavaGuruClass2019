package lv.javaguru.tests6;

import java.util.Scanner;

public class CycleForMethodTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = 0;

        for (int i = 1; i < 4; i++) {

            System.out.print("Input number " + i + " : ");

            number = number + scanner.nextDouble();

        }

        double average = number / 3;

        System.out.println("Average = " + average);

    }

}
