package week2;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Until what? ");
        int n=Integer.parseInt(scanner.nextLine());
        int i=1;
        int sum=0;
        while (i<=n){
            sum+=i;
            i+=1;
        }
        System.out.println("Sum is: " + sum);
    }
}
