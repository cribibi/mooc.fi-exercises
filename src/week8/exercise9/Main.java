package week8.exercise9;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate new2 = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(new2)) {
            finnish.add(new2);
        }
        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");


        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        // if the hashCode hasn't been overwritten, the owners are not found
        System.out.println("===============================================");

        //Main pentru punctul 2

        RegistrationPlate reg4 = new RegistrationPlate("RO", "B aa-400");
        RegistrationPlate reg5 = new RegistrationPlate("RO", "B bb-401");
        RegistrationPlate reg6 = new RegistrationPlate("RO", "B cc-402");
        RegistrationPlate reg7 = new RegistrationPlate("RO", "B dd-403");
        RegistrationPlate reg8 = new RegistrationPlate("RO", "B ee-404");

        owners.put(reg2, null);
        owners.put(reg4, null);
        owners.put(reg5, null);
        owners.put(reg6, null);

        VehicleRegister vr = new VehicleRegister();

        vr.setOwners(owners);

        vr.add(reg1, "bia"); //ignorat
        vr.add(reg3, "melania"); //ignorat
        vr.add(reg2, "bianca"); //adaugat
        vr.add(reg4, "bianca"); //adaugat
        vr.add(reg5, "bianca"); //adaugat
        vr.add(reg6, "bianca"); //adaugat

        System.out.println(vr.get(reg2));
        System.out.println(vr.get(reg4));
        System.out.println(vr.get(reg5));
        System.out.println(vr.get(reg6));

        vr.delete(reg4);
        System.out.println("=====print dupa stergerea lui reg4=====");
        System.out.println(vr.get(reg4));
        System.out.println(vr.get(reg6));
        System.out.println("printam placutele de inmatriculare:");
        vr.printRegistrationPlates();
        System.out.println("printam proprietarii:");
        vr.printOwners();
    }

}
