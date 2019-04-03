package lv.javaguru.tests8.level2Shapes;

public class Triangle extends AbstractShape {

    private final double sideA, sideB, sideC, halfPerimeter;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        halfPerimeter = perimeter() / 2;
    }

    @Override
    int edgeCount() {
        return 3;
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return Math.sqrt(halfPerimeter
                * (halfPerimeter - sideA)
                * (halfPerimeter - sideB)
                * (halfPerimeter - sideC));
    }
}
