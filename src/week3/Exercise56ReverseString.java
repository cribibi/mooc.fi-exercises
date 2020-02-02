package week3;
import java.util.Scanner;
public class Exercise56ReverseString {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        String reverseText=reverse(text);
        System.out.println("In reverse order: " + reverseText);
    }

    public static String reverse(String text) {
        String help= ""; //am creat un string gol
        //facem un for invers, lungimea e cu 1 mai mare decat poz ultimului element
        //deoarece lungimea il numara si pe 0
        // (de la 0 la 3 sunt 4 poz, dar index(4) nu exista
        //si mergem pana la 0
        for (int i = text.length()-1; i >-1 ; i--) {
            help = help + (text.charAt(i)); //adaugam caracterul de la pozitia i
        }
        return help;

    }

}
