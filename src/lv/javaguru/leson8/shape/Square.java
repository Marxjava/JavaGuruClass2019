package lv.javaguru.leson8.shape;

public class Square extends Shape implements Edgable {

    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int edgeCount() {
        return 4;
    }

    @Override
    double area() {
        return Math.pow(sideLength, 2);
    }

    @Override
    double perimeter() {
        return sideLength * edgeCount();
    }
}
