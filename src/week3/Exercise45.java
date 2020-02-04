package week3;

public class Exercise45 {
    public static void main(String[] args) {
        int answer = greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }

    public static int greatest(int number1, int number2, int number3) {
        return Math.max(Math.max(number1, number2), Math.max(number2, number3));
    }
}
