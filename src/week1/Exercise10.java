package week1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.print("Type the radius: ");
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        System.out.println("The circumference is: "+ 2*Math.PI*radius);

    }
}
