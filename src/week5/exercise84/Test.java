package week5.exercise84;

public class Test {
    public static void main(String[] args) {
        Counter c1=new Counter();
        System.out.println("c1: " + c1);
        System.out.println();

        Counter c2=new Counter(-1, true);
        System.out.println("c2: " + c2);
        c2.decrease();
        System.out.println("c2 decreased: " + c2);
        c2.decrease(5);
        System.out.println("c2 decreased again: "+c2);
        System.out.println();

        Counter c3=new Counter(-1, false);
        System.out.println("c3: " + c3);
        c3.decrease();
        System.out.println("c3 decreased: "+ c3);
        c3.decrease(5);
        System.out.println("c3 decreased by 5: "+c3);
        System.out.println();

        Counter c4=new Counter(9);
        System.out.println("c4: " + c4);
        c4.decrease(-10);
        System.out.println("c4 decreased: " + c4);
        c4.decrease(10);
        System.out.println("c4 decreased again: " + c4);
        System.out.println();

        Counter c5=new Counter(-8);
        System.out.println("c5: " + c5);
        c5.decrease();
        System.out.println("c5 decreased: " + c5);
        System.out.println();

        Counter c6=new Counter(true);
        System.out.println("c6: " + c6);
        c6.decrease(3);
        System.out.println("c6 decreased: "+c6);
        System.out.println();

        Counter c7=new Counter(7, true);
        System.out.println("c7: "+ c7);
        c7.decrease(10);
        System.out.println("c7 decreased: "+ c7);

    }
}
