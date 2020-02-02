package week4.exercise77;

public class Exercise77p12345 {
        public static void main(String[] args) {
            Exercise77LyyraCardP12345 card = new Exercise77LyyraCardP12345(100);
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

