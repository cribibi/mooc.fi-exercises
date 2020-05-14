package week6.exercise101library;

public class Book {
    String title;
    String publisher;
    int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title(){
        return title;
    }
    public String publisher(){
        return publisher;
    }
    public int year(){
        return year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(title).append(", ");
        sb.append(publisher).append(", ");
        sb.append(year);
        return sb.toString();
    }
}
