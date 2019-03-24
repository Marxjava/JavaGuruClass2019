package lv.javaguru.tests7;

public class LookupArrayService {

    public int findMax(int[] array) {
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

    public int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int number : array) {
            if (number < minValue) {
                minValue = number;
            }
        }
        if (minValue == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minValue;
        }
    }

    public int indexOfMax(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int maxNumberIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                maxNumberIndex = i;
            }
        }
        return maxNumberIndex;
    }

    public int indexOfMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int minNumberIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
                minNumberIndex = i;
            }
        }
        return minNumberIndex;
    }

    public int indexOf(int[] array, int value) {
        int indexOf = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                indexOf = i;
            }
        }
        return indexOf;
    }
}
