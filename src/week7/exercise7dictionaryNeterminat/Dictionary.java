package week7.exercise7dictionaryNeterminat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
     Map<String, String> dictionar = new HashMap<>();

    public String translate(String word) {
        if (dictionar.containsKey(word)) {
            return dictionar.get(word);
        } else return null;
    }

    public void add(String word, String translation) {
        dictionar.put(word, translation);
    }

    public int amountOfWords() {
        return dictionar.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String>lista=new ArrayList();
        for (String key:dictionar.keySet()){
            lista.add(key);
        }
        return lista;

    }
}
