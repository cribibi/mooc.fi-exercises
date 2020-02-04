package week2.exercise41GuessingNumbers;

import java.util.Random;
import java.util.Scanner;

public class Exercise41p3 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number: ");
        int guess = Integer.parseInt(scanner.nextLine());
        counter += 1;
        int no = drawNumber(100);

        while (true) {
            if (guess == no) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (guess > no) {
                System.out.print("The number is lesser. ");
                System.out.println("Guesses made " + counter);
                System.out.print("Guess a number: ");
                guess = Integer.parseInt(scanner.nextLine());
                counter += 1;
            } else {
                System.out.print("The number is greater. ");
                System.out.println("Guesses made " + counter);
                System.out.print("Guess a number: ");
                guess = Integer.parseInt(scanner.nextLine());
                counter += 1;

            }
        }

        //System.out.println("The number is: "+ no);
    }

    public static int drawNumber(int max) {
        Random rand = new Random();
        int no = rand.nextInt(max + 1);
        return no;
    }
}
