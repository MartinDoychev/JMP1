/*Използвайки масив от цели числа, който вече е бил сортиран, напишете програма, която използва Binary Search, за да намери дали дадено число, въведено от потребителя, се съдържа в масива. Програмата трябва да изведе индекса на търсеното число или съобщение, че числото не е намерено. */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете брой на елементите в масива: ");
        int n = scanner.nextInt();

        int[] sortedArray = new int[n];
        System.out.println("Въведете сортирания масив:");
        for (int i = 0; i < n; i++) {
            sortedArray[i] = scanner.nextInt();
        }

        System.out.print("Въведете число за търсене: ");
        int target = scanner.nextInt();

        int index = binarySearch(sortedArray, target);

        if (index != -1) {
            System.out.println("Числото " + target + " е намерено на позиция: " + index);
        } else {
            System.out.println("Числото " + target + " не е намерено в масива.");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
