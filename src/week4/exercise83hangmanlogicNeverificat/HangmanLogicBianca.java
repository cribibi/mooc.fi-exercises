package week4.exercise83hangmanlogicNeverificat;

public class HangmanLogicBianca {
    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogicBianca(String word) {
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
        if (guessedLetters.contains(letter) == true) {
            //daca avem deja litera in guessed words nu o adaugam
        } else if (word.contains(letter)) {
            //daca nu o avem si e litera buna o adaugam
            guessedLetters = guessedLetters + letter;

        } else {
            //daca nu o avem si nu e o litera buna o adaugam si crestem nr erorilor
            numberOfFaults = numberOfFaults + 1;
            guessedLetters = guessedLetters + letter;
        }
    }

    //folosind Stringuri
    public String hiddenWord() {
        String hiddenWord = word.replaceAll("[aA-zZ]", "_");
        String hiddenWord2 = hiddenWord;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < guessedLetters.length(); j++) {
                Character c1 = word.charAt(i);
                Character c2 = guessedLetters.charAt(j);
                if (c1.equals(c2)) {
                    hiddenWord2 = hiddenWord2.substring(0, i) + word.charAt(i) + hiddenWord.substring(i + 1);
                }
            }
        }
        return hiddenWord2;
    }


    //folosind char
    public String hiddenWord2() {
        String hiddenWord = word.replaceAll("[aA-zZ]", "_");
        char[] hiddenWord2 = hiddenWord.toCharArray();
        char[] word2 = word.toCharArray();
        char[] guessedLetters2 = guessedLetters.toCharArray();

        for (int i = 0; i < word2.length; i++) {
            for (int j = 0; j < guessedLetters2.length; j++) {
                Character c1 = word2[i];
                Character c2 = guessedLetters2[j];
                if (c1.equals(c2)) {
                    hiddenWord2[i] = word2[i];
                }
            }
        }
        return String.valueOf(hiddenWord2);
    }
}
