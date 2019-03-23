package lv.javaguru.leson3;

public class DogTest {
    public static void main(String[] args) {
        Dog flufy = new Dog();

        flufy.setName("Flufy");
        flufy.setAge(3);
        flufy.setColor("white");

        flufy.eat();
        flufy.sleep();
        flufy.voice();

        System.out.println("My ");
    }
}
