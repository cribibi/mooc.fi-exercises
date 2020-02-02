package week2;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many times would you like to print? ");
        int t=Integer.parseInt(scanner.nextLine());

//        for (int i = 0; i <t ; i++) {
//            printText();
//
//        }

        int i=0;
        while(i<t){
            printText();
            i+=1;
        }
    }

        public static void printText(){
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}

