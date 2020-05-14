package week6.exercise103birdwatchersdatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDatabase {
    static Scanner scanner = new Scanner(System.in);

    //varianta cu arraylistul static, nu cream niciun obiect si toate metodele sunt statice
    static ArrayList<Bird> birds = new ArrayList<>();

    public static void main(String[] args) {

        menu();
    }

    public static void menu(){
        while (true) {
            System.out.print("Please enter a command: ");
            String sc = scanner.nextLine();
            if (sc.equalsIgnoreCase("add")) {
                add();
            } else if (sc.equalsIgnoreCase("observation")) {
                observation();
            } else if (sc.equalsIgnoreCase("statistics")) {
                statistics();
            } else if (sc.equalsIgnoreCase("show")) {
                show();
            } else if (sc.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("This is not a valid command. Please try again");
            }
        }

    }

    public static void add() {
        System.out.print("Bird name: ");
        String sc = scanner.nextLine();
        System.out.print("Bird latin name: ");
        String sc1 = scanner.nextLine();
        Bird newBird = new Bird(sc, sc1);
        birds.add(newBird);

    }

    public static void observation() {
        System.out.println("What was observed? ");
        String sc = scanner.nextLine();
        boolean exista = false;
        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equalsIgnoreCase(sc)) {
                birds.get(i).setObservation(birds.get(i).getObservation() + 1);
                exista = true;
                break;
            }
        }
        if (exista == false) {
            System.out.println("This is not a bird.");
        }
    }

    public static void statistics() {
        for (int i = 0; i < birds.size(); i++) {
            //System.out.println(birds.get(i).getName() + "(" + birds.get(i).getLatinName() + ") : " + birds.get(i).getObservation() + " observations");
            //System.out.println(birds.toString());
            System.out.println(birds.get(i));
        }
    }

    public static void show() {
        System.out.print("What? ");
        String sc = scanner.nextLine();
        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equalsIgnoreCase(sc)) {
                //System.out.println(birds.get(i).getName() + "(" + birds.get(i).getLatinName() + ") : " + birds.get(i).getObservation() + " observations");
                System.out.println(birds.get(i));
            }
        }
    }
}


