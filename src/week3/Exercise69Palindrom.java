package week3;

import java.util.Scanner;

public class Exercise69Palindrom {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

    public static boolean palindrome(String text) {
        boolean a = true;
        for (int i = 0; i < ((text.length() / 2)); i++) {
            if (text.charAt(i) == text.charAt(text.length() - 1 - i)) {
                a = true;
            } else {
                a = false;
                break;
            }
        }
        return a;
    }
}
