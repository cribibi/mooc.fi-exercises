package week1.exercise22Password;

import java.util.Scanner;

public class Exercise22p3v2 {
    public static void main(String[] args) {
        String goodPassword = "carrot";

        while (true) {
            System.out.print("Type the password: ");
            Scanner sc = new Scanner(System.in);
            String password = sc.next();
            if (password.equals(goodPassword) == true) {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}

