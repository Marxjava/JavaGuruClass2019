package lv.javaguru.leson4;

import java.util.Scanner;

public class VowelChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet burtu");

        String enteredString = scanner.next();
        char enterChar = enteredString.charAt(0);

        System.out.println("Ievadītais burts ir: " + isVowel(enterChar));
        System.out.println("Ievadītais burts  ar if_1 ir: " + isVowelWithIf(enterChar));
        System.out.println("Ievadītais burts  ar if 2 ir: " + isVowelWithIfOther(enterChar));
    }

    private static String isVowelWithIfOther(char enterChar) {
        if (enterChar == 'a' || enterChar == 'A' || enterChar == 'e' ||enterChar == 'E' || enterChar == 'i' ||enterChar == 'I' ||enterChar == 'o' || enterChar == 'O' || enterChar == 'u' || enterChar == 'U'){ return "patskanis"; }
        else { return "līdzskanis"; }
    }

    private static String isVowelWithIf(char enterChar) {
        if (enterChar == 'a'){ return "patskanis"; }
        if (enterChar == 'A'){ return "patskanis"; }
        if (enterChar == 'e'){ return "patskanis"; }
        if (enterChar == 'E'){ return "patskanis"; }
        if (enterChar == 'i'){ return "patskanis"; }
        if (enterChar == 'I'){ return "patskanis"; }
        if (enterChar == 'o'){ return "patskanis"; }
        if (enterChar == 'O'){ return "patskanis"; }
        if (enterChar == 'u'){ return "patskanis"; }
        if (enterChar == 'U'){ return "patskanis"; }
        else { return "līdzskanis"; }
    }

    private static String isVowel(char enterChar) {
        switch (enterChar){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return "patskanis";
            default:
                return "līdzskanis";

        }
    }
}
