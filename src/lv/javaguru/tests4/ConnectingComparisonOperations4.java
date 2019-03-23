package lv.javaguru.tests4;

public class ConnectingComparisonOperations4 {
    public static void main(String[] args) {

        int a = 30;
        int b = -40;
        int c = a-b;

        boolean result = (a >= 0) && (b >= 0) && (c >=0);

        System.out.println(result);
    }
}
