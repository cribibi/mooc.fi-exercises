package week4.exercise78;

public class Exercise78neterminat {
        public static void main(String[] args) {
            Exercise78BoundedCounter counter = new Exercise78BoundedCounter(4);
            System.out.println("Value at start: " + counter );
            int i = 0;
            while ( i < 10) {
                counter.next();
                System.out.println("Value: " + counter );
                i++;
            }

            Exercise78BoundedCounter counter2 = new Exercise78BoundedCounter(14);
            System.out.println("Value at start: " + counter2 );
            int j = 0;
            while ( j < 16) {
                counter2.next();
                System.out.println("Value: " + counter2 );
                j++;
            }

            Exercise78BoundedCounter minutes = new Exercise78BoundedCounter(59);
            Exercise78BoundedCounter hours = new Exercise78BoundedCounter(23);

            int z = 0;
            while ( z < 121 ) {
                System.out.println( hours + ":" + minutes);
                minutes.next();
//                if (){
//                    hours.next();
//                }

                z++;
            }
        }
    }

