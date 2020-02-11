package week6.exercise95money;

public class Main {
    public static void main(String[] args) {

        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("=============");

        a = a.plus(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("=============");

        Money a1 = new Money(10,0);
        Money b1 = new Money(3,0);
        Money c1 = new Money(5,0);

        System.out.println(a1.less(b1));  // false
        System.out.println(b1.less(c1));  // true

        System.out.println("=============");


        Money a2 = new Money(10,0);
        Money b2 = new Money(3,50);

        Money c2 = a2.minus(b2);

        System.out.println(a2);  // 10.00e
        System.out.println(b2);  // 3.50e
        System.out.println(c2);  // 6.50e

        c2 = c2.minus(a2);         // NOTE: new Money-object is created and reference to that is assigned to variable c
        //       the Money object 6.50e that variable c used to hold, is not referenced anymore

        System.out.println(a2);  // 10.00e
        System.out.println(b2);  // 3.50e
        System.out.println(c2);  // 0.00e
    }
}
