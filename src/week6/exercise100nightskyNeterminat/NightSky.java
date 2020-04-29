package week6.exercise100nightskyNeterminat;

import java.util.Random;

public class NightSky {
    double density;
    int width;
    int height;

    public NightSky(double density) {
        this.density=density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height){
        this.width=width;
        this.height=height;
        this.density=0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density=density;
        this.width=width;
        this.height=height;
    }
//nu e bine, nu e terminat
    public void printLine(){
        String optiuni="* ";
        Random rand=new Random();
        int densitate=(int) density*width;
        int x=0;
        for (int i = 0; i <width ; i++) {
            int randNr=rand.nextInt(2);
            System.out.print(optiuni.charAt(randNr));
        }

    }
//    The line length is determined by the value of the instance
//    variable width and the instance variable density determines the star probability.
//    For each printed character you should use a Random object to decide
//        if it prints out as a white space or a star.
//    The method nextDouble will probably be of use now.



}
