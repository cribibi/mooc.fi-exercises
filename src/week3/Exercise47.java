package week3;

import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        int n = calculateCharacters(name);
        System.out.println("Number of characters: " + n);
    }

    public static int calculateCharacters(String name) {
        int i = name.length();
        return i;
    }


}
