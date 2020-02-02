package week4.exercise75;

public class Exercise75p3 {
    public static void main(String[] args) {
        Exercise75DecreasingCounterP3 counter = new Exercise75DecreasingCounterP3(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}


