package week4;

public class Exercise73Product {
    String nameAtStart;
    double priceAtStart;
    int amountAtStart;

    public Exercise73Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }
    public void printProduct(){
        System.out.println(nameAtStart+", price "+priceAtStart+", amount "+amountAtStart);
    }
}
