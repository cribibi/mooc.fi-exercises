package week4.exercise75;

public class Exercise75p1 {
    public static void main(String[] args) {
        Exercise75DecreasingCounterP1 counter = new Exercise75DecreasingCounterP1(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
    }
}


