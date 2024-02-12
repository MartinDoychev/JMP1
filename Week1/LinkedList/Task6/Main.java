/*Напишете Java програма за вмъкване на елементи в linked list на първа и последна позиция */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        String firstElement = "Елемент 4";
        String lastElement = "Елемент 5";

        linkedList.addFirst(firstElement);

        linkedList.addLast(lastElement);

        System.out.println("Свързаният списък след вмъкване на елементи на първа и последна позиция:");

        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
