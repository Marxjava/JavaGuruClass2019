package lv.javaguru.leson4HomeWork;

public class DogAgeCalculatorTest {

    public static void main(String[] args) {

        DogAgeCalculatorTest test = new DogAgeCalculatorTest();

        test.shouldDetectHumanAge15();
        test.shouldDetectHumanAge24();
        test.shouldDetectHumanAge28();
        test.shouldDetectHumanAge32();
        test.shouldDetectHumanAge40();

        test.shouldDetectDogAge0();
        test.shouldDetectDogAge1();
        test.shouldDetectDogAge2();
        test.shouldDetectDogAge3();
        test.shouldDetectDogAge6();
        test.shouldDetectDogAge7();
    }

    public void shouldDetectHumanAge15() {
        DogAgeCalculator ageCalculator = new DogAgeCalculator();
        int result = ageCalculator.convertDogAgeToHumanAge(1);
        compareResult((result == 15), "shouldDetectHumanAge15");
    }

    public void shouldDetectHumanAge24() {
        DogAgeCalculator ageCalculator = new DogAgeCalculator();
        int result = ageCalculator.convertDogAgeToHumanAge(2);
        compareResult((result == 24), "shouldDetectHumanAge24");
    }

    public void shouldDetectHumanAge28() {
        DogAgeCalculator ageCalculator = new DogAgeCalculator();
        int result = ageCalculator.convertDogAgeToHumanAge(3);
        compareResult((result == 28), "shouldDetectHumanAge28");
    }

    public void shouldDetectHumanAge32() {
        DogAgeCalculator ageCalculator = new DogAgeCalculator();
        int result = ageCalculator.convertDogAgeToHumanAge(4);
        compareResult((result == 32), "shouldDetectHumanAge32");
    }

    public void shouldDetectHumanAge40() {
        DogAgeCalculator ageCalculator = new DogAgeCalculator();
        int result = ageCalculator.convertDogAgeToHumanAge(6);
        compareResult((result == 40), "shouldDetectHumanAge40");
    }

    public void shouldDetectDogAge0() {
        DogAgeCalculator ageCalculator = new DogAgeCalculator();
        int result = ageCalculator.convertHumanAgeToDogAge(5);
        compareResult((result == 0), "shouldDetectHumanAge0");
    }

    public void shouldDetectDogAge1() {
        DogAgeCalculator ageCalculator = new DogAgeCalculator();
        int result = ageCalculator.convertHumanAgeToDogAge(20);
        compareResult((result == 1), "shouldDetectHumanAge1");
    }

    public void shouldDetectDogAge2() {
        DogAgeCalculator ageCalculator = new DogAgeCalculator();
        int result = ageCalculator.convertHumanAgeToDogAge(26);
        compareResult((result == 2), "shouldDetectHumanAge2");
    }

    public void shouldDetectDogAge3() {
        DogAgeCalculator ageCalculator = new DogAgeCalculator();
        int result = ageCalculator.convertHumanAgeToDogAge(30);
        compareResult((result == 3), "shouldDetectHumanAge3");
    }

    public void shouldDetectDogAge6() {
        DogAgeCalculator ageCalculator = new DogAgeCalculator();
        int result = ageCalculator.convertHumanAgeToDogAge(43);
        compareResult((result == 6), "shouldDetectHumanAge6");
    }

    public void shouldDetectDogAge7() {
        DogAgeCalculator ageCalculator = new DogAgeCalculator();
        int result = ageCalculator.convertHumanAgeToDogAge(44);
        compareResult((result == 7), "shouldDetectHumanAge7");
    }

    void compareResult (boolean result, String testName) {
        if (result) { System.out.println(testName + " OK");}
        else { System.out.println(testName + " FAIL");}
    }
}
