package week4.exercise75decreasingcounter;

public class Mainp3 {
    public static void main(String[] args) {
        DecreasingCounterP3 counter = new DecreasingCounterP3(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}


