package lv.javaguru.tests7;

import java.util.Random;

public class RandomNumberArrayTest {

    public static void main(String[] args) {

        int[] integerArray = new int[10];

        Random randomGenerator = new Random();
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = randomGenerator.nextInt(101);
        }

        for (int element : integerArray) {
            System.out.println(element);
        }

        int maxNumber = Integer.MIN_VALUE;
        int maxNumberIndex = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] > maxNumber) {
                maxNumber = integerArray[i];
                maxNumberIndex = i;
            }
        }
        System.out.println();
        System.out.println(maxNumberIndex);
    }
}
