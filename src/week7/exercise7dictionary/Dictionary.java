package week7.exercise7dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<String, String> stringMap = new HashMap<>();

    public String translate(String word) {
        if (stringMap.containsKey(word)) {
            return stringMap.get(word);
        } else return null;
    }

    public void add(String word, String translation) {
        stringMap.put(word, translation);
    }

    public int amountOfWords() {
        return stringMap.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> lista = new ArrayList();
        for (String key : stringMap.keySet()) {
            lista.add(key+" = "+translate(key));
        }
        return lista;

    }
}
