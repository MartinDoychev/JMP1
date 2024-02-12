/*Напишете Java програма за добавяне на определен елемент в края на linked list */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        int elementToAdd = 4;

        addElementToEnd(linkedList, elementToAdd);

        System.out.println("Свързаният списък след добавяне на " + elementToAdd + " в края:");
        for (Integer element : linkedList) {
            System.out.println(element);
        }
    }

    public static <T> void addElementToEnd(LinkedList<T> linkedList, T element) {
        linkedList.addLast(element);
    }
}
