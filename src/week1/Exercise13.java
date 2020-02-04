package week1;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Top ten by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);
        System.out.println("--------------");
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("--------------");
        System.out.println("Top 25 by penalty");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("--------------");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("--------------");
        NHLStatistics.teamStatistics("PHI");
        //dupa penalty-uri deoarece ultima oara am sortat lista dupa penalty
        System.out.println("--------------");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        System.out.println("--------------");

        System.out.println("De aici ma joc\n");

        System.out.println("Sort by assists: ");
        NHLStatistics.sortByAssists();
        NHLStatistics.teamStatistics("ANA");
        System.out.println("--------------");
        System.out.println("Sort by goals: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.teamStatistics("ANA");
        System.out.println("--------------");
        System.out.println("Sort by penalties: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.teamStatistics("ANA");
        System.out.println("--------------");


    }
}
