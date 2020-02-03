package week4.exercise77lyyracard;

public class MainP6 {
        public static void main(String[] args) {
            LyyraCardP6 cardPekka = new LyyraCardP6(20);
            LyyraCardP6 cardBrian = new LyyraCardP6(30);
            cardPekka.payGourmet();
            cardBrian.payEconomical();

            System.out.println("Pekka: "+cardPekka);
            System.out.println("Brian: "+cardBrian);

            cardPekka.loadMoney(20);
            cardBrian.payGourmet();

            System.out.println("Pekka: "+cardPekka);
            System.out.println("Brian: "+cardBrian);

            cardPekka.payEconomical();
            cardPekka.payEconomical();
            cardBrian.loadMoney(50);

            System.out.println("Pekka: "+cardPekka);
            System.out.println("Brian: "+cardBrian);

        }
    }

