package week6.exercise95moneyNeverificat;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money c = new Money(this.euros + added.euros, this.cents + added.cents);
        return c;
    }

    public boolean less(Money compared) {
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            } else {
                return false;
            }
        } else if (this.euros < compared.euros) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decremented) {
        Money initial=new Money(0, 0);
        Money c = initial;
        if (this.cents < decremented.cents) {
            c = new Money(this.euros - decremented.euros - 1,
                    this.cents - decremented.cents + 100);
        } else {
            c = new Money(this.euros - decremented.euros,
                    this.cents - decremented.cents);
        }
        if ((c.cents >= 0) && (c.euros >= 0)) {
            return c;
        } else {
            return initial;
        }
    }
}

