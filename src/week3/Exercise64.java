package week3;

import java.util.ArrayList;

public class Exercise64 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The average: " + average(list));
    }

    public static int sum(ArrayList<Integer> list) {
        int suma = 0;
        for (int i = 0; i < list.size(); i++) {
            suma += list.get(i);
        }
        return suma;
    }

    public static double average(ArrayList<Integer> list) {
        int suma = sum(list);
        return (double) suma / list.size();
    }

}
