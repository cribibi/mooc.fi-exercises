package week3;

import java.util.ArrayList;

public class Exercise63 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The sum: " + sum(list));
        list.add(10);
        System.out.println("the sum: " + sum(list));
    }

    public static int sum(ArrayList<Integer> list) {
        int suma = 0;
        for (int i = 0; i < list.size(); i++) {
            suma += list.get(i);
        }
        return suma;
    }

}
