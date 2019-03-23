package lv.javaguru.leson4HomeWork;

public class SignComparatorTest {

    public void test1 (){
        SignComparator testNumber = new SignComparator();

        int number = 5;

        String expectedResult = "Number is positive";
        String actualResult = testNumber.compare(number);

        check(actualResult, expectedResult, "Test 1 ");
    }
    public void check(String actualResult, String expectedResult, String testName){
        if( actualResult.equals(expectedResult)){
            System.out.println(testName + "has passed!");
        }else {
            System.out.println(testName + "has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }

    public static void main(String[] args) {
        SignComparatorTest testRunner = new SignComparatorTest();
        testRunner.test1();
    }
}
