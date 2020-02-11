package week6.exercise95money;

public class Main2 {
    public static void main(String[] args) {

        Money a = new Money(10, 60);
        Money b = new Money(5, 50);

        Money c = a.plus(b);

        System.out.println("A este egal cu: "+ a);
        System.out.println("B este egal cu: " + b);
        System.out.println("C este egal cu A+B: " + c);
        System.out.println("=============");

        a = a.plus(c);

        System.out.println("A este egal cu A+C: " + a);
        System.out.println("B este egal cu: " + b);
        System.out.println("C este egal cu: " + c);
        System.out.println("=============");

        Money a1 = new Money(10,50);
        Money b1 = new Money(3,70);
        Money c1 = new Money(5,96);

        System.out.println(a1.less(b1));  // false
        System.out.println(b1.less(c1));  // true

        System.out.println("=============");


        Money a2 = new Money(10,0);
        Money b2 = new Money(3,55);

        Money c2 = a2.minus(b2);

        System.out.println("a2 este egal cu: "+ a2);
        System.out.println("b2 este egal cu: "+ b2);
        System.out.println("c2 este egal cu a2-b2: " + c2);

        System.out.println("=============");

        c2 = c2.minus(a2);

        System.out.println("a2 este egal cu: "+a2);
        System.out.println("b2 este egal cu: "+b2);
        System.out.println("c2 este egal cu c2-a2: " +c2);
    }
}
