/*Напишете Java програма за премахване на първия и последния елемент от linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");
        linkedList.add("Елемент 4");
        linkedList.add("Елемент 5");

        String firstElement = linkedList.removeFirst();

        String lastElement = linkedList.removeLast();

        System.out.println("Свързаният списък след премахване на първия и последния елемент:");

        for (String element : linkedList) {
            System.out.println(element);
        }

        System.out.println("Първият премахнат елемент: " + firstElement);
        System.out.println("Последният премахнат елемент: " + lastElement);
    }
}