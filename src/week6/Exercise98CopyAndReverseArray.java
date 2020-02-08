package week6;

import java.util.Arrays;

public class Exercise98CopyAndReverseArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
        System.out.println("=======reverse=======");

        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    public static int[] copy(int[] array){
        int [] copied=array.clone();
        return copied;
    }
    //de ce imi modifica si array-ul initial daca nu folosesc clone??!!!

    public static int[] reverseCopy(int[] array){
        int[] reverse= new int [array.length];
        for (int i = 0; i <array.length ; i++) {
            reverse[i]=array[array.length-1-i];
        }

    return reverse;
    }
}
