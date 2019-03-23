package lv.javaguru.leson6;

public class PrimeNumberLookUP {

    public static void main(String[] args) {

        lookUpForPrime(1,80);

    }

    private static void lookUpForPrime(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++ ){
            if (isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
