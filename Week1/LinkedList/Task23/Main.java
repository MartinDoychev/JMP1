/*Напишете Java програма за преобразуване на linked list в array list. */

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");

        ArrayList<String> arrayList = new ArrayList<>(linkedList);

        System.out.println("Списъкът от масив след преобразуването:");
        
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
