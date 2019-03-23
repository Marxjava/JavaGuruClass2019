package lv.javaguru.leson5;

public class BasicCounterTest {
    public static void main(String[] args) {
        BasicCounter counter = new BasicCounter();

        counter.increment();
        counter.increment();
        counter.increment();

        counter.setCounter(-99);

        System.out.println(counter.getCounter());
    }
}
