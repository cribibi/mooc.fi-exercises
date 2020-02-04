package week4.exercise83hangmanlogicNeverificat;

public class HangmanLogicP2 {
    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogicP2(String word) {
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
        String hiddenWord= new String();
        for (int j = 0; j <this.word.length() ; j++) {
            for (int i = 0; i <guessedLetters.length() ; i++) {
            if (word.charAt(j)==(guessedLetters.charAt(i))){
                hiddenWord=hiddenWord+word.charAt(j);
            }else hiddenWord=hiddenWord+"_";
            }
        }

        return hiddenWord;
    }
}
