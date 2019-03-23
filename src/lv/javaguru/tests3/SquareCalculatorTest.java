package lv.javaguru.tests3;

public class SquareCalculatorTest {
    public static void main(String[] args) {

        SquareCalculator calculator = new SquareCalculator();

        int expectedResult = 225;
        int actualResult = calculator.calculateSquare(15);

        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);

    }
}
