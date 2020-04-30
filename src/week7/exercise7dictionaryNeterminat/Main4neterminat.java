package week7.exercise7dictionaryNeterminat;

import java.util.Scanner;

public class Main4neterminat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterfaceneterminat ui = new TextUserInterfaceneterminat(reader, dict);
        ui.start();

    }
}
