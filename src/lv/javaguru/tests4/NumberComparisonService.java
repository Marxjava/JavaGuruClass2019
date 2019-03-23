package lv.javaguru.tests4;

public class NumberComparisonService {

    public boolean isEqual(int firstNumber, int secondNumber) {
        return firstNumber == secondNumber; }

    public boolean isGreater(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber; }

    public boolean isLess(int firstNumber, int secondNumber) {
        return firstNumber < secondNumber; }

    public boolean isGreaterOrEquals(int firstNumber, int secondNumber) {
        return firstNumber >= secondNumber; }

    public boolean isLessOrEquals(int firstNumber, int secondNumber) {
        return firstNumber >= secondNumber; }

    public boolean isNotEqual(int firstNumber, int secondNumber) {
        return firstNumber != secondNumber; }
}
