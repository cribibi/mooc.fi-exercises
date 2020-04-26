package week6.exercise102gradedistributionNeterminat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type exam scores, -1 completes: ");
        Scanner scanner = new Scanner(System.in);
        // ...
        doSomething(scanner);

    }

    public static void doSomething(Scanner scanner) {
        String riw1 = scanner.nextLine();
        Integer riw = Integer.parseInt(riw1);
        String grade0 = "0: ";
        String grade1 = "1: ";
        String grade2 = "2: ";
        String grade3 = "3: ";
        String grade4 = "4: ";
        String grade5 = "5: ";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        while (riw != -1) {
            if ((riw < 61) && (riw > 49)) {
                count5 = count5 + 1;
            } else if ((riw > 44) && (riw < 50)) {
                count4 = count4 + 1;
            } else if ((riw < 45) && (riw > 39)) {
                count3 = count3 + 1;
            } else if ((riw < 40) && (riw > 34)) {
                count2 = count2 + 1;
            } else if ((riw < 35) && (riw > 29)) {
                count1 = count1 + 1;
            } else if (riw < 30) {
                count0 = count0 + 1;
            }
        }

        System.out.println(grade5 + count5);
        System.out.println(grade4 + count4);
        System.out.println(grade3 + count3);
        System.out.println(grade2 + count2);
        System.out.println(grade1 + count1);
        System.out.println(grade0 + count0);
        System.out.println("Acceptance percentage: " +
                ((count1 + count2 + count3 + count4 + count5) / (count0 + count1 + count2 + count3 + count4 + count5)));

    }
}
