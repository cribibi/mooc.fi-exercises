package week7.exercise4Neterminat;

import java.util.ArrayList;

public class Container {
    private int maxWeight;
    ArrayList<Suitcase> suitcaseList = new ArrayList<>();
    int greutateContainer;


    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (greutateContainer + suitcase.totalWeight() < maxWeight) {
            suitcaseList.add(suitcase);
            greutateContainer += suitcase.totalWeight();
        }
    }

    public void printThings() {
        for (int i = 0; i < suitcaseList.size(); i++) {
            for (int j = 0; j < suitcaseList.get(i).things.size(); j++) {

                System.out.println(suitcaseList.get(i).things.get(j).getName() + " ("
                        + suitcaseList.get(i).things.get(j).getWeight()
                +" kg)");
            }
        }
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setSuitcaseList(ArrayList<Suitcase> suitcaseList) {
        this.suitcaseList = suitcaseList;
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
