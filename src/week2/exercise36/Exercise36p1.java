package week2.exercise36;

import java.util.Scanner;

public class Exercise36p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type numbers: ");
        while (true) {
            int no = Integer.parseInt(scanner.nextLine());
            if (no == -1) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("Thank you and see you later!");
    }
}
