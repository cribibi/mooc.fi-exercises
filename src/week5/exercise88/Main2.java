package week5.exercise88;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("")) {
                break;
            } else {
                System.out.print("student number: ");
                String number = scanner.nextLine();
                Student student = new Student(name, number);
                list.add(student);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.print("Give search item: ");
        String search = scanner.nextLine();

        System.out.println("Result: ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(search)) {
                System.out.println(list.get(i));
            }
        }
    }
}
