package week1;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        if (nr>0){
            System.out.println("The number is positive");
        }else if(nr<0){
            System.out.println("The number is not positive");
        }else{
            System.out.println("The number is zero");
        }
    }
}