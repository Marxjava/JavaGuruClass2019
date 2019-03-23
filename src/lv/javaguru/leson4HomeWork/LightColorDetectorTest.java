package lv.javaguru.leson4HomeWork;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();

        test.shouldDetectVioletColor();
        test.shouldDetectBlueColor();
        test.shouldDetectGreenColor();
        test.shouldDetectYellowColor();
        test.shouldDetectOrangeColor();
        test.shouldDetectRedColor();
        test.shouldDetectNoColor();
    }

    public void shouldDetectVioletColor () {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(400);
        compareResult((result.equals("Violēta krāsa")), "shouldDetectVioletColor");
    }

    public void shouldDetectBlueColor () {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(460);
        compareResult((result.equals("Zilā krāsa")), "shouldDetectBlueColor");
    }

    public void shouldDetectGreenColor () {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(560);
        compareResult((result.equals("Zaļā krāsa")), "shouldDetectGreenColor");
    }

    public void shouldDetectYellowColor () {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(580);
        compareResult((result.equals("Dzeltenā krāsa")), "shouldDetectYellowColor");
    }

    public void shouldDetectOrangeColor () {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(600);
        compareResult((result.equals("Oranžā krāsa")), "shouldDetectOrangeColor");
    }

    public void shouldDetectRedColor () {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(650);
        compareResult((result.equals("Sarkanā krāsa")), "shouldDetectRedColor");
    }

    public void shouldDetectNoColor () {
        LightColorDetector colorDetector = new LightColorDetector();
        String result = colorDetector.detect(800);
        compareResult((result.equals("Gaisma nav redazma")), "shouldDetectNoColor");
    }

    public void compareResult (boolean result, String testName) {
        if (result) {System.out.println(testName + " OK");}
        else {System.out.println(testName + " FAIL");}
    }
}
