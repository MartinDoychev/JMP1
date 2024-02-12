/*Напишете Java програма за намиране на първото и последното срещане на определени елементи в linked list */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(5);

        int elementToFind = 2;

        int firstIndex = linkedList.indexOf(elementToFind);

        int lastIndex = linkedList.lastIndexOf(elementToFind);

        System.out.println("Първото срещане на елемента " + elementToFind + " е на позиция: " + firstIndex);
        System.out.println("Последното срещане на елемента " + elementToFind + " е на позиция: " + lastIndex);
    }
}
