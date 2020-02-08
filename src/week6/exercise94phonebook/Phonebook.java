package week6.exercise94phonebook;

import java.util.ArrayList;

public class Phonebook {
    java.util.ArrayList<Person> list = new ArrayList<>();

    public void add(String name, String number) {
        Person person = new Person(name, number);
        list.add(person);
    }

    public void printAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public String searchNumber(String name) {
        String answer=new String();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name == name) {
                answer= list.get(i).number;
                break;
            } else {
                answer= "number not known";
            }
        }
    return answer;

    }
}
