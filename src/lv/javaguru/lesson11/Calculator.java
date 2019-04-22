package lv.javaguru.lesson11;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Calculator {

    int sum (int a, int b) {
        return a+b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b, new MathContext(3,RoundingMode.HALF_UP)).setScale(2);
    }

    public BigDecimal divide(BigDecimal a, BigDecimal b) {
        return a.divide(b, new MathContext(3,RoundingMode.HALF_UP)).setScale(2);
    }
}
