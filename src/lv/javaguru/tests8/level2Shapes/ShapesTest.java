package lv.javaguru.tests8.level2Shapes;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static jdk.nashorn.internal.objects.Global.print;

public class ShapesTest {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Rectangular rectangular = new Rectangular(3, 4);
        Rhombus rhombus = new Rhombus(4, 6);
        Square square = new Square(5);
        Triangle triangle = new Triangle(4, 5, 7);

        AbstractShape[] myShapes = {circle, rectangular, rhombus, square, triangle};

        //print1(myShapes);
        print2(myShapes);
    }

    private static void print2(AbstractShape[] myShapes) {
        for (AbstractShape shape : myShapes) {
            print2(shape);
        }
    }

    private static void print2(AbstractShape shape) {
        System.out.println("================================" + shape);
    }

    private static void print1(AbstractShape[] myShapes) {
        for (AbstractShape shape : myShapes) {
            System.out.println("==============================");
            System.out.println(shape.getName());
            System.out.println(round(shape.getArea()));
            System.out.println(shape.edgeCount());
            System.out.println(round(shape.perimeter()));
        }
    }

    private static double round(double value) {
        return new BigDecimal(value,
                new MathContext(4, RoundingMode.HALF_DOWN))
                .doubleValue();
    }
}
