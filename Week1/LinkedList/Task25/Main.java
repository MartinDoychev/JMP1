/*Напишете Java програма за проверка дали linked list е празен или не. */

import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        LinkedList<String> emptyList = new LinkedList<>();

        LinkedList<String> nonEmptyList = new LinkedList<>();
        nonEmptyList.add("Елемент 1");

        boolean isEmpty1 = emptyList.isEmpty();
        boolean isEmpty2 = nonEmptyList.isEmpty();

        System.out.println("Празен свързан списък: " + isEmpty1);
        System.out.println("Непразен свързан списък: " + isEmpty2);
    }
}