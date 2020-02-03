package week2.exercise39PrintShapes;

public class Exercise39p1 {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printStars(1);
    }

        private static void printStars(int amount) {
        int i=1;
        while (i<=amount){
            System.out.print("*");
            i=i+1;
        }
            System.out.println();
            // you can print one star with the command
            // System.out.print("*");
            // call this command amount times

    }
}
