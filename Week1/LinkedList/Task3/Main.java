/*Напишете Java програма за обхождане на всички елементи в linked list, започвайки от определена позиция */

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

        int startingPosition = 2;

        ListIterator<String> iterator = linkedList.listIterator(startingPosition);

        System.out.println("Елементите в свързания списък, започвайки от позиция " + startingPosition + ":");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
