/*Напишете Java програма за сравняване на два linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Елемент 1");
        list1.add("Елемент 2");
        list1.add("Елемент 3");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Елемент 1");
        list2.add("Елемент 2");
        list2.add("Елемент 3");

        boolean isEqual = list1.equals(list2);

        if (isEqual) {
            System.out.println("Двете свързани списъка са еднакви.");
        } else {
            System.out.println("Двете свързани списъка не са еднакви.");
        }
    }
}