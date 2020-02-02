package week1.exercise22;

import java.util.Scanner;

public class Exercise22p2v2 {
    public static void main(String[] args) {
        String goodPassword="carrot";

        while (true){
            System.out.print("Type the password: ");
            Scanner sc = new Scanner(System.in);
            String password = sc.next();
        if (password.equals(goodPassword)==true) {
            System.out.println("Right!");
            break;
        }else{
            System.out.println("Wrong!");
    }
    }
}
}
