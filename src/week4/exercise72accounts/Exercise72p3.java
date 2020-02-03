package week4.exercise72accounts;

import libs.Account;

public class Exercise72p3 {
    public static void main(String[] args) {
        Account a = new Account("A's account",100);
        Account b = new Account("B's account", 0);
        Account c = new Account("C's account", 0);

        System.out.println("Initial state");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        transfer(a, b, 50);
        System.out.println("After the first transfer: ");
        System.out.println(a);
        System.out.println(b);

        transfer(b,c, 25);
        System.out.println("After the second transfer: ");
        System.out.println(b);
        System.out.println(c);

        System.out.println("Final state");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
        //to.deposit(from.withdrawal(howMuch)); does not work because the result of
        //from.withdrawal(howMuch) is void and to.deposit(double)
    }
}
