package week4.exercise83hangmanlogicNeverificat;

public class HangmanLogicP1 {
    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogicP1(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (word.contains(letter)==false){
            numberOfFaults=numberOfFaults+1;
        }else if (guessedLetters.contains(letter)){

        }else {
            guessedLetters=guessedLetters+letter;

        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in the hidden word
        // if the letter is not among the guessed ones, replace it with _ in the hidden word

        // return the hidden word at the end

        return "";
    }
}
