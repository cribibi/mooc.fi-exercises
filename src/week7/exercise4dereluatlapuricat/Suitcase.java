package week7.exercise4dereluatlapuricat;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    ArrayList<Thing> thingsList = new ArrayList<Thing>();


    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + realWeight() <= maxWeight) {
            thingsList.add(thing);
        }
    }

    public void printThings() {
        for (int i = 0; i < thingsList.size(); i++) {
            System.out.println(thingsList.get(i).getName() + " ("
                    + thingsList.get(i).getWeight()+" kg)");
        }
    }

    public int realWeight() {
        int greutateTotala=0;
        for (int i = 0; i < thingsList.size() ; i++) {
            greutateTotala+= thingsList.get(i).getWeight();
        }
        return greutateTotala;
    }

    public Thing heaviestThing(){
        Thing celMaiGreu = new Thing("initial", 0);
        for (int i = 0; i < thingsList.size() ; i++) {
            if (celMaiGreu.getWeight()< thingsList.get(i).getWeight()){
                celMaiGreu= thingsList.get(i);
            }
        }
        return celMaiGreu;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        if (thingsList.size() == 0) {
            sb.append("empty");
        } else if (thingsList.size() == 1) {
            sb.append("1 thing");
        } else {
            sb.append(thingsList.size()).append(" things");
        }
        sb.append(" (").append(realWeight()).append(" kg)");

        return sb.toString();
    }
}
