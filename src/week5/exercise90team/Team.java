package week5.exercise90team;

import java.util.ArrayList;

public class Team {
    String name;
    int maxSize=16;
    private int number;
    ArrayList<Player> list = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return list.size();
    }

    public void addPlayer(Player player) {
        if (list.size() < maxSize) {
            list.add(player);
        }
    }

    public int goals() {
        for (int i = 0; i < list.size(); i++) {
            number = number + list.get(i).goals;
        }
        return number;
    }

    public void printPlayers() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
