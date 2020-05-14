package week8.exercise11;

public class Book implements ToBeStored{


    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(writer);
        sb.append(": ").append(name);
        return sb.toString();
    }

    @Override
    public double weight() {
        return weight;
    }
}
