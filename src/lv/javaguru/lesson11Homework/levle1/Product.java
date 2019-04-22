package lv.javaguru.lesson11Homework.levle1;

import java.math.BigDecimal;

public class Product {

    private final String name;
    private final BigDecimal price;

    private final String category;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = BigDecimal.valueOf(price);
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product is: " + name + ", the price is: " + price + ", the category is: " + category + "\n";
    }
}
