package lv.javaguru.tests4;

public class NoiseLevelDetectorTest {
    public static void main(String[] args) {
        NoiseLevelDetectorTest test = new NoiseLevelDetectorTest();
        test.shouldDetectJackHammer();
        test.shouldDetectGasLawnmower();
        test.shouldDetectAlarmClock();
        test.shouldDetectQuietRoom();
    }

    public void shouldDetectJackHammer() {
        NoiseLevelDetector detector = new NoiseLevelDetector();
        String result = detector.detect(300);
        compareResult (result.equals("Jackhammer"), "shouldDetectJackhammer");
    }

    public void shouldDetectGasLawnmower() {
        NoiseLevelDetector detector = new NoiseLevelDetector();
        String result = detector.detect(100);
        compareResult (result.equals("Gas lawnmower"), "shouldDetectGasLawnmower");
    }

    public void shouldDetectAlarmClock() {
        NoiseLevelDetector detector = new NoiseLevelDetector();
        String result = detector.detect(50);
        compareResult (result.equals("Alarm clock"), "shouldDetectAlarmClock");
    }

    public void shouldDetectQuietRoom() {
        NoiseLevelDetector detector = new NoiseLevelDetector();
        String result = detector.detect(31);
        compareResult (result.equals("Quiet room"), "shouldDetectQuietRoom");
    }

    void compareResult (boolean result, String testName) {
        if (result) { System.out.println(testName + " OK");}
        else { System.out.println(testName + " FAIL");}
        }
}
