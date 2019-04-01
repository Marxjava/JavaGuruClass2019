package lv.javaguru.leson8.shape;

public class Triangle extends Shape implements Edgable {

    private final double sideA, sideB, sideC, halfP;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        halfP = perimeter()/ 2;
    }


    @Override
    public int edgeCount() {
        return 3;
    }

    @Override
    double area() {
        double halfP = (sideA + sideB + sideC) / 2;
        return Math.sqrt((halfP * (halfP - sideA) )*
                (halfP - sideB) *
                (halfP - sideC));
    }

    @Override
    double perimeter() {
        return sideA+sideB+sideC;
    }
}
