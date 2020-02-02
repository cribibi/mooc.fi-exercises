package week3;

public class Exercise44 {
    public static void main(String[] args) {
        int answer =  least(2, 7);
        System.out.println("Least: " + answer);
    }

    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        return Math.min(number1, number2);
        // method needs a return in the end
    }
}
