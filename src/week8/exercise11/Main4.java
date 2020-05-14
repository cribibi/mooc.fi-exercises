package week8.exercise11;

public class Main4 {
    public static void main(String[] args) {
        Box box = new Box(100);

        box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 2));

        Box box1 = new Box(20);
        box1.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box1.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        box1.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        Box box2 = new Box(20);
        box2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box2.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        Box box3 = new Box(20);
        box3.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box3.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box3.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        box.add(box1);
        box.add(box2);
        box.add(box3);
        System.out.println(box);

        Box box4 = new Box(5);
        Box box5 = new Box(8);
        box4.add(box5);
        System.out.println(box4);
        box5.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box5.add(new Book("Robert Martin", "Clean Code", 2));
        box5.add(new Book("Kent Beck", "Test Driven Development", 2));
        System.out.println(box4);
        //nu e bine
    }
}
