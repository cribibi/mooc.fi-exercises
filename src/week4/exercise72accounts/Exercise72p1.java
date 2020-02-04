package week4.exercise72accounts;

import libs.Account;

public class Exercise72p1 {
    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account", 100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: " + bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: " + bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        System.out.println("====================");
        Account biancasAccount = new Account("Bianca's account", 100);
        biancasAccount.deposit(20);
        System.out.println("Bianca's account balance is now: " + biancasAccount.balance());
        System.out.println(biancasAccount);
    }
}
