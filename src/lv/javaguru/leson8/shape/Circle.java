package lv.javaguru.leson8.shape;

public class Circle extends Shape implements Roundable {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double radius() {
        return radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
