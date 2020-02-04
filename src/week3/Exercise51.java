package week3;

import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = scanner.nextLine();
        int i = 0;
        while (i < name.length()) {
            System.out.println((i + 1) + ". character: " + name.charAt(i));
            i = i + 1;
        }
    }
}
