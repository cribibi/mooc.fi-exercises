package week4.exercise78boundedcounter;

public class MainP3 {
    public static void main(String[] args) {
        BoundedCounterP3 minutes = new BoundedCounterP3(59);
        BoundedCounterP3 hours = new BoundedCounterP3(23);

        int z = 0;
        while (z < 1521) {
            System.out.println(hours + ":" + minutes);
            minutes.next();
            if (minutes.getValue() == 0) {
                hours.next();
            }
            z++;

        }
    }
}

