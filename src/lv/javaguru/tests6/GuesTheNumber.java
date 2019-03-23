package lv.javaguru.tests6;

import java.util.Random;
import java.util.Scanner;

public class GuesTheNumber {

    public static void main(String[] args) {

        checkThenumber(generateRandomNumber());

    }

    private static void checkThenumber(int randomNumber) {
        int enteredNumber;
        do {
            enteredNumber = inputNumber();
            if (randomNumber > enteredNumber) {
                System.out.println("The number is bigger!");
            } else if (randomNumber < enteredNumber) {
                System.out.println("The number is less");
            } else {
                System.out.println("!!! Congratulation, you guessed the number !!!");
            }
        } while (randomNumber != enteredNumber);
    }

    private static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 100:");
        int enteredNumber = scanner.nextInt();
        return enteredNumber;
    }

    private static int generateRandomNumber() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(101);
        System.out.println(randomNumber);
        return randomNumber;
    }
}
