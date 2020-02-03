package week4.exercise80dice;

import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        int rand = 1+ random.nextInt(numberOfSides);
        return rand;
    }
}
