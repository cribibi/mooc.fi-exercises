package week4.exercise76menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu(ArrayList<String> meals) {
        this.meals = meals;
    }

    public void addMeal(String meal){
        if (meals.contains(meal)==false){
            meals.add(meal);
        }
    }
    public void printMeals(){
        for (int i = 0; i <meals.size() ; i++) {
            System.out.println(meals.get(i));

        }
    }
    public void clearMenu(){
        meals.clear();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Exercise76MenuP1{");
        sb.append("meals=").append(meals);
        sb.append('}');
        return sb.toString();
    }
}
