package week7.exercise4dereluatlapuricat;

public class TestBianca {
    public static void main(String[] args) {
        int max = 1000;
        int nrValize = 0;
        int sum = 0;
        for (int j = 1; j < 101; j++) {
            if (sum + j < max) {
                sum = sum + j;
                nrValize=nrValize+1;
            }
        }

        System.out.println(sum);
        System.out.println(nrValize);
    }
}
