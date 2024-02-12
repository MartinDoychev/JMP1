/*Напишете Java програма за извличане, без да премахвате първия елемент на linked list */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        String firstElement = linkedList.peek();

        System.out.println("Първият елемент на списъка: " + firstElement);

        System.out.println("Свързаният списък след извличането:");

        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}