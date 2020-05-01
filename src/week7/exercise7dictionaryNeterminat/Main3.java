package week7.exercise7dictionaryNeterminat;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {

        Dictionary wordPairs = new Dictionary();
        wordPairs.add("apina", "monkey");
        wordPairs.add("banaani", "banana");
        wordPairs.add("cembalo", "harpsichord");

        ArrayList<String> translations = wordPairs.translationList();
        for (String translation : translations) {
            System.out.println(translation);

        }
    }
}
