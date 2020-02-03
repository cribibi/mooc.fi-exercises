package week4.exercise79numberstatistics;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = amountOfNumbers();
    }

    public void addNumber(int number) {
        sum = sum + number;
        amountOfNumbers = amountOfNumbers + 1;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return (double)sum() / amountOfNumbers;
    }

}
