package week4.exercise78boundedcounter;

public class BoundedCounterP12 {

    private int upperLimit;
    private int value;

    public BoundedCounterP12(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (value == upperLimit) {
            value = 0;
        } else {
            value = value + 1;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        if (value < 10) {
            sb.append("0").append(value);
        } else {
            sb.append(value);
        }
        return sb.toString();
    }

    public int getValue() {
        // write here code that returns the value
        return 5;
    }
}



