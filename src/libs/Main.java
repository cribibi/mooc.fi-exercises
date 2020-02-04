package libs;


import libs.HangmanUserInterface;
import week4.exercise83hangmanlogic.HangmanLogic;

public class Main {
        public static void main(String[] args) {
            week4.exercise83hangmanlogic.HangmanLogic logic = new HangmanLogic("parameter");
            HangmanUserInterface game = new HangmanUserInterface(logic);
            game.start();
        }
    }
