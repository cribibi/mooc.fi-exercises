package week1;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        System.out.print("Type the first number: ");
        Scanner sc=new Scanner(System.in);
        int nr1=sc.nextInt();
        System.out.print("Type the second number: ");
        Scanner sc2=new Scanner(System.in);
        int nr2=sc2.nextInt();
        if (nr1>nr2){
            System.out.println("\nGreater number: "+nr1);
        }else if(nr1<nr2){
            System.out.println("\nGreater number: "+nr2);
        }else {
            System.out.println("\nThe numbers are equal!");
        }
    }
}
