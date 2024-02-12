/*Напишете Java програма за премахване и връщане на първия елемент от linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        String removedElement = linkedList.poll();

        System.out.println("Свързаният списък след премахване и връщане на първия елемент:");

        for (String element : linkedList) {
            System.out.println(element);
        }

        System.out.println("Премахнатият елемент: " + removedElement);
    }
}