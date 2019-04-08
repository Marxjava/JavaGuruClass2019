package lv.javaguru.lesson9Homework.levle4;

public class ShopTest {

    public static void main(String[] args) {

        Shop shop = new Shop();
        Shop shop1 = new Shop();

        shop.add("Product1",1.00);
        shop.add("Product2",2.00);
        shop.add("Product3",3.00);
        shop.add("Product4",4.00);
        shop.add("Product4",44.00);
        shop.add("Product5",5.00);
        System.out.println("Main product List");
        shop.printProductList();
        System.out.println();

        shop1.add("Product6",6.00);
        shop1.add("Product7",7.00);
        shop1.add("Product8",8.00);
        System.out.println("Additional product List");
        shop1.printProductList();
        System.out.println();

        shop.addAll(shop1);
        System.out.println("Additional product list added to Main product List");
        shop.printProductList();
        System.out.println();

        System.out.println("Deleting: Product3 ");
        shop.deleteProduct("Product3");
        shop.printProductList();

        System.out.println("Adding: Product3 ");
        shop.add("Product3",3.00);
        shop.printProductList();

        System.out.println();
        System.out.println("Looking for: Product4 ");
        shop.getProduct("Product4");

        System.out.println();
        System.out.println("Looking for Products in Price range: ");
        shop.findProduct(5.00,7.00);


    }
}
