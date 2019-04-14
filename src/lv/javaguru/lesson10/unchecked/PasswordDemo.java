package lv.javaguru.lesson10.unchecked;

public class PasswordDemo {

    public static void main(String[] args) {

        Password qwerty = new Password("qwerty");
        System.out.println(qwerty);

        Password nullPassword = new Password(null);
        System.out.println(nullPassword);

        System.out.println(qwerty.getMaskedValue());
        System.out.println(nullPassword.getMaskedValue());

    }

}
