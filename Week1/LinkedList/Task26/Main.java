/*Напишете Java програма за замяна на елемент в linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        System.out.println("Свързаният списък преди замяната:");

        for (String element : linkedList) {
            System.out.println(element);
        }

        String newElement = "Eлемент 5";
        linkedList.set(1, newElement);

        System.out.println("\nСвързаният списък след замяната:");

        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}