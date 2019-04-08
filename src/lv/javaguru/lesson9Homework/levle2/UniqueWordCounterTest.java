package lv.javaguru.lesson9Homework.levle2;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounterTest {

    public static void main(String[] args) {

        Map<String,Integer> vocabulary = new HashMap<>();
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();

        uniqueWordCounter.addWord(vocabulary,"apple");
        uniqueWordCounter.addWord(vocabulary,"mango");
        uniqueWordCounter.addWord(vocabulary,"apple");
        uniqueWordCounter.printToConsole(vocabulary);

        uniqueWordCounter.findMostUsedWord(vocabulary);




    }
}
