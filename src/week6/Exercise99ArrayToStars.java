package week6;

public class Exercise99ArrayToStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j < array[i]) {
                System.out.print("*");
                j++;
            }
            System.out.println();

        }
    }
}



