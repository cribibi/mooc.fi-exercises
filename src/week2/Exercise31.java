package week2;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("first? ");
        int first=Integer.parseInt(scanner.nextLine());
        System.out.print("last? ");
        int last=Integer.parseInt(scanner.nextLine());

        while(first<=last){
            System.out.println(first);
            first=first+1;
        }

    }
}
