package week6.exercise104sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("----punctl 1-------");
        System.out.println("smallest: " + smallest(values));
        System.out.println("-----punct 2--------");
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        int[] values3 = {-1, 6, 9, 8, 12};
        System.out.println("-----punct 3--------");
        System.out.println(indexOfTheSmallestStartingFrom(values3, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values3, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values3, 4));

        int[] values4 = {3, 2, 5, 4, 8};
        System.out.println("-------punct 4-------");
        System.out.println(Arrays.toString(values4));

        swap(values4, 1, 0);
        System.out.println(Arrays.toString(values4));

        swap(values4, 0, 3);
        System.out.println(Arrays.toString(values4));

        System.out.println("---------punct 5------------");
        int[] values5 = {8, 3, 7, 9, 1, 2, 4};
        sort(values5);

    }

    public static int smallest(int[] array) {
        int s = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
            }
        }
        return s;
    }

    public static int indexOfTheSmallest(int[] array) {
        int s = array[0];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
                j = i;
            }
        }
        return j;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int j = index;
        int s = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] < s) {
                s = array[i];
                j = i;
            }

        }
        return j;
    }

    public static void swap(int[] array, int index1, int index2) {
        int c = array[index1];
        array[index1] = array[index2];
        array[index2] = c;
    }

    //nu merge inca
    public static void sort(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }
}
