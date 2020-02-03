package week4.exercise78boundedcounter;

public class MainP12 {
        public static void main(String[] args) {
            BoundedCounterP12 counter = new BoundedCounterP12(4);
            System.out.println("Value at start: " + counter );
            int i = 0;
            while ( i < 10) {
                counter.next();
                System.out.println("Value: " + counter );
                i++;
            }

            BoundedCounterP12 counter2 = new BoundedCounterP12(14);
            System.out.println("Value at start: " + counter2 );
            int j = 0;
            while ( j < 16) {
                counter2.next();
                System.out.println("Value: " + counter2 );
                j++;

            }
        }
    }

