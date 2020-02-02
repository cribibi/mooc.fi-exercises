package week3;

import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Type a word: ");
        String name=scanner.nextLine();
        System.out.print("Length of the first part: ");
        int length=Integer.parseInt(scanner.nextLine());

        String substr=name.substring(0, length);
        System.out.println("Result: " + substr);

    }
}
