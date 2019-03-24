package lv.javaguru.tests7;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayService service = new ArrayService();
        int[] array = service.createArray(5);
        service.fillArrayWithRandomNumbers(array);
        service.printArrayToConsole(array);
        System.out.println();
        System.out.println("Average of array: " + service.findAverageInArray(array));
        System.out.println();
        System.out.println("Max in array: " + service.findMaxInArray(array));
        System.out.println("Swap first and max element of array");
        service.swapFirstAndMaxElement(array);
        service.printArrayToConsole(array);
    }
}
