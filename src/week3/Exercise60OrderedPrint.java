package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise60OrderedPrint {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner word = new Scanner(System.in);

        while (true) {
            System.out.print("Type a word: ");
            String text = word.nextLine();
            if (text.equals("")) {
                break;
            } else {
                words.add(text);
            }
        }
        printOrdered(words);
    }

    public  static void printOrdered(ArrayList<String> words) {
        Collections.sort(words);
        System.out.println("You typed the following words: ");
        for (String t:words) {
            System.out.println(t);
        }
    }
}


