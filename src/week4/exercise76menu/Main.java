package week4.exercise76menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> meals=new ArrayList<>();
        Menu menu=new Menu(meals);
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
