package lv.javaguru.leson5;

public class CandyBoxTest {

    public static void main(String[] args) {
        testCandyBoxToString();
        testCandyBoxEquals();
    }

    private static void testCandyBoxEquals() {
        CandyBox prozitCB1 = new CandyBox("Prozit", 8);
        CandyBox prozitCB2 = new CandyBox("Prozit", 8);
        boolean expectedEquals = true;

        System.out.print("Object equals true Test ");
        boolean actual = prozitCB1.equals(prozitCB2);
        if (actual) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Expected: " + expectedEquals);
            System.out.println("Actual: " + actual);
        }
    }

    private static void testCandyBoxToString() {
        CandyBox candyBox = new CandyBox("Prozit", 8);

        String expected = ("CandyBox: {name: " + candyBox.getName() +
                ",  amount: " + candyBox.getAmount() + "}");

        if (expected.equals(candyBox.toString())) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Expected: " + expected);
            System.out.println("Actual" + candyBox.toString());
        }
    }

}
