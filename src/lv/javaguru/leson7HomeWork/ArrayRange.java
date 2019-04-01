package lv.javaguru.leson7HomeWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayRange {

    //Uzdevums bija jarealizē veidojot objektu no klases - tadā pat stilā kā pārējie uzdevumi
    public static void main(String[] args) {

        int[] array = createRandomArray();
        int i = 0; //kas ir "i"
        int rangeStart;
        int rangeEnd;

        printToConsole(array);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start of range: ");
        rangeStart = scanner.nextInt();
        System.out.println("Enter end of range: ");
        rangeEnd = scanner.nextInt();

        i = getCountOfElementsForSecondArray(array, i, rangeStart, rangeEnd);

        int[] array2 = createSecondArray(array, i, rangeStart, rangeEnd);
        printToConsole(array2);
    }

    private static int[] createSecondArray(int[] array, int i, int rangeStart, int rangeEnd) {
        int[] array2 = new int[i];
        i = 0;// ieejas parametrus nepārrakstam

        for (int number : array) { //tā kā skaitītājs ir nepieciešams, tad labak izmantot pilno for ciklu
            if (number >= rangeStart && number <= rangeEnd) {
                array2[i] = number;
                i++;
            }
        }
        return array2;
    }

    private static int getCountOfElementsForSecondArray(int[] array, int i, int rangeStart, int rangeEnd) {
        for (int number : array) {
            if (number >= rangeStart && number <= rangeEnd) {
                i++;
            }
        }
        return i;
    }

    private static int[] createRandomArray() {
        int[] array = new int[10];
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101);
        }
        return array;
    }

    private static void printToConsole(int[] array) {
        for (int elementOfArray : array) {
            System.out.print(elementOfArray + ", ");
        }
        System.out.println();
    }
}
