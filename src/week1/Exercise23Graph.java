package week1;

import libs.Graph;

import java.util.Scanner;


public class Exercise23Graph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give value: ");
            double value = Double.parseDouble(scanner.nextLine());
            if ((value >= -30) && (value <= 40)) {
                Graph.addNumber(value);
            }
        }
    }
}
