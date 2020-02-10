package week6.exercise105guessinggameNeterminat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        System.out.println(game.isGreaterThan(32));
        System.out.println(game.average(3, 4));
        System.out.println(game.average(6, 12));


// we play two rounds
        game.play(1, 10);  // value to be guessed now within range 1-10
        game.play(10, 99);  // value to be guessed now within range 10-99
    }


}
