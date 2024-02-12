/*Напишете Java програма за премахване на всички елементи от linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");
        linkedList.add("Елемент 4");
        linkedList.add("Елемент 5");

        linkedList.clear();

        System.out.println("Свързаният списък след премахване на всички елементи:");

        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}