package week6.exercise105guessinggame;

import java.util.Scanner;

public class GuessingGame {
    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        System.out.println("Think of a number between " + lowerLimit + "..." +
                upperLimit);
        System.out.println("I promise you that I can guess the number you are thinking of with "+ 7 +" questions." +
                "\n" +
                "Next I'll present you with a series of questions. Answer them honestly.");
        while (lowerLimit != upperLimit) {
            if (isGreaterThan(average(lowerLimit, upperLimit)) == true) {
                lowerLimit = average(lowerLimit, upperLimit)+1;
            } else {
                upperLimit = average(lowerLimit, upperLimit);
            }
        }
        System.out.println("the number you are thinking of is: " + lowerLimit);
    }

    public static boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + " ? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        if (sc.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int average(int firstNumber, int secondNumber) {

        return ((firstNumber + secondNumber) / 2);
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }


}

