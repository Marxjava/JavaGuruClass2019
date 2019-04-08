package lv.javaguru.lesson9Homework.levle4;

import java.math.BigDecimal;

public class Product {

    private final String name;
    private final BigDecimal price;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = BigDecimal.valueOf(price);
    }

    @Override
    public String toString() {
        return "\nProduct is: " + name + ", the price is: " + price;
    }
}
