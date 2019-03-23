package lv.javaguru.leson5;

import java.util.Objects;

public class CandyBox {

    private String name;
    private int amount;

    CandyBox(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return Objects.equals(this.name, candyBox.name)
                && this.amount == candyBox.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    @Override
    public String toString() {
        return "CandyBox: {name: " + name +
                ",  amount: " + amount
                + "}";
    }

}
