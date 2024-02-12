/*Напишете Java програма за проверка дали определен елемент съществува в linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        String elementToCheck = "Елемент 3";

        boolean exists = linkedList.contains(elementToCheck);

        if (exists) {
            System.out.println("Елементът \"" + elementToCheck + "\" съществува в списъка.");
        } else {
            System.out.println("Елементът \"" + elementToCheck + "\" не съществува в списъка.");
        }
    }
}