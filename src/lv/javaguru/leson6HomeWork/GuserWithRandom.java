package lv.javaguru.leson6HomeWork;

import java.util.Scanner;

public class GuserWithRandom { //typo
    public static void main(String[] args) {

        inputNumber();
        guesTheNumber();

    }

    //typo
    private static void guesTheNumber() {
        //ja šādas vērtības definē, tad to jādara klases līmenī
        int startNumber = 0;
        int endNumber = 100;
        label:
        while (true) {
            int number = getNumber(startNumber, endNumber);
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

    private static int getNumber(int startNumber, int endNumber) {
        return (int) (Math.random() * (endNumber - startNumber + 1) + startNumber);
    }

    //šai metodei nav jēgas, jo "enteredNumber" nekādi netiek izmantots
    private static void inputNumber() {
        Scanner scanner = new Scanner(System.in); //šo mainīgo arī jāiznes klases līmenī, jo nav nepieciešams katru
        //reizi veidot jaunu objektu
        System.out.print("Enter a number from 1 to 100:");
        int enteredNumber = scanner.nextInt();

    }

}
