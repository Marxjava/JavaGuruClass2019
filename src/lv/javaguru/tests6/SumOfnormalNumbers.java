package lv.javaguru.tests6;

public class SumOfnormalNumbers {

    public static void main(String[] args) {

        calculate();
    }

    private static void calculate() {
        int summOfNormalNumbers = 0;
        int countOfNormalNumbers = 0;
        for(int i=2; i <= 500; i++){
            if (isPrimeNumber(i)){
                if (i == 17){
                    continue;
                }
                if (i == 71){
                    continue;
                }
                if (countOfNormalNumbers == 50){
                    break;
                }
                summOfNormalNumbers = summOfNormalNumbers + i;
                countOfNormalNumbers++;
            }

        }
        System.out.println("Summa = " + summOfNormalNumbers);
        System.out.println("Skaits = " + countOfNormalNumbers);
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
