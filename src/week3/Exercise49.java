package week3;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Type your name: ");
        String name=scanner.nextLine();
        int n=calculateCharacters(name);
        System.out.println("Number of characters: "+n);
        char first=firstCharacter(name);
        System.out.println("The name starts with "+first);
        char last=lastCharacter(name);
        System.out.println("The name ends with "+last);
    }

    public static int calculateCharacters(String name){
        int i= name.length();
        return i;
    }
    public static char firstCharacter(String name) {
        char i = name.charAt(0);
        return i;
    }
    public static char lastCharacter(String name) {
        char i = name.charAt(name.length()-1);
        return i;
    }
}
