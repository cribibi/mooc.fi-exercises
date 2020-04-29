package week7.exercise3Neterminat;

import java.util.Scanner;

public class Reader {
    public Scanner reader;

    public Reader(Scanner reader) {
        this.reader = reader;
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
