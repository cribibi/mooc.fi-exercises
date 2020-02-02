package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise59ReversePrint {

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
        printReverse(words);
    }

    public static void printReverse(ArrayList<String> words){
        System.out.println("You typed the following words: ");
        for (int i = (words.size()-1); i >-1 ; i--) {
            System.out.println(words.get(i));

        }
        }
    }

