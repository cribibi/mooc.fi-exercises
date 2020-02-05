package week5.exercise90team;

public class Player {
    String name;
    int goals;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return goals;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(name);
        sb.append(", goals ").append(goals);
        return sb.toString();
    }
}
