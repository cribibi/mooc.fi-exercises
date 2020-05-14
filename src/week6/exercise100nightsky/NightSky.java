package week6.exercise100nightsky;

import java.util.Random;

public class NightSky {
    double density;
    int width;
    int height;

    int starInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    //de la Florin Stanciu
    public void printLine() {
        //printam o linie cf cerintei din problema
        //metoda nextDouble() din Random intoarce un numar cuprins intre 0.0 si 1.0 (consideram 0%-100%)
        //densitatea de stars=0.1 (0.1=10%),deci se va verifica daca numarul intors de Random.nextDouble()<=0.1
        //Trebuie  sa avem (generam ) maxim 0.1(10%) stars, din totalul de "width"  spatii

        for (int i = 0; i < this.width; i++) {
            if (new Random().nextDouble() <= 0.1) {
                System.out.print("*");
                this.starInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        this.starInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint() {
        return this.starInLastPrint;
    }
}
