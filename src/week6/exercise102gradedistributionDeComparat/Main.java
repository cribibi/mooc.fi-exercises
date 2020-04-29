package week6.exercise102gradedistributionDeComparat;

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
        int riw = Integer.parseInt(riw1);
        String[] note = {"5: ", "4: ", "3: ", "2: ", "1: ", "0: "};
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
            riw1 = scanner.nextLine();
            riw = Integer.parseInt(riw1);
        }

        int[] counteri = {count5, count4, count3, count2, count1, count0};
        printGradingDistribution(note, counteri);
        System.out.println("Acceptance percentage: " +
                ((double)100 * (count1 + count2 + count3 + count4 + count5) / (count0 + count1 + count2 + count3 + count4 + count5)));

    }

    public static void printGradingDistribution(String[] note, int[] counteri) {
        for (int i = 0; i < note.length; i++) {
            System.out.print(note[i]);
            if (counteri[i] > 0) {
                for (int j = 0; j < counteri[i]; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
