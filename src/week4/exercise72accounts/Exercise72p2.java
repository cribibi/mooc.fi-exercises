package week4.exercise72accounts;

import libs.Account;

public class Exercise72p2 {
    public static void main(String[] args) {
        Account mattsAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);


        System.out.println("Initial state");
        System.out.println(mattsAccount);
        System.out.println(myAccount);

        mattsAccount.withdrawal(20);
        System.out.println("Matt's account balance is now: " + mattsAccount.balance());
        myAccount.deposit(20);
        System.out.println("My account balance is now: " + myAccount.balance());

        System.out.println("Final state");
        System.out.println(mattsAccount);
        System.out.println(myAccount);


    }
}
