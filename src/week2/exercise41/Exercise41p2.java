package week2.exercise41;

import java.util.Random;
import java.util.Scanner;

public class Exercise41p2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Guess a number: ");
        int guess=Integer.parseInt(scanner.nextLine());
        int no=drawNumber(100);

        while (true){
        if (guess==no){
            System.out.println("Congratulations, your guess is correct!");
            break;
        }else if (guess>no){
            System.out.println("The number is lesser.");
            System.out.print("Guess a number: ");
            guess=Integer.parseInt(scanner.nextLine());
        }else{
            System.out.println("The number is greater.");
            System.out.print("Guess a number: ");
            guess=Integer.parseInt(scanner.nextLine());
        }
        }

        //System.out.println("The number is: "+ no);
}
        public static int drawNumber(int max){
            Random rand = new Random();
            int no=rand.nextInt(max+1);
        return no;
        }
}
