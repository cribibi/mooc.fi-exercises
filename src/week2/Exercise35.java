package week2;

import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = Integer.parseInt(scanner.nextLine());

        int i = 0;
        int result = 0;
        while (i <= n) {
            result += (int) Math.pow(2, i);
            i += 1;
        }
        System.out.println("The result is " + result);
    }
}
