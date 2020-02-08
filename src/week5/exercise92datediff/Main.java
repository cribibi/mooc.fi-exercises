package week5.exercise92datediff;

public class Main {
    public static void main(String[] args) {
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println(first.earlier(second));//true daca first e inainte de second
        System.out.println(second.earlier(third)); //false daca second e dupa third

        System.out.println(second + " and " + first + " difference in years: " + second.differenceInYears(first));
        System.out.println(third + " and " + first + " difference in years: " + third.differenceInYears(first));
        System.out.println(second + " and " + third + " difference in years: " + second.differenceInYears(third));
        System.out.println(first+ " and " +second+" difference in years: " + first.differenceInYears(second));


        System.out.println("\nAccurate:");
        System.out.println(second + " and " + first + " difference in years: " + second.differenceInYearsAccurate(first));
        System.out.println(third + " and " + first + " difference in years: " + third.differenceInYearsAccurate(first));
        System.out.println(second + " and " + third + " difference in years: " + second.differenceInYearsAccurate(third));
        System.out.println(first+ " and " +second+" difference in years: " + first.differenceInYearsAccurate(second));

        System.out.println("\nAccurate and absolute:");
        System.out.println( first + " and " + second + " difference in years: " + second.differenceInYearsAccurateIndif(first) );
        System.out.println( second + " and " + first + " difference in years: " + first.differenceInYearsAccurateIndif(second) );
        System.out.println( first + " and " + third + " difference in years: " + third.differenceInYearsAccurateIndif(first) );
        System.out.println( third + " and " + first + " difference in years: " + first.differenceInYearsAccurateIndif(third) );
        System.out.println( third + " and " + second + " difference in years: " + second.differenceInYearsAccurateIndif(third) );
        System.out.println( second + " and " + third + " difference in years: " + third.differenceInYearsAccurateIndif(second));
    }
}

