package week2.exercise40PrintChristmasTree;

public class Exercise40p1 {
    public static void main(String[] args) {

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
            System.out.println();
        }
}
