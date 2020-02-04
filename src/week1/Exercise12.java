package week1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        System.out.print("Type your name: ");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        System.out.print("Type your age: ");
        sc = new Scanner(System.in);
        int nr1 = sc.nextInt();

        System.out.print("\nType your name: ");
        sc = new Scanner(System.in);
        String name2 = sc.next();
        System.out.print("Type your age: ");
        sc = new Scanner(System.in);
        int nr2 = sc.nextInt();
        System.out.printf("\n%s and %s are %d years old in total", name1, name2, (nr1 + nr2));
    }
}
