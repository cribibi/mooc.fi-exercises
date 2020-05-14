package week8.exercise9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class VehicleRegister {
    private RegistrationPlate plate;
    private String owner;
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
    }

    //adaugam numele proprietarilor
    public boolean add(RegistrationPlate plate, String owner) {
        if ((this.owners.containsKey(plate) == true) && this.owners.get(plate) == null) {
            this.owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    //returnam proprietarul masinii
    public String get(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            return this.owners.get(plate);
        } else
            return null;
    }

    //stergem un nr si proprietarul
    public boolean delete(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            return (this.owners.remove(plate, this.owners.get(plate)));
        } else
            return false;
    }

    //printam toate numerele de inmatriculare - key's
    public void printRegistrationPlates() {
        System.out.println(this.owners.keySet());
    }

    //printam toti proprietarii - sg data, chiar daca au mai multe masini
    public void printOwners() {
        //cream o colectie de obiecte - toate
        Collection<String> ownerNames = owners.values();
        //cream un arraylist in care sa avem doar obiecte unice
        ArrayList<String> listaUnica = new ArrayList<>();
        for (String value : ownerNames) {
            if (listaUnica.contains(value)) {
                continue;
            } else {
                listaUnica.add(value);
            }
        }
        System.out.println(listaUnica.toString());
    }


    public void setOwners(HashMap<RegistrationPlate, String> owners) {
        this.owners = owners;
    }
}

