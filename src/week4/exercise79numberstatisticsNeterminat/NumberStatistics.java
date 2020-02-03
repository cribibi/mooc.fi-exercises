package week4.exercise79numberstatisticsNeterminat;
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = amountOfNumbers();
    }

    public void addNumber(int number) {
        amountOfNumbers = amountOfNumbers + 1;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        sum=sum;
    return sum;
    }

    public double average() {
        return sum() / amountOfNumbers;
    }

}
