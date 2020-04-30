package week7.exercise4;

public class Main8Neterminat {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    //nu reusesc sa adun valizele asa
    public static void addSuitcasesFullOfBricks1(Container container) {
        int nrValize = 0;
        int greutateTotala = 0;
        for (int i = 1; i < 101; i++) {
            if (greutateTotala + i < container.getMaxWeight()) {
                greutateTotala = greutateTotala + i;
                nrValize = nrValize + 1;
            }
        }
        container.setGreutateContainer(greutateTotala);
    }

    //am apelat metode existente, merge, dar se poate si mai bine
    public static void addSuitcasesFullOfBricks2(Container container) {
        int greutateTotala = 0;
        for (int i = 1; i < 101; i++) {
            if (greutateTotala + i < container.getMaxWeight()) {
                container.addSuitcase(new Suitcase(i));
                greutateTotala = greutateTotala + i;
            }
        }
        container.setGreutateContainer(greutateTotala);
    }

    //merge, dar tot nu imi place, inseamna ca add suitcase nu e bine
    public static void addSuitcasesFullOfBricks3(Container container) {
        for (int i = 1; i < 101; i++) {
            if (container.getGreutateContainer() + i < container.getMaxWeight()) {
                container.addSuitcase(new Suitcase(i));
                container.greutateContainer = container.greutateContainer + i;
            }
        }
    }

    //varianta finala
    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 1; i < 101; i++) {
            Suitcase suitcase = new Suitcase(i);
            suitcase.thingsList.add(new Thing("brick", i));
            if (container.getGreutateContainer() + i < container.getMaxWeight()) {
                container.addSuitcase(suitcase);
            }
        }
    }
}
