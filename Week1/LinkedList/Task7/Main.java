/*Напишете Java програма за вмъкване на определен елемент в началото на linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        String elementToInsert = "Елемент 4";

        linkedList.addFirst(elementToInsert);

        System.out.println("Свързаният списък след вмъкване на \"" + elementToInsert + "\" в началото:");

        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}

