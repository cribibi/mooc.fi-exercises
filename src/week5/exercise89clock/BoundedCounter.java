package week5.exercise89clock;

public class BoundedCounter {

    private int upperLimit;
    private int value;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (value == upperLimit) {
            value = 0;
        } else {
            value = value + 1;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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
}



