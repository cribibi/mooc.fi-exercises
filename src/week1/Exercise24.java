package week1;
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("NHL statistics service");
        while (true){
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
                // print the top ten playes sorted by points
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
                // print the top ten players sorted by goals
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
                // print the top ten players sorted by assists
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
                // print the top ten players sorted by penalties
            } else if (command.equals("player")) {
                System.out.print("Type the player name: ");
                String player=reader.nextLine();
                NHLStatistics.searchByPlayer(player);
                // ask the user for the player name and print the statistics for that player
            } else if (command.equals("club")) {
                System.out.println("Type the club name abbreviation");
                String abbrev=reader.nextLine();
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(abbrev);
                // ask the user for the club abbreviation and print the statistics for the club
                // note: the statistics should be sorted by points
                //     (players with the most points are first)
            }
        }



    }
}
