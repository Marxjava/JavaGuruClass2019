package lv.javaguru.lesson9Homework.levle1;

import java.util.Set;

public class UniqueWordVocabulary {

    public void printToConsole(Set<String> vocabulary) {
        System.out.println(vocabulary);
    }

    public int getUniqueWordCount(Set<String> vocabulary) {
        return vocabulary.size();
    }

    public void addWord(Set<String> vocabulary, String word) {
        vocabulary.add(word);
    }
}
