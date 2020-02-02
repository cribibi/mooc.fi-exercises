package week1;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner sc=new Scanner(System.in);
        int nr1=sc.nextInt();
        String type;

        if (nr1%2==0){
            type="even";
        }else{
            type="odd";
        }
        System.out.printf("Number %d is %s.", nr1, type);
    }
}
