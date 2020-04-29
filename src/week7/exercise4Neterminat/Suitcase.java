package week7.exercise4Neterminat;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    ArrayList<Thing> things = new ArrayList<Thing>();


    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + totalWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    public void printThings() {
        for (int i = 0; i < things.size(); i++) {
            System.out.println(things.get(i).getName() + " ("
                    + things.get(i).getWeight()+" kg)");
        }
    }

    public int totalWeight() {
        int greutateTotala=0;
        for (int i = 0; i <things.size() ; i++) {
            greutateTotala+=things.get(i).getWeight();
        }
        return greutateTotala;
    }

    public Thing heaviestThing(){
        Thing celMaiGreu = new Thing("initial", 0);
        for (int i = 0; i <things.size() ; i++) {
            if (celMaiGreu.getWeight()<things.get(i).getWeight()){
                celMaiGreu=things.get(i);
            }
        }

        return celMaiGreu;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        if (things.size() == 0) {
            sb.append("empty");
        } else if (things.size() == 1) {
            sb.append("1 thing");
        } else {
            sb.append(things.size()).append(" things");
        }
        sb.append(" (").append(totalWeight()).append(" kg)");

        return sb.toString();
    }
}
