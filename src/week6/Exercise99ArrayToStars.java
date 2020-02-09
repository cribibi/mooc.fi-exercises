package week6;

public class Exercise99ArrayToStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
        System.out.println("============");
        printArrayAsStarsV2(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            while (j < array[i]) {
                System.out.print("*");
                j++;
            }
            System.out.println();

        }
    }

    public static void printArrayAsStarsV2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}



