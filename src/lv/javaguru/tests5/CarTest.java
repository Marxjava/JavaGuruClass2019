package lv.javaguru.tests5;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        Car car2 = car1;
        Car car3 = new Car("BMW");

        System.out.println(car1 == car1);
        System.out.println(car1 == car2);
        System.out.println(car1 == car3);
        System.out.println(" ");
        System.out.println(car1.equals(car1));
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));

    }
}

