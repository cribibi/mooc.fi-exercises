package week4.exercise81passwordrandomizer;

import java.util.Random;

public class PasswordRandomizer {
    int length;
    Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String password = new String();
        for (int i = 0; i < length; i++) {
            int number = 1 + random.nextInt(length);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password = password + symbol;
        }
        return password;


    }
}
