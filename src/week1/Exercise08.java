package week1;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner sc=new Scanner(System.in);
        int nr1=sc.nextInt();
        System.out.print("Type another number: ");
        Scanner sc2=new Scanner(System.in);
        int nr2=sc2.nextInt();

        System.out.println("\nSum of the two numbers: "+ (nr1+nr2));


    }
}
