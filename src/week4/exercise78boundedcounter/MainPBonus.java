package week4.exercise78boundedcounter;

import java.util.Scanner;

public class MainPBonus {
    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);
        BoundedCounterP4 seconds = new BoundedCounterP4(59);
        BoundedCounterP4 minutes = new BoundedCounterP4(59);
        BoundedCounterP4 hours = new BoundedCounterP4(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
                System.out.print("minutes: ");
        int m =Integer.parseInt(reader.nextLine());
                System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int z = 0;
        while ( z < 1521 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue()==0){
                minutes.next();

            }
            if (minutes.getValue()==0){
                hours.next();
            }
            z++;

        }
    }
}

