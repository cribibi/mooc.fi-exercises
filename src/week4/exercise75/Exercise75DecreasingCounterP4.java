package week4.exercise75;

public class Exercise75DecreasingCounterP4 {
    private int value;
    private int initialValue;
    // object variable that remembers the value of the counter


    public Exercise75DecreasingCounterP4(int valueAtStart) {
        this.value = valueAtStart;
        initialValue=valueAtStart;
    }


    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value > 0) {
            value = value - 1;
        }

    }
    public void reset(){
        value=0;
    }

    public void setInitial(){
        value=initialValue;

    }

}



