package lv.javaguru.lesson9Homework.levle2;

import java.util.Map;

public class UniqueWordCounter {

    public static void addWord(Map<String, Integer> uniqueWordCounter, String word) {
        if (uniqueWordCounter.containsKey(word)) {
            Integer wordCount = uniqueWordCounter.get(word);
            uniqueWordCounter.put(word, wordCount + 1);
        } else {
            uniqueWordCounter.put(word, 1);
        }
    }

    public void printToConsole(Map<String, Integer> vocabulary) {
        System.out.println(vocabulary);
    }

    public void printMoustUsedword(Map<String, Integer> vocabulary) {
        System.out.println(vocabulary);
    }

    public void findMostUsedWord(Map<String, Integer> vocabulary) {
        Integer maxWordCount = 0;
        String mostUsedWord = "";
        for (Map.Entry<String, Integer> entry : vocabulary.entrySet()) {
            String word = entry.getKey();
            Integer wordCount = entry.getValue();
            if (wordCount > maxWordCount) {
                mostUsedWord = word;
                maxWordCount = wordCount;
            }
        }
        System.out.println(mostUsedWord);
    }
}
