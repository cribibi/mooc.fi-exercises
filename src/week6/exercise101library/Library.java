package week6.exercise101library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> listaCarti = new ArrayList<>();

    public Library() {
    }

    public void addBook(Book newBook) {
        listaCarti.add(newBook);

    }

    public void printBooks() {
        for (int i = 0; i < listaCarti.size(); i++) {
            System.out.println(listaCarti.get(i));
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (int i = 0; i < listaCarti.size(); i++) {
            if (listaCarti.get(i).title.contains(title)) {
                found.add(listaCarti.get(i));
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (int i = 0; i < listaCarti.size(); i++) {
            if (listaCarti.get(i).publisher.contains(publisher)) {
                found.add(listaCarti.get(i));
            }
        }
        return found;
    }


    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (int i = 0; i < listaCarti.size(); i++) {
            if (listaCarti.get(i).year == year) {
                found.add(listaCarti.get(i));
            }
        }
        return found;
    }

    public static boolean included(String word, String searched) {
        if (word.toUpperCase().contains(searched.toUpperCase().trim())) {
            return true;
        } else return false;
    }

    public ArrayList<Book> searchByTitleImproved(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (int i = 0; i < listaCarti.size(); i++) {
            if (included(listaCarti.get(i).title, title)){
                found.add(listaCarti.get(i));
            }
        }
        return found;
    }
    public ArrayList<Book> searchByPublisherImproved(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (int i = 0; i < listaCarti.size(); i++) {
            if (included(listaCarti.get(i).publisher, publisher)) {
                found.add(listaCarti.get(i));
            }
        }
        return found;
    }

}

