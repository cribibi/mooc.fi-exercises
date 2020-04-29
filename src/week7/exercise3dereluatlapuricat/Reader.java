package week7.exercise3dereluatlapuricat;

import java.util.Scanner;

public class Reader {
    private Scanner reader;

    public Reader() {
        this.reader = new Scanner(System.in);
    }

    public String readString() {
        String scanString = reader.nextLine();
        return scanString;
    }

    public int readInteger() {
        Integer scanInteger = Integer.parseInt(reader.nextLine());
        return scanInteger;
    }

}
