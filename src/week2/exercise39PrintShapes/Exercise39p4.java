package week2.exercise39PrintShapes;

public class Exercise39p4 {
    public static void main(String[] args) {

        printTriangle(4);
        //printTriangle(10);

    }

    private static void printStars(int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print("*");
            i = i + 1;
        }
        System.out.println();
    }

    private static void printSquare(int amount) {
        int i = 1;
        while (i <= amount) {
            printStars(amount);
            i = i + 1;
        }
    }

    private static void printRectangle(int width, int height) {
        int i = 1;
        while (i <= height) {
            printStars(width);
            i = i + 1;
        }
    }

    private static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            i = i + 1;
        }
    }
}
