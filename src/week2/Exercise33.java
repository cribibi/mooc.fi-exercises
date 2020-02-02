package week2;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("First: ");
        int first=Integer.parseInt(scanner.nextLine());
        System.out.print("Last: ");
        int last=Integer.parseInt(scanner.nextLine());
        int sum=0;
        while (first<=last){
            sum+=first;
            first+=1;
        }
        System.out.println("Sum is " + sum);
    }
}
