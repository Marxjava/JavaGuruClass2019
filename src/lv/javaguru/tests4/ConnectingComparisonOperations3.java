package lv.javaguru.tests4;

public class ConnectingComparisonOperations3 {
    public static void main(String[] args) {

        int a = 200;
        int b = 99;
        int c = a-b;

        boolean result = (c > b) && (c > 0);

        System.out.println(result);
    }
}
