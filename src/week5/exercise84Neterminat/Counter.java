package week5.exercise84Neterminat;

public class Counter {
    //    Make a class Counter that holds a number that can be decreased and increased.
    int counter;
    int startingValue;
    boolean check;


    public Counter() {
        startingValue = 0;
        counter = startingValue;
    }

    // public Counter(int startingValue, boolean check)
    //creates a new counter with the given value.
    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
        counter = startingValue;
    }

    //    public Counter(boolean check) creates a new counter with the starting value 0. The check is on if the parameter given to check was true.
    public Counter(boolean check) {
        startingValue = 0;
        counter = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.startingValue = startingValue;
        counter = startingValue;
    }


    //    public void increase() increases the value of the counter by one
    public void increase() {
        counter++;
    }

    //    public void decrease() decreases the value of the counter by one, but not below 0 if the check is on
    public void decrease() {
        counter--;
    }

    //    public int value() returns the current value of the counter
    public int value() {
        return counter;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            counter = counter + increaseAmount;
        }

    }


    public void decrease(int decreaseAmount) {
        if (counter>decreaseAmount){
            counter=counter=decreaseAmount;
        }
    }


}
