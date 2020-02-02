package week2;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("up to what number? ");
        int number=Integer.parseInt(scanner.nextLine());
        int i=1;
        while(i<=number){
            System.out.println(i);
            i=i+1;
        }

    }
}
