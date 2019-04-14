package lv.javaguru.tests10.inClass.unchecked;


public class Password {

    private String value;

    public Password(String value) {
        if (value == null) {
            throw new IllegalStateException("value can't be null!!!");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getMaskedValue() {
        return value.replaceAll("\\w*", "*");
    }

    @Override
    public String toString() {
        return "Password{" +
                "value='" + value + '\'' +
                '}';
    }
}
