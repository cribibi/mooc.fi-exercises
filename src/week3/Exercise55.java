package week3;

import java.util.Scanner;

public class Exercise55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a word: ");
        String first = scanner.nextLine();

        System.out.print("Type another word: ");
        String second = scanner.nextLine();

        if (first.indexOf(second) != -1) {
            System.out.printf("The word '%s' is found in the word '%s'.", second, first);
        } else {
            System.out.printf("The word '%s' is not found in the word '%s'.", second, first);

        }
    }
}
