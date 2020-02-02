package week4.exercise78;
public class Exercise78BoundedCounter {

    private int value;
    private int upperLimit;
    private int counter = 0;

    public Exercise78BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (counter == upperLimit) {
            counter = 0;
        } else {
            counter = counter + 1;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        if (counter < 10) {
            sb.append("0").append(counter);
        } else {
            sb.append(counter);
        }
        return sb.toString();
    }

    public int getValue() {
        // write here code that returns the value
    return 5;
    }
}



