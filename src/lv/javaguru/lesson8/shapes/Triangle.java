package lv.javaguru.lesson8.shapes;

public class Triangle extends Shape implements Edgable {

    private final double sideA, sideB, sideC, halfPerimeter;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        halfPerimeter = perimeter() / 2;
    }

    @Override
    public int edgeCount() {
        return 3;
    }

    @Override
    double area() {
        return Math.sqrt(halfPerimeter
                * (halfPerimeter - sideA)
                * (halfPerimeter - sideB)
                * (halfPerimeter - sideC));
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC;
    }
}
