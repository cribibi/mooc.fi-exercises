package week6.exercise94phonebook;

public class Person {
    String name;
    String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
    public void changeNumber(String newNumber){
        this.number=newNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(name);
        sb.append(" number: ").append(number);
        return sb.toString();
    }
}
