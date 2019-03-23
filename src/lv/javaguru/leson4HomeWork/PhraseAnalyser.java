package lv.javaguru.leson4HomeWork;

public class PhraseAnalyser {

    public String analyse (String phrase){
        if (phrase.startsWith("Make") && phrase.endsWith("great again")){return "It Stands no change..";}
        else if (phrase.startsWith("Make") || phrase.endsWith("great again")){return "It could be worse";}
        else {return "It is fine, really";}
    }
}
