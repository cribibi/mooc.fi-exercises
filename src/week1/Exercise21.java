package week1;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {
        System.out.print("Type a year: ");
        Scanner sc = new Scanner(System.in);
        int nr1 = sc.nextInt();

        if ((nr1 % 4 == 0) && (nr1 % 100 == 0) && (nr1 % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else if ((nr1 % 4 == 0) && (nr1 % 100 != 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }
    }
}
