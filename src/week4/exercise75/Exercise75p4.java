package week4.exercise75;

public class Exercise75p4 {
    public static void main(String[] args) {
        Exercise75DecreasingCounterP4 counter = new Exercise75DecreasingCounterP4(100);

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


