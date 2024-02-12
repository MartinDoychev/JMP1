/*Напишете Java програма за вмъкване на някои елементи на определена позиция в linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        String[] elementsToInsert = {"Елемент 5", "Елемент 7", "Елемент 9"};

        int positionToInsert = 1;

        for (String element : elementsToInsert) {
            linkedList.add(positionToInsert, element);
            positionToInsert++;
        }

        System.out.println("Свързаният списък след вмъкване на елементи на позиция " + (positionToInsert - elementsToInsert.length) + ":");

        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}