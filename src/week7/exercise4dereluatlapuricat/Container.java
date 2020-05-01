package week7.exercise4dereluatlapuricat;

import java.util.ArrayList;

public class Container {
    private int maxWeight;
    ArrayList<Suitcase> suitcaseList = new ArrayList<>();
    public int greutateContainer;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (greutateContainer + suitcase.realWeight() < maxWeight) {
            suitcaseList.add(suitcase);
            greutateContainer = greutateContainer + suitcase.realWeight();

        }
    }

    public void printThings() {
        for (int i = 0; i < suitcaseList.size(); i++) {
            for (int j = 0; j < suitcaseList.get(i).thingsList.size(); j++) {

                System.out.println(suitcaseList.get(i).thingsList.get(j).getName() + " ("
                        + suitcaseList.get(i).thingsList.get(j).getWeight()
                        + " kg)");
            }
        }
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getGreutateContainer() {
        return greutateContainer;
    }

    public void setGreutateContainer(int greutateContainer) {
        this.greutateContainer = greutateContainer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("").append(suitcaseList.size());
        sb.append(" suitcases").append(" (").append(greutateContainer);
        sb.append(" kg)");
        return sb.toString();
    }
}
