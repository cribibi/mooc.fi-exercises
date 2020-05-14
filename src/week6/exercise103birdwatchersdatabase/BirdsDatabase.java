package week6.exercise103birdwatchersdatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class BirdsDatabase {
    static Scanner scanner = new Scanner(System.in);

    //varianta cu Arraylist nestatic, cream un obiect de tip birdsdatabase si apelam metodele prin el, nu vor mai fi statice
    ArrayList<Bird> birds;

    public BirdsDatabase() {
        this.birds = new ArrayList<>();
    }

    public static void main(String[] args) {
        BirdsDatabase birdsDatabase=new BirdsDatabase();
        birdsDatabase.menu();
    }

    public void menu(){
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

    public void add() {
        System.out.print("Bird name: ");
        String sc = scanner.nextLine();
        System.out.print("Bird latin name: ");
        String sc1 = scanner.nextLine();
        Bird newBird = new Bird(sc, sc1);
        birds.add(newBird);

    }

    public void observation() {
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

    public  void statistics() {
        for (int i = 0; i < birds.size(); i++) {
            //System.out.println(birds.get(i).getName() + "(" + birds.get(i).getLatinName() + ") : " + birds.get(i).getObservation() + " observations");
            //System.out.println(birds.toString());
            System.out.println(birds.get(i));
        }
    }

    public  void show() {
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
