package week2.exercise39;

public class Exercise39p2 {
    public static void main(String[] args) {
        printSquare(6);
    }

        private static void printStars(int amount) {
        int i=1;
        while (i<=amount){
            System.out.print("*");
            i=i+1;
        } System.out.println();
        }

    private static void printSquare(int amount){
        int i=1;
        while (i<=amount){
            printStars(amount);
            i=i+1;
        }
        }
}
