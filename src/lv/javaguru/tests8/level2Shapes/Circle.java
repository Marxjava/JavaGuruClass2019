package lv.javaguru.tests8.level2Shapes;

public class Circle extends AbstractShape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    int edgeCount() {
        return 0;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
