package week8.exercise11;

public class CD implements ToBeStored {
    // CD's parameter contains its artist (String), title (String),
    // and publishing year (int). All CDs weigh 0.1 kg.
    private String artist;
    private String title;
    private int publishingYear;
    private final double weight = 0.1;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(artist);
        sb.append(": ").append(title).append(" (").append(publishingYear);
        sb.append(')');
        return sb.toString();
    }

    @Override
    public double weight() {
        return weight;
    }
}
