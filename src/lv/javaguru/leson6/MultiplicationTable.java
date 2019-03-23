package lv.javaguru.leson6;

public class MultiplicationTable {

    private int widh;
    private int length;

    public MultiplicationTable(int width, int length) {
        this.widh = width;
        this.length = length;
    }

    public void print() {
        printHeaders();
        for (int i = 1; i <= widh; i++) {
            System.out.format("%4d", i);
            System.out.print("|");
            for (int j = 1; j <= length; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }

    }

    private void printHeaders() {
        System.out.print("     ");
        for (int i = 1; i <= length; i++) {
            System.out.format(i > 9 ? "%5d" : "%4d", i);
        }
        System.out.println();

        for (int i = 0; i < length; i++) {
            System.out.print("-----");
        }
        System.out.println();
    }


}
