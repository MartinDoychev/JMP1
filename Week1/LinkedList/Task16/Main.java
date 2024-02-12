/*Напишете Java програма за разбъркване на елементите в linked list. */

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");
        linkedList.add("Елемент 4");
        linkedList.add("Елемент 5");

        Collections.shuffle(linkedList);

        System.out.println("Свързаният списък след разбъркване:");
        
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
