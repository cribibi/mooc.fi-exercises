package week7.exercise7dictionary;

import java.util.Scanner;

public class TextUserInterface {
    Scanner reader;
    Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");
        while (true) {
            System.out.print("\nStatement: ");
            String comanda = reader.nextLine();
            if (comanda.equalsIgnoreCase("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (comanda.equalsIgnoreCase("add")) {
                System.out.print("In Finnish: ");
                String cuv1=reader.nextLine();
                System.out.print("Translation in English: ");
                String cuv2=reader.nextLine();
                add(cuv1, cuv2);
            } else if (comanda.equalsIgnoreCase("translate")) {
                System.out.print("Give a word in Finish: ");
                String cuvTradus=reader.nextLine();
                System.out.print("Translation to English: ");
                System.out.println(translate(cuvTradus));
            } else {
                System.out.println("Unknown statement. Try again");
            }
        }
    }

    public void add(String word, String translation) {
        dictionary.stringMap.put(word, translation);
    }

    public String translate(String word) {
        if (dictionary.stringMap.containsKey(word)) {
            return dictionary.stringMap.get(word);
        } else return null;
    }

}
