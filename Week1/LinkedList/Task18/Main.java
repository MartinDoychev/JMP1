/*Напишете Java програма за копиране на linked list в друг linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Елемент 1");
        originalList.add("Елемент 2");
        originalList.add("Елемент 3");

        LinkedList<String> copiedList = copyList(originalList);

        System.out.println("Копираният списък:");

        for (String element : copiedList) {
            System.out.println(element);
        }
    }

    public static <T> LinkedList<T> copyList(LinkedList<T> originalList) {
        LinkedList<T> copiedList = new LinkedList<>(originalList);
        return copiedList;
    }
}