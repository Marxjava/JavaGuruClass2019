package lv.javaguru.tests8.level2Shapes;

public class Rectangular extends AbstractShape {

    private final double sideA, sideB;

    public Rectangular(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    int edgeCount() {
        return 4;
    }

    @Override
    double perimeter() {
        return (sideA+sideB)*2;
    }

    @Override
    public String getName() {
        return "Rectangular";
    }

    @Override
    public double getArea() {
        return sideA*sideB;
    }
}
