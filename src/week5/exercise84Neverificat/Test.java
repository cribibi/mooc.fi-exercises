package week5.exercise84Neverificat;

public class Test {
    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter(-1, true);
        Counter c3=new Counter(-1, false);
        Counter c4=new Counter(9);
        Counter c5=new Counter(-8);
        Counter c6=new Counter(true);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c6);

        c2.decrease();
        System.out.println(c2);
        c4.decrease(-10);
        System.out.println(c4);
        c4.decrease(10);
        System.out.println(c4);


    }
}
