package week3;

import java.util.ArrayList;

public class Exercise67nvariance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The greatest number is: " + greatest(list));
    }


    public static int greatest(ArrayList<Integer> list) {
        int greatest = list.get(0);
        for (int i = 1; i < list.size() - 1; i++) {
            if (greatest < list.get(i)) {
                greatest = list.get(i);
            }
        }
        return greatest;
    }
    public static double variance(ArrayList<Integer> list) {
        // write your code here
    return 1.2;

    }

}
