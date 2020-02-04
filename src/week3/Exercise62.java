package week3;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise62 {
    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");
        System.out.println("brothers:");
        System.out.println(brothers);

        Collections.sort(brothers);

        removeLast(brothers);
        System.out.println(brothers);
    }

    public static void removeLast(ArrayList<String> brothers) {
        brothers.remove(brothers.size() - 1);
        System.out.println(brothers);
    }
}
