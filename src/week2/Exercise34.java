package week2;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Type a number: ");
        int n=Integer.parseInt(scanner.nextLine());
        int i=1;
        int factorial=1;
        while (i<=n){
            factorial*=i;
            i+=1;
        }
        System.out.println("Factorial is " + factorial);
    }
}
