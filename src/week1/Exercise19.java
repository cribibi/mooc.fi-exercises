package week1;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        System.out.print("How old are you? ");
        Scanner sc=new Scanner(System.in);
        int nr1=sc.nextInt();
        if ((nr1<0)||(nr1>120)){
            System.out.println("Impossible");
        }else{
            System.out.println("OK");
        }

    }
}
