package week5.exercise86;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        this.cashInRegister = 1000;
        // at start the register has 1000 euros
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.5) {
            cashInRegister += 2.5;
            economicalSold = economicalSold + 1;
            cashGiven = cashGiven - 2.5;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4) {
            cashInRegister = cashInRegister + 4;
            gourmetSold += 1;
            cashGiven = cashGiven - 4;
        }
        return cashGiven;
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= 2.5) {
            card.pay(2.5);
            economicalSold += 1;
            return true;
        } else
            return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= 4) {
            card.pay(4);
            gourmetSold += 1;
            return true;
        } else
            return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        card.loadMoney(sum);
        cashInRegister += sum;
    }
}

