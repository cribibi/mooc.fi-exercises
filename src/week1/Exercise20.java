package week1;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        String username1="alex";
        String password1="mightyducks";
        String total1=username1+password1;
        String username2="emily";
        String password2="cat";
        String total2=username2+password2;

        System.out.print("Type your username: ");
        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        System.out.print("Type your password ");
        sc=new Scanner(System.in);
        String password=sc.next();
        String total=username+password;

        if (total.equals(total1)||(total.equals(total2))){
            System.out.println("You are now logged into the system!");
        }else{
            System.out.println("Your username or password was invalid!");
        }


    }
}
