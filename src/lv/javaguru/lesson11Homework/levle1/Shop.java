package lv.javaguru.lesson11Homework.levle1;

import javax.swing.*;
import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shop {


    private List<Product> products = new ArrayList<>();

//    private Product getProductInfo(int i) {
//        return products.get(i);
//    }

//    private int getProductSize() {
//        return products.size();
//    }

    public void printProductList() {
        System.out.println(products);
    }

    public void add(String name, double price, String category) {
        products.add(new Product(name, price, category));
    }

//    public void addAll(Shop productList) {
//        for (int i = 0; i < productList.getProductSize(); i++) {
//            String name = productList.getProductInfo(i).getName();
//            Double price = productList.getProductInfo(i).getPrice().doubleValue();
//            String category = productList.getProductInfo(i).getCategory();
//            add(name, price, category);
//        }
//    }

    public void deleteProductByName(String productA) {
        Iterator<Product> productName = products.iterator();
        while (productName.hasNext()) {
            Product productB = productName.next();
            if (productB.getName().equals(productA)) {
                productName.remove();
            }
        }

    }

//    public void getProduct(String productA) {
//        Iterator<Product> productName = products.iterator();
//        while (productName.hasNext()) {
//            Product productB = productName.next();
//            if (productB.getName().equals(productA)) {
//                System.out.println("You get: " + productB);
//            }
//        }
//
//    }

    public List<Product> productListInPriceRange(double minPrice, double maxPrice) {
        BigDecimal bMinPrice = BigDecimal.valueOf(minPrice);
        BigDecimal bMaxPrice = BigDecimal.valueOf(maxPrice);
        List<Product> productListInPriceRange = new ArrayList<>();
        Iterator<Product> productName = products.iterator();
        while (productName.hasNext()) {
            Product productA = productName.next();
            if (isInPriceRange(bMinPrice, bMaxPrice, productA)) {
                productListInPriceRange.add(productA);
            }
        }
        return productListInPriceRange;
    }

    public List<Product> productListOfGivenCategory(String category) {
        List<Product> productListInPriceRange = new ArrayList<>();
        Iterator<Product> productName = products.iterator();
        while (productName.hasNext()) {
            Product productA = productName.next();
            if (isOfGivenCategory(category, productA)) {
                productListInPriceRange.add(productA);
            }
        }
        return productListInPriceRange;
    }

    private boolean isOfGivenCategory(String category, Product productA) {
        return category.equals(productA.getCategory());
    }

    private boolean isInPriceRange(BigDecimal MinPrice, BigDecimal MaxPrice, Product product) {
        return (product.getPrice().compareTo(MinPrice) >= 0) && (product.getPrice().compareTo(MaxPrice) <= 0);
    }

    public void saveToFile() {
        File fileName = new File("productList.txt");
        try {
            FileWriter fw = new FileWriter(fileName);
            Writer output = new BufferedWriter(fw);
            int sizeOfProductList = products.size();
            for (int i = 0; i<sizeOfProductList;i++){
                output.write(products.get(i).toString());
            }
            output.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Cannot create the file.");
            e.printStackTrace();
        }
    }

//    public void readFromFile() {
//        String fileName = "productList2.txt";
//        Product line;
//        List<Product> productsRead = new ArrayList<>();
//        try {
//            BufferedReader input = new BufferedReader( new FileReader(fileName));
//            if(!input.ready()){
//                throw new IOException();
//            }
//            while ((line = input.readLine()) !=null){
//                productsRead.add(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
}
