package week3;

import java.util.Scanner;

public class Exercise50v2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Type your name: ");
        String name=scanner.nextLine();
        if (name.length()>3){
        char litera1=name.charAt(0);
        System.out.println("1. character "+litera1);
        char litera2=name.charAt(1);
        System.out.println("2. character "+litera2);
        char litera3=name.charAt(2);
        System.out.println("3. character "+litera3);
        }

    }

}
