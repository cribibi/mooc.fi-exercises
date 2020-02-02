package week4.exercise77;

public class Exercise77p6 {
        public static void main(String[] args) {
            Exercise77LyyraCardP6 cardPekka = new Exercise77LyyraCardP6(20);
            Exercise77LyyraCardP6 cardBrian = new Exercise77LyyraCardP6(30);
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

