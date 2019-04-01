package lv.javaguru.leson6HomeWork;

public class NumberService {

    public int sumInrange(int number1, int number2) {
        int sumOfRange = 0;
        //šajā gadījumā saprotamāk būs izmantot: number2 > number1;
        if (number1BiggerThenNumber2(number1, number2)) {
            //šo var iznet metodē un attiecīgi izsaukt mainot mainīgos vietām
            for (int i = number1; i <= number2; i++) {
                sumOfRange = sumOfRange + i; // sumOfRange += i
            }
            return sumOfRange;
        } else {
            //šo var iznet metodē un attiecīgi izsaukt mainot mainīgos vietām
            for (int i = number2; i <= number1; i++) {
                sumOfRange = sumOfRange + i; // sumOfRange += i
            }
            return sumOfRange;
        }

    }

    private boolean number1BiggerThenNumber2(int number1, int number2) {
        return number2 > number1;
    }

    public int getEvenNumberCount(int number1, int number2) {
        int CountOfEvenNumber = 0; //mainīgie ar mazo burtu
        //šajā gadījumā saprotamāk būs izmantot: number2 > number1;
        if (number1BiggerThenNumber2(number1, number2)) {
            //šo var iznet metodē un attiecīgi izsaukt mainot mainīgos vietām
            for (int i = number1; i < number2; i++) {
                if (isEvenNumber(i)) {
                    CountOfEvenNumber++;
                }
            }
            return CountOfEvenNumber;
        } else {
            //šo var iznet metodē un attiecīgi izsaukt mainot mainīgos vietām
            for (int i = number2; i < number1; i++) {
                if (isEvenNumber(i)) {
                    CountOfEvenNumber++;
                }
            }
            return CountOfEvenNumber;
        }
    }

    private boolean isEvenNumber(int i) {
        return i % 2 == 0;
    }
}
