package week1.exercise22Password;

import java.util.Scanner;

public class Exercise22p1 {
    public static void main(String[] args) {
        String goodPassword="carrot";

        System.out.print("Type the password: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        if (password.equals(goodPassword)){
            System.out.println("Right!");
        }else{
            System.out.println("Wrong!");
        }
    }
}
