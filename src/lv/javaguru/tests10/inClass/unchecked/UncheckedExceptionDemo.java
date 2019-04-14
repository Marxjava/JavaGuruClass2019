package lv.javaguru.tests10.inClass.unchecked;

public class UncheckedExceptionDemo {

    public static void main(String[] args) {
        String text = getText();
        System.out.println(text.toUpperCase());
    }

    private static String getText() {
        throw new IllegalStateException("Something went wrong");
    }

}
