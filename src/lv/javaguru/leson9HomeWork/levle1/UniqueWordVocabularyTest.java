package lv.javaguru.leson9HomeWork.levle1;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabularyTest {

    public static void main(String[] args) {

        Set<String> vocabulary = new HashSet<>();
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

        uniqueWordVocabulary.addWord(vocabulary, "Audi");
        uniqueWordVocabulary.addWord(vocabulary, "Mercedes");
        uniqueWordVocabulary.addWord(vocabulary, "Toyota");
        uniqueWordVocabulary.addWord(vocabulary, "Nisan");
        uniqueWordVocabulary.addWord(vocabulary, "Tesla");

        System.out.println("The size of vocabulary is: " + uniqueWordVocabulary.getUniqueWordCount(vocabulary));
        uniqueWordVocabulary.printToConsole(vocabulary);

        uniqueWordVocabulary.addWord(vocabulary, "BMW");
        System.out.println("\n The size of vocabulary is: " + uniqueWordVocabulary.getUniqueWordCount(vocabulary));
        uniqueWordVocabulary.printToConsole(vocabulary);


    }
}
