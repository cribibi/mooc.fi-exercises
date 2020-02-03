package week4.exercise75decreasingcounter;

public class Mainp4 {
    public static void main(String[] args) {
        DecreasingCounterP4 counter = new DecreasingCounterP4(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}


