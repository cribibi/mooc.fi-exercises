package week2;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        System.out.print("Type the first number: ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.print("Type the second number: ");
        read = reader.nextInt();
        sum = sum + read;
        System.out.print("Type the third number: ");
        read = reader.nextInt();
        sum = sum + read;
        // WRITE YOUR PROGRAM HERE
        // USE ONLY THE VARIABLES sum, reader AND read!
        System.out.println("\nSum: " + sum);
    }
}
