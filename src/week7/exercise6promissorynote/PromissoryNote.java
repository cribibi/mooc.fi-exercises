package week7.exercise6promissorynote;

import java.util.HashMap;
import java.util.Map;

public class PromissoryNote {
    Map<String, Double> loanList = new HashMap<>();


    public PromissoryNote() {
    }

    public void setLoan(String toWhom, double value) {
        loanList.put(toWhom, value);

    }

    public double howMuchIsTheDebt(String whose) {
        if (loanList.containsKey(whose)) {
            return loanList.get(whose);
        }
    else return 0;
    }
}
