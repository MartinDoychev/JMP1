/*Напишете програма, която визуализира стъпките на Bubble Sort или Quick Sort алгоритъм в конзолата. За всяка итерация програмата трябва да показва текущото състояние на масива, така че да може да се види как алгоритмът променя масива във времето. */

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете брой на елементите в масива: ");
        int n = scanner.nextInt();

        System.out.println("Въведете елементите на масива:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Начално състояние на масива: " + arrayToString(array));
        bubbleSortVisualization(array);
    }

    private static void bubbleSortVisualization(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    System.out.println("Стъпка " + (i * (n - 1) + j + 1) + ": " + arrayToString(array));
                }
            }
        }

        System.out.println("Крайно състояние на масива след Bubble Sort: " + arrayToString(array));
    }

    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
