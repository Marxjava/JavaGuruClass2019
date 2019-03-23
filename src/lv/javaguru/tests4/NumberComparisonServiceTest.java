package lv.javaguru.tests4;

public class NumberComparisonServiceTest {

    public static void main(String[] args) {

    NumberComparisonServiceTest testRunner = new NumberComparisonServiceTest();
    testRunner.test1();}

    public void test1() {
    NumberComparisonService victim = new NumberComparisonService();
    boolean expectedResult = true;
    boolean actualResult = victim.isEqual(10, 10);

    if (expectedResult == actualResult) { System.out.println("Test 1 has passed"); }
    else { System.out.println("Test 1 has failed");
           System.out.println("Expected result: " + expectedResult + " but was: " + actualResult); } }
}
