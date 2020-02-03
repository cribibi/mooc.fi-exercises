package week1.exercise22Password;

import java.util.Scanner;

public class Exercise22p3 {
    public static void main(String[] args) {
        String goodPassword="carrot";
        System.out.print("Type the password: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        if (password.equals(goodPassword)==true) {
            System.out.println("Right!");
            System.out.println("The secret is: jryy qbar!");
        }else{
        while (password.equals(goodPassword)==false) {
            System.out.println("Wrong!");
            System.out.print("Type the password: ");
            sc = new Scanner(System.in);
            password = sc.next();
        }   System.out.println("Right!");
            System.out.println("The secret is: jryy qbar!");


        }
    }
}
