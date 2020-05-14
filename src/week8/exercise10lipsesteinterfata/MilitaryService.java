package week8.exercise10lipsesteinterfata;

public class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public int getDaysLeft() {
        return 0;
    }

    @Override
    public void work() {

    }
}
