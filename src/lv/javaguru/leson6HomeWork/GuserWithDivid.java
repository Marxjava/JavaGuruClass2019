package lv.javaguru.leson6HomeWork;

import java.util.Scanner;

//typo
public class GuserWithDivid {

    public static void main(String[] args) {

        inputNumber();
        guesTheNumber();

    }

    private static void guesTheNumber() {
        //ja šādas vērtības definē, tad to jādara klases līmenī
        int startNumber = 0;
        int endNumber = 100;
        label:
        while (true) {
            int number = (startNumber + endNumber) / 2;
            System.out.println(number);
            System.out.println("Is this number is larger, smaller or equal to the number you entered?");
            Scanner scanner = new Scanner(System.in); //šis jāiznes ārpus cikla
            String answer = scanner.next();
            switch (answer) {
                case "larger":
                    startNumber = number;
                    break;
                case "smaller":
                    endNumber = number;
                    break;
                case "equal":
                    System.out.println("Thanks for playing the game!");
                    break label;
                default:
                    System.out.println("Use the following answer options: larger / smaller / equal");
                    break;
            }
        }
    }

    //lieka metode
    private static void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 100:");
        int enteredNumber = scanner.nextInt();
    }
}
