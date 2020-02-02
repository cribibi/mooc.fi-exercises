package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise58 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner word = new Scanner(System.in);

        while (true) {
            System.out.print("Type a word: ");
            String text = word.nextLine();
            if (words.contains(text)) {
                System.out.printf("You typed the word %s twice",text);
                break;
            } else {
                words.add(text);
            }
        }
    }

}
