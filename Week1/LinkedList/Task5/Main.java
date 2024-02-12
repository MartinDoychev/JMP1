/*Напишете Java програма за вмъкване на определен елемент на определена позиция в linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        String elementToInsert = "Нов елемент";

        int positionToInsert = 1;

        linkedList.add(positionToInsert, elementToInsert);

        System.out.println("Свързаният списък след вмъкване на \"" + elementToInsert + "\" на позиция " + positionToInsert + ":");

        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}