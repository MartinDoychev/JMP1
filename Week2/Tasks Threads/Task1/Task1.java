/*Напишете Java програма, която сортира масив от цели числа, използвайки множество нишки. */

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array: " + Arrays.toString(array));

        parallelMergeSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void parallelMergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        Thread leftSortThread = new Thread(() -> parallelMergeSort(left));
        Thread rightSortThread = new Thread(() -> parallelMergeSort(right));

        leftSortThread.start();
        rightSortThread.start();

        try {
            leftSortThread.join();
            rightSortThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
}

