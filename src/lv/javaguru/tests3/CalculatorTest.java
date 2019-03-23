package lv.javaguru.tests3;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sumResult = calculator.sum(10, 15);
        int subtractionResult = calculator.subtract(3, 10);
        int multiplicationResult = calculator.multiply(20, 20);
        double divisionResult = calculator.divide(5, 2);

        System.out.println("Sum result: " + sumResult);
        System.out.println("Subtraction result: " + subtractionResult);
        System.out.println("Multiplication result: " + multiplicationResult);
        System.out.println("Division result: " + divisionResult);

    }
}
