package lv.javaguru.tests8.level2Shapes;

public class Square extends AbstractShape {

    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    int edgeCount() {
        return 4;
    }

    @Override
    double perimeter() {
        return sideLength * edgeCount();
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return Math.pow(sideLength, 2);
    }
}
