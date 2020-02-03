package week1;

public class Exercise05 {
    public static void main(String[] args) {
        int days=365;
        int hours=24;
        int minutes=60;
        int seconds=60;
        long secondsInYear=days*hours*minutes*seconds;
        System.out.println("There are "+ secondsInYear+" seconds in a year.");
        System.out.printf("There are %d seconds in a year.", secondsInYear);
    }
}
