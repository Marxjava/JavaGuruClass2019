package lv.javaguru.lesson10.checked;

import java.io.IOException;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        try {
            String text = getText(10);
            System.out.println("Text: " + text);
            text = getText(2);
        } catch (IOException ex) {
            System.out.println("Failed to get text: " + ex.getMessage());
        } finally {
            System.out.println("This will be always executed");
        }
    }

    private static String getText(int number) throws IOException {
        switch (number) {
            case 1: throw new IOException("Bad luck");
            case 2: throw new IOException("Still Bad luck");
            default: return "You get lucky";
        }

    }

}
