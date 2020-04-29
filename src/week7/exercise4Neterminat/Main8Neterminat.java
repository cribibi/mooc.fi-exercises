package week7.exercise4Neterminat;

public class Main8Neterminat {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int greutateTotala=0;
        int nrValize=0;
        if (container.greutateContainer+greutateTotala<container.getMaxWeight()){
            for (int i = 1; i <101 ; i++) {
                container.setGreutateContainer(i);
              greutateTotala+=container.getMaxWeight();
              nrValize+=1;
            }

        }
        // adding 100 suitcases with one brick in each
    }
}
