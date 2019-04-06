package lv.javaguru.lesson8.shapes;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class Shape {

    abstract double area();

    abstract double perimeter();

    @Override
    public String toString() {
        return "\nMy perimeter is " + round(perimeter())
                + "\nMy area is " + round(area());
    }

    private double round(double value) {
        return new BigDecimal(value,
                new MathContext(4, RoundingMode.HALF_DOWN))
                .doubleValue();
    }
}
