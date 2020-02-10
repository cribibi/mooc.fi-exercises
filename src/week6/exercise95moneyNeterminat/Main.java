package week6.exercise95moneyNeterminat;

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
    }
}
