/*Напишете програма, която приема масив от цели числа, въведен от потребителя, и го сортира използвайки:
Bubble Sort
Merge Sort
Quick Sort
След сортирането, програмата трябва да изведе сортирания масив.  */

import java.util.Arrays;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на броя на елементите в масива
        System.out.print("Въведете брой на елементите в масива: ");
        int n = scanner.nextInt();

        // Въвеждане на елементите на масива
        System.out.println("Въведете елементите на масива:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] bubbleSortedArray = Arrays.copyOf(array, array.length);
        bubbleSort(bubbleSortedArray);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSortedArray));

        int[] mergeSortedArray = Arrays.copyOf(array, array.length);
        mergeSort(mergeSortedArray, 0, mergeSortedArray.length - 1);
        System.out.println("Merge Sort: " + Arrays.toString(mergeSortedArray));

        int[] quickSortedArray = Arrays.copyOf(array, array.length);
        quickSort(quickSortedArray, 0, quickSortedArray.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(quickSortedArray));
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = Arrays.copyOfRange(array, left, left + n1);
        int[] rightArray = Arrays.copyOfRange(array, middle + 1, middle + 1 + n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);

            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}