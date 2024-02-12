/*Напишете Java програма за вмъкване на определен елемент в края на linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        String elementToInsert = "Елемент 5";

        linkedList.addLast(elementToInsert);

        System.out.println("Свързаният списък след вмъкване на \"" + elementToInsert + "\" в края:");

        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}