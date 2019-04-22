package lv.javaguru.lesson11Homework.levle1;

public class ShopTest {

    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.add("Product1",1.00,"Category1");
        shop.add("Product2",2.00,"Category2");
        shop.add("Product3",3.00,"Category1");
        shop.add("Product4",4.00,"Category2");
        shop.add("Product4",44.00,"Category2");
        shop.add("Product5",5.00,"Category1");
        System.out.println("Main product List");
        shop.printProductList();
        System.out.println();

        shop.saveToFile();

        System.out.println("Deleting: Product3 ");
        shop.deleteProductByName("Product3");
        shop.printProductList();

        System.out.println("Adding: Product3 ");
        shop.add("Product3",3.00,"Category1");
        shop.printProductList();


        System.out.println();
        System.out.println("List products which fit into a given price range: ");
        System.out.println(shop.productListInPriceRange(3.00,7.00));

        System.out.println();
        System.out.println("List products of given category: ");
        System.out.println(shop.productListOfGivenCategory("Category1"));

        shop.saveToFile();


    }
}
