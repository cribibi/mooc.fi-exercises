package week2.exercise40PrintChristmasTree;

public class Exercise40p3 {
    public static void main(String[] args) {
        printXmassTree(11);
    }

    private static void printStars(int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print("*");
            i = i + 1;
        }
        System.out.println();
    }

    private static void printWhiteSpaces(int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print(" ");
            i = i + 1;
        }
    }

    private static void printRightTriangle(int amount) {
        int i = 1;
        while (i <= amount) {
            printWhiteSpaces(amount - i);
            printStars(i);
            i = i + 1;
        }
    }

    private static void printXmassTree(int height) {
        int i = 1;
        while (i <= height) {
            printWhiteSpaces(height - i);
            printStars(i * 2 - 1);
            i = i + 1;
        }
        for (int j = 0; j < 2; j++) {
            printWhiteSpaces(((height * 2 - 1) / 2) - 1);
            printStars(3);
        }
    }
}
