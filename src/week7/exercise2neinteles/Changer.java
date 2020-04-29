package week7.exercise2neinteles;

import java.util.ArrayList;
import java.util.List;

public class Changer {
     static List<Change> listaDeChangeuri=new ArrayList<>();

    public Changer() {
    }

    public void addChange(Change change){
        listaDeChangeuri.add(change);
    }

    public String change(String characterString){
        for (Change ch:listaDeChangeuri){
            characterString=ch.change(characterString);
        }
       return characterString;
    }

}
