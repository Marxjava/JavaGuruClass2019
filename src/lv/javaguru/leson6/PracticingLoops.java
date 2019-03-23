package lv.javaguru.leson6;

public class PracticingLoops {

    public static void main(String[] args) {

        printNumbersWithFor();
        printNumbersWithDoWhile();
        printNumbersWithWhile();
        printNumbersWithForSimplified();
        printNumbersUsingBreakAndContinue();
    }

    private static void printNumbersUsingBreakAndContinue() {
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                System.out.print("Break");
                break;
            }
            if (i == 2) {
                System.out.print("Continue");
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printNumbersWithForSimplified() {
        int i = 0;
        for (; i <= 10;) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    private static void printNumbersWithWhile() {
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    private static void printNumbersWithDoWhile() {
        int i = 0;
        do{
            System.out.print(i + " ");
            i++;
        }while (i <= 10);
        System.out.println();
    }

    private static void printNumbersWithFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
