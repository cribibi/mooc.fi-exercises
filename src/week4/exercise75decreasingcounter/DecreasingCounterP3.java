package week4.exercise75decreasingcounter;

public class DecreasingCounterP3 {
    private int value;
    // object variable that remembers the value of the counter

    public DecreasingCounterP3(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value > 0) {
            value = value - 1;
        }

        // write here the code that decrements the value of counter by one
    }

    public void reset() {
        value = 0;
    }

    // and here the rest of the methods
}



