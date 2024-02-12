/*Напишете Java програма за обхождане на linked list в обратен ред. */

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");
        linkedList.add("Елемент 4");
        linkedList.add("Елемент 5");

        ListIterator<String> iterator = linkedList.listIterator(linkedList.size());

        System.out.println("Елементите в свързания списък в обратен ред:");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
