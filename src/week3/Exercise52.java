package week3;

import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Type your name: ");
        String name=scanner.nextLine();
        int a=name.length()-1;
        while (a>=0){
            System.out.print(name.charAt(a));
            a=a-1;
        }
    }
}
