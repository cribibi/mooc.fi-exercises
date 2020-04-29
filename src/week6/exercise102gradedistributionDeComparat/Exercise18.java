package week6.exercise102gradedistributionDeComparat;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        System.out.print("Type the points [0-60]: ");
        Scanner sc = new Scanner(System.in);
        int nr1 = sc.nextInt();
        String grade;

        if ((nr1 < 61) && (nr1 > 49)) {
            grade = "5";
        } else if ((nr1 > 44) && (nr1 < 50)) {
            grade = "4";
        } else if ((nr1 < 45) && (nr1 > 39)) {
            grade = "3";
        } else if ((nr1 < 40) && (nr1 > 34)) {
            grade = "2";
        } else if ((nr1 < 35) && (nr1 > 29)) {
            grade = "1";
        } else if (nr1 < 30) {
            grade = "failed";
        } else {
            grade = "does not exist";
        }
        System.out.println("\nGrade: " + grade);


    }
}
