package lv.javaguru.leson4HomeWork;

public class Stock {

    private String company;
    private double currentValue;
    private double max;
    private double min;

    public Stock (String company, double currentValue){
        this.company = company;
        this.currentValue = currentValue;
        this.max = currentValue;
        this.min = currentValue;
    }

    public String getCompany() {
        return company;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public void updatePrice (double currentPrice) {
        this.currentValue = currentPrice;
        if (currentPrice > this.max) {
            this.max = currentPrice;
        } else if (currentPrice < this.min) {
            this.min = currentPrice;
        }
    }

    public void printInformation() {
        System.out.println("Company name: " + this.company);
        System.out.println("Current value: " + this.currentValue);
        System.out.println("Max: " + this.max);
        System.out.println("Min: " + this.min);
    }
}
