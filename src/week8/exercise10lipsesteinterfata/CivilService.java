package week8.exercise10lipsesteinterfata;

public class CivilService  implements NationalService{
    private int daysLeft;

    public CivilService() {
        this.daysLeft=362;
    }

    @Override
    public int getDaysLeft() {
        return 0;
    }

    @Override
    public void work() {

    }
}
