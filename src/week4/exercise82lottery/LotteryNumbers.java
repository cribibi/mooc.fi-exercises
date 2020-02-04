package week4.exercise82lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    Random random = new Random();

    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        for (int i = 0; i < 7; i++) {
            int rand = 1 + random.nextInt(39);
            if (containsNumber(rand) == false) {
                numbers.add(rand);
                // Write the number drawing here using the method containsNumber()
            } else {
                i--;
            }
        }
    }

    public boolean containsNumber(int number) {
        if (numbers.contains(number)) {
            // Test here if the number is already among the drawn numbers
            return true;
        } else {
            return false;
        }

    }
}

