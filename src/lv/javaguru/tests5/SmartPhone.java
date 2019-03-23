package lv.javaguru.tests5;

import java.util.Objects;

public class SmartPhone {
    private String manufacturer;
    private String color;
    private String processorType;
    private Double screenSize;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return Objects.equals(manufacturer,that.manufacturer)&&
               Objects.equals(color,that.color)&&
               Objects.equals(processorType,that.processorType)&&
               Objects.equals(screenSize,that.screenSize);
    }

    @Override
    public String toString(){
        return "SmartPhone{" +
               "manufacturer=" + manufacturer +
               ", color=" + color +
               ", procesorType=" + processorType +
               ", screenSize=" + screenSize +
                "}";
    }
}
