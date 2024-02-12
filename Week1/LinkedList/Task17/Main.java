/*Напишете Java програма за обединяване на два linked list. */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Елемент 1");
        list1.add("Елемент 2");
        list1.add("Елемент 3");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Елемент A");
        list2.add("Елемент B");
        list2.add("Елемент C");

        LinkedList<String> mergedList = mergeLists(list1, list2);

        System.out.println("Обединеният списък:");

        for (String element : mergedList) {
            System.out.println(element);
        }
    }

    public static <T> LinkedList<T> mergeLists(LinkedList<T> list1, LinkedList<T> list2) {
        LinkedList<T> mergedList = new LinkedList<>();

        mergedList.addAll(list1);

        mergedList.addAll(list2);

        return mergedList;
    }
}