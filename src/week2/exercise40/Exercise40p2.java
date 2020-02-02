package week2.exercise40;

public class Exercise40p2 {
    public static void main(String[] args) {
        printRightTriangle(5);

    }

        private static void printStars(int amount) {
        int i=1;
        while (i<=amount){
            System.out.print("*");
            i=i+1;
        }
            System.out.println();
    }

        private static void printWhiteSpaces(int amount){
            int i=1;
            while (i<=amount){
                System.out.print(" ");
                i=i+1;
            }
        }

        private static void printRightTriangle(int amount){
        int i=1;
        while (i<=amount){
            printWhiteSpaces(amount-i);
            printStars(i);
            i=i+1;
        }

        }
}
