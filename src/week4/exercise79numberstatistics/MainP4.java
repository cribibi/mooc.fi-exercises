package week4.exercise79numberstatistics;

import java.util.Scanner;

public class MainP4 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type numbers: ");

        while (true) {
            int no1 = Integer.parseInt(scanner.nextLine());
            if (no1 == -1) {
                break;
            } else {
                stats.addNumber(no1);
                if (no1 % 2 == 0) {
                    statsEven.addNumber(no1);
                } else {
                    statsOdd.addNumber(no1);
                }
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + statsEven.sum());
        System.out.println("sum of odd: " + statsOdd.sum());

    }
}
