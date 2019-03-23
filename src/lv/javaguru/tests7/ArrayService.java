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
}
