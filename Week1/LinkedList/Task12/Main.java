/*Напишете Java програма за премахване на определен елемент от linked list */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        String elementToRemove = "Елемент 2";

        linkedList.remove(elementToRemove);

        System.out.println("Свързаният списък след премахване на \"" + elementToRemove + "\":");

        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}