package lv.javaguru.tests7;

import java.util.Random;

public class ArrayService {

    public int[] createArray(int size) {
        return new int[size];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int elementOfArray : array) {
            System.out.println(elementOfArray);
        }
    }

    public double findAverageInArray(int[] array) {
        int sumOfArrayNumbers = 0;
        for (int number : array) {
            sumOfArrayNumbers = sumOfArrayNumbers + number;
        }
        return sumOfArrayNumbers / array.length;
    }

    public int findMaxInArray(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        if (maxNumber == Integer.MIN_VALUE) {
            return 0;
        } else {
            return maxNumber;
        }
    }

    public int[] swapFirstAndMaxElement(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int maxNumberIndex = 0;
        int firstElementOfArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                maxNumberIndex = i;
            }
        }
        array[0] = maxNumber;
        array[maxNumberIndex] = firstElementOfArray;
        return array;
    }
}
