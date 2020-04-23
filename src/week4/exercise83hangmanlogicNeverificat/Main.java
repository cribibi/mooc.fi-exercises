package week4.exercise83hangmanlogicNeverificat;

public class Main {
    public static void main(String[] args) {
        HangmanLogicBianca hangmanLogicBianca = new HangmanLogicBianca("kissa");
        System.out.println("the word is: " + hangmanLogicBianca.hiddenWord2());
        System.out.println("guessing: A, D, S, F, D");
        hangmanLogicBianca.guessLetter("A");
        hangmanLogicBianca.guessLetter("D");
        hangmanLogicBianca.guessLetter("S");
        hangmanLogicBianca.guessLetter("F");
        hangmanLogicBianca.guessLetter("D");

        System.out.println("guessed letters: " + hangmanLogicBianca.guessedLetters());
        System.out.println("number of faults: " + hangmanLogicBianca.numberOfFaults());
        System.out.println("word now: " + hangmanLogicBianca.hiddenWord2());


        //aici am eroare, trebuie verificat de ce nu merge
//        HangmanUserInterface game = new HangmanUserInterface(hangmanLogicBianca);
//        game.start();
    }
}
