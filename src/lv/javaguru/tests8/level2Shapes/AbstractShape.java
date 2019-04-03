package lv.javaguru.tests8.level2Shapes;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class AbstractShape implements Shape {

    abstract int edgeCount();
    abstract double perimeter();
    @Override
    public String toString() {
        return "\nMy name is " + getName()
                + "\nMy area is " + round(getArea());
    }

    private double round(double value) {
        return new BigDecimal(value,
                new MathContext(4, RoundingMode.HALF_DOWN))
                .doubleValue();
    }
}
