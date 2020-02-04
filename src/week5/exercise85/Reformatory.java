package week5.exercise85;

import libs.Person;

public class Reformatory {
    int i;

    public int weight(Person person) {
        // returns the weight of the parameter
        i = i + 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(weight(person) + 1);
    }

    public int totalWeightsMeasured() {
        return i;
    }
}
