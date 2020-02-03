package week4.exercise77lyyracard;

public class MainP12345 {
        public static void main(String[] args) {
            LyyraCardP12345 card = new LyyraCardP12345(100);
            System.out.println(card);

            card.payEconomical();
            System.out.println(card);

            card.payGourmet();
            System.out.println(card);

            card.payEconomical();
            System.out.println(card);

            card.loadMoney(-10);
            System.out.println(card);

        }
    }

