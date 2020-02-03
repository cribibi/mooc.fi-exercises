package week4.exercise77lyyracard;

public class LyyraCardP6 {
    private double balance;

    public LyyraCardP6(double balanceAtStart) {
        this.balance = balanceAtStart;
        // write code here
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("The card has ");
        sb.append(balance).append(" euros.");
        return sb.toString();
    }

    public void payEconomical() {
        if (balance >= 2.5) {
            balance = balance - 2.5;
        } else {
            System.out.println("Not enough money for the economic payment:(");
        }
        // write code here
    }

    public void payGourmet() {
        if (balance >= 4) {
            balance = balance - 4;
        } else {
            System.out.println("Not enough money for the gourmet payment:(");
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            if (balance > 150) {
                balance = 150;
            }
        }
    }
}
