package week4.exercise76;

import java.util.ArrayList;

public class Exercise76 {
    public static void main(String[] args) {
        ArrayList<String> meals=new ArrayList<>();
        Exercise76Menu menu=new Exercise76Menu(meals);
        System.out.println(menu);
        menu.addMeal("ciorba de burta");
        menu.addMeal("ciorba de vacuta");
        menu.addMeal("hamburger");
        menu.printMeals();
        System.out.println("===========");
        menu.clearMenu();
        menu.printMeals();




    }
}
