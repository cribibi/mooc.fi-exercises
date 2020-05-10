package week8.exercise9Neterminat;

import java.util.HashMap;

public class VehicleRegister {
    public RegistrationPlate plate;
    public String owner;
    public HashMap<RegistrationPlate, String> owners;

    public boolean add(RegistrationPlate plate, String owner){
        if ((!owners.containsKey(plate))) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate){
        return null;
    }

    public boolean delete(RegistrationPlate plate){
        return true;
    }

    public void printRegistrationPlates(){
        System.out.println(owners.keySet());


    }

    public void printOwners(){
        System.out.println(owners.entrySet());
    }

}
