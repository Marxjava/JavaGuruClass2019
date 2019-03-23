package lv.javaguru.leson4HomeWork;

import java.util.Scanner;

public class PhraseAnalyserTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");

        String enteredString = scanner.nextLine();

        PhraseAnalyser phraseOne = new PhraseAnalyser();
        System.out.println(enteredString + ": " + phraseOne.analyse(enteredString));
    }
}
