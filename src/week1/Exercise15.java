package week1;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        System.out.print("How old are you? ");
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        if (nr < 18) {
            System.out.println("You have not reached the age of majority yet!");
        } else {
            System.out.println("You have reached the age of majority!");
        }
    }
}