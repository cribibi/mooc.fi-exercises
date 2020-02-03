package week4.exercise75decreasingcounter;

public class Mainp1 {
    public static void main(String[] args) {
        DecreasingCounterP1 counter = new DecreasingCounterP1(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}


