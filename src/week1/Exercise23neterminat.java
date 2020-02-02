package week1;

import libs.Graph;

import java.util.Scanner;


public class Exercise23neterminat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give value: ");
            double value = Double.parseDouble(scanner.nextLine());
            Graph.addNumber(value);
            if ((value < -30) || (value > 40)) {
                break;
            }
        }//hghfgf
    }
}
