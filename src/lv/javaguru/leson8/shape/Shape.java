package lv.javaguru.leson8.shape;

public abstract class Shape {

    abstract double area ();
    abstract double perimeter ();

    @Override
    public String toString() {
        return "\nMy perimeter is " + perimeter()
                +"\nMy are is " + area();
    }

}
