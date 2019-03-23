package lv.javaguru.leson4HomeWork;

public class StockTest {

    public static void main(String[] args) {

        Stock ibm = new Stock("IBM", 150);
        Stock intel = new Stock("Intel", 100);

        ibm.printInformation();
        intel.printInformation();

        ibm.updatePrice(150.37);
        intel.updatePrice(110.10);
        ibm.updatePrice(149.82);
        intel.updatePrice(90.90);
        ibm.updatePrice(150.12);
        intel.updatePrice(100.50);

        ibm.printInformation();
        intel.printInformation();

    }
}
