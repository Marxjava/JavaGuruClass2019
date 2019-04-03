package lv.javaguru.tests8.level2Shapes;

public class Rhombus extends AbstractShape {

    private final double diagonalA, diagonalB;

    public Rhombus(double diagonalA, double diagonalB) {
        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
    }

    @Override
    int edgeCount() {
        return 4;
    }

    @Override
    double perimeter() {
        return 4*Math.sqrt(Math.pow(diagonalA/2,2)+Math.pow(diagonalB/2,2));
    }

    @Override
    public String getName() {
        return "Rhombus";
    }

    @Override
    public double getArea() {
        return diagonalA*diagonalB/2;
    }
}
