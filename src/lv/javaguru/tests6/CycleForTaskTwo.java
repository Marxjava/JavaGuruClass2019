package lv.javaguru.tests6;

import java.util.Scanner;

public class CycleForTaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number > 0) {
            for (int i = 0; i<= number; i++) {
                System.out.print(i + ", ");
            }
        }

    }

}
