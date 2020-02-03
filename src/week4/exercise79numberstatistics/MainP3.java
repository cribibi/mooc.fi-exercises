package week4.exercise79numberstatistics;

import java.util.Scanner;

public class MainP3 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type numbers: ");

        while (true) {
            int no1 = Integer.parseInt(scanner.nextLine());
            if (no1 == -1) {
                break;
            } else {
                stats.addNumber(no1);
            }
        }
        System.out.println("sum: " + stats.sum());
    }
}
