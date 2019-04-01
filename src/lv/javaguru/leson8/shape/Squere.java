package lv.javaguru.leson8.shape;

public class Squere extends Shape implements Edgable {

    private final double sideLenght;

    public Squere(double sideLenght) {
        this.sideLenght = sideLenght;
    }


    @Override
    public int edgeCount() {
        return 4;
    }

    @Override
    double area() {
        return Math.pow(sideLenght, 2);
    }

    @Override
    double perimeter() {
        return sideLenght * edgeCount();
    }
}
