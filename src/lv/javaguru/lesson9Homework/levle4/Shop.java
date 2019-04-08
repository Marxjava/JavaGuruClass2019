package lv.javaguru.lesson9Homework.levle4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shop {


    private List<Product> products = new ArrayList<>();

    private Product getProductInfo(int i) {
        return products.get(i);
    }

    private int getProductSize() {
        return products.size();
    }

    public void printProductList() {
        System.out.println(products);
    }

    public void add(String name, double price) {
        products.add(new Product(name, price));
    }

    public void addAll(Shop productList) {
        for (int i = 0; i < productList.getProductSize(); i++) {
            String name = productList.getProductInfo(i).getName();
            Double price = productList.getProductInfo(i).getPrice().doubleValue();
            add(name, price);
        }
    }

    public void deleteProduct(String productA) {
        Iterator<Product> productName = products.iterator();
        while (productName.hasNext()) {
            Product productB = productName.next();
            if (productB.getName().equals(productA)) {
                productName.remove();
            }
        }

    }

    public void getProduct(String productA) {
        Iterator<Product> productName = products.iterator();
        while (productName.hasNext()) {
            Product productB = productName.next();
            if (productB.getName().equals(productA)) {
                System.out.println("You get: " + productB);
            }
        }

    }

    public void findProduct(double minPrice, double maxPrice) {
        BigDecimal bMinPrice = BigDecimal.valueOf(minPrice);
        BigDecimal bMaxPrice = BigDecimal.valueOf(maxPrice);
        Iterator<Product> productName = products.iterator();
        while (productName.hasNext()) {
            Product productB = productName.next();
            if (isInPricerange(bMinPrice, bMaxPrice, productB)) {
                System.out.println("In this price range ( " + minPrice + " - " + maxPrice + " ) is: " + productB + "\n");
            }
        }
    }

    private boolean isInPricerange(BigDecimal bMinPrice, BigDecimal bMaxPrice, Product productB) {
        return (productB.getPrice().compareTo(bMinPrice) >= 0) && (productB.getPrice().compareTo(bMaxPrice) <= 0);
    }
}
