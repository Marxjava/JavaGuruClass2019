package lv.javaguru.leson6;

public class PrimeNumberFinder {

    public static void main(String[] args) {

        int primeFalse = 6;
        int primeTrue = 11;

        isPrimeNumber(primeFalse);
        isPrimeNumber(primeTrue);

    }

    private static void isPrimeNumber(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }

        }
        System.out.println("The number {" + number + "} "
                + (isPrime ? " IS " : " INN'T ") + " prime number");

    }
}
