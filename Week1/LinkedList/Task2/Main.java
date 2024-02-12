/*Напишете Java програма за обхождане на всички елементи в linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        System.out.println("Всички елементи в свързания списък:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
