package week6.exercise100nightsky;

public class Main {
    public static void main(String[] args) {
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.printLine();
        System.out.println("\n===============");

        //punctul2
        NightSky NightSky2 = new NightSky(8, 4);
        NightSky2.print();
        System.out.println("Number of stars: " + NightSky2.starsInLastPrint());
        System.out.println("");

        NightSky2.print();
        System.out.println("Number of stars: " + NightSky2.starsInLastPrint());
    }
}
