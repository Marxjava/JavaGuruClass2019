package lv.javaguru.leson4;

public class QuckMathTest {

    public void shouldABeGraterThanB() {
        QuickMath victim = new QuickMath();
        int a = 10;
        int b = 6;
        int expectedResult = 6;
        int actualResult = victim.max(a, b);

        if (actualResult == expectedResult) {
            System.out.println("Test.... has passed");
        } else {
            System.out.println("Test ... failed");
            System.out.println("Expected " + expectedResult +" but we get " + actualResult);
        }
    }

        public static void main (String[]args){
            QuckMathTest test = new QuckMathTest();
            test.shouldABeGraterThanB();
        }
    }