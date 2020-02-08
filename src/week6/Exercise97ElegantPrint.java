package week6;

import java.util.Arrays;

public class Exercise97ElegantPrint {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
        System.out.println("==========");
        System.out.println("Arrays to String method: "+Arrays.toString(array));
    }



    public static void printElegantly(int[] array) {
        for (int i = 0; i <array.length-1 ; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length-1]);
    }
}


