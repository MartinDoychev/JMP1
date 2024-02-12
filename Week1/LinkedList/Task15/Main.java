/*Напишете Java програма, която разменя два елемента в linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");
        linkedList.add("Елемент 4");
        linkedList.add("Елемент 5");

        System.out.println("Свързаният списък преди размяната:");

        for (String element : linkedList) {
            System.out.println(element);
        }

        swapElements(linkedList, 1, 3);

        System.out.println("\nСвързаният списък след размяната:");

        for (String element : linkedList) {
            System.out.println(element);
        }
    }

    public static <T> void swapElements(LinkedList<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}