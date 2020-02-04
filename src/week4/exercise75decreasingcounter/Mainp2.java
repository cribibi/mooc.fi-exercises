package week4.exercise75decreasingcounter;

public class Mainp2 {
    public static void main(String[] args) {
        DecreasingCounterP2 counter = new DecreasingCounterP2(2);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}


