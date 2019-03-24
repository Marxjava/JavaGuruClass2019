package lv.javaguru.tests7;

public class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayService service = new ArrayService();
        int[] array = service.createArray(10);
        service.fillArrayWithRandomNumbers(array);
        service.printArrayToConsole(array);
    }
}
