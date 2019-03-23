package lv.javaguru.tests6;

import java.util.Scanner;

public class CycleForMethodThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers you want input : ");

        int numbersCount = scanner.nextInt();

        double number = 0;

        for (int i = 1; i <= numbersCount ; i++) {

            System.out.print("Input number " + i + " : ");

            number = number + scanner.nextDouble();

        }

        double average = number / numbersCount;

        System.out.println("Average = " + average);

    }
}
