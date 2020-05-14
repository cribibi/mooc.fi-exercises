package week8.exercise11;

import java.util.ArrayList;

public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> objects = new ArrayList<>();

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double weight() {
        double weight = 0;
        for (int i = 0; i <objects.size() ; i++) {
            weight+=objects.get(i).weight();
        }
        // it calculates the total weight of the things which had been stored
        return weight;
    }

    public ArrayList<ToBeStored> add(ToBeStored toBeStored){
        if (weight()+toBeStored.weight()<maxWeight){
            objects.add(toBeStored);
        }
        return objects;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box: ");
        sb.append("maxWeight= ").append(maxWeight);
        sb.append(", totalWeight= ").append(weight());
        sb.append(", objects= ").append(objects.size());
        return sb.toString();
    }
}
