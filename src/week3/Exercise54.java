package week3;

import java.util.Scanner;

public class Exercise54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a word: ");
        String name = scanner.nextLine();

        System.out.print("Length of the last part: ");
        int noOfCharacters = Integer.parseInt(scanner.nextLine());

        System.out.println("Result: " + name.substring((name.length() - noOfCharacters), name.length()));
        //System.out.println("Result: " + substr);

    }
}
