package lv.javaguru.tests6;

public class OddNumbers {
    public static void main(String[] args) {

        usingCycleFor();
        usingCycleWhile();
        usingCycleDoWhile();
    }

    private static void usingCycleDoWhile() {
        System.out.println("usingCycleDoWhile");
        int i=1;
        do{
            if(i%2 == 1){
                System.out.print(i + " ");
            }
            i++;
        }while (i <= 50);
        System.out.println();
        System.out.println();
    }

    private static void usingCycleWhile() {
        System.out.println("usingCycleWhile");
        int i = 1;
        while (i <= 50){
            if(i%2 == 1){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println();
    }

    private static void usingCycleFor() {
        System.out.println("usingCycleFor");
        for (int i = 1; i <= 50; i++){
            if(i%2 == 1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
