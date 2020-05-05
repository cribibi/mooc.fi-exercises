package week7.exercise7dictionary;

import java.util.Scanner;

public class Main45 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();

    }
}
