package week5.exercise84Neverificat;

public class Counter {
    //    Make a class Counter that holds a number that can be decreased and increased.
    int counter;
    int startingValue;
    boolean check;


    public Counter() {
        startingValue = 0;
        counter = startingValue;
    }

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
        if ((check == true) && (startingValue < 0)) {
            counter = 0;
        } else {
            counter = startingValue;
        }
    }

    public Counter(boolean check) {
        this.check = check;
        if (check == true) {
            startingValue = 0;
            counter = startingValue;
        } else {
            counter = startingValue;

        }
    }

    public Counter( int startingValue){
            this.startingValue = startingValue;
            counter = startingValue;
        }


        public void increase () {
            counter++;
        }

        public void decrease () {
            if (counter - 1 >= 0) {
                counter--;
            } else {
                counter = 0;
            }
        }

        public int value () {
            return counter;
        }

        public void increase ( int increaseAmount){
            if (increaseAmount > 0) {
                counter = counter + increaseAmount;
            }
        }


        public void decrease ( int decreaseAmount){
        if (decreaseAmount<0){
            counter=counter;
        }else if ((check==true)&&(counter > decreaseAmount)) {
                counter = counter - decreaseAmount;
            }
        }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Counter{");
        sb.append("counter=").append(counter);
        //sb.append(", startingValue=").append(startingValue);
        sb.append(", check=").append(check);
        sb.append('}');
        return sb.toString();
    }
}
