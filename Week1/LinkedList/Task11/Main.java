/*Напишете Java програма за показване на елементите и техните позиции в linked list */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        System.out.println("Елементи и техни позиции в свързания списък:");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Позиция " + i + ": " + linkedList.get(i));
        }
    }
}