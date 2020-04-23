package week5.exercise93personage;

public class MainP1 {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 15, 2, 1993);
        Person steve = new Person("Thomas", 1, 3, 1955);
        Person bianca = new Person("Bianca", 5, 11, 1988);

        System.out.println( steve.getName() + " age " + steve.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");
        System.out.println( bianca.getName()+" age " + bianca.age() + " years");
    }
}
