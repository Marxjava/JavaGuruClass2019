package lv.javaguru.tests4;

public class ConnectingComparisonOperations2 {
    public static void main(String[] args) {

        int a = 100;
        int b = 20;
        int c = a - b;

        boolean result = (c == a) || (c == b) || (c == 0);

        System.out.println(result);
    }
}
