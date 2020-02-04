package week2.exercise36;

import java.util.Scanner;

public class Exercise36p5 {
    public static void main(String[] args) {
        int sum = 0;
        int odd = 0;
        int even = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type numbers: ");

        while (true) {
            int no = Integer.parseInt(scanner.nextLine());
            if (no == -1) {
                break;
            } else {
                sum = sum + no;
                counter = counter + 1;
                if (no % 2 == 0) {
                    even = even + 1;

                } else {
                    odd = odd + 1;
                }
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("The average is: " + (double) sum / counter);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}

