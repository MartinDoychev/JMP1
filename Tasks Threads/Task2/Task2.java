/*Напишете Java програма, която извършва умножение на матрици, използвайки множество нишки */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2 {

    public static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrixB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        if (colsA != rowsB) {
            System.out.println("Невалидни размери на матриците за умножение.");
            return;
        }

        int[][] result = new int[rowsA][colsB];
        multiplyMatrices(matrixA, matrixB, result);

        System.out.println("Матрица A:");  
        printMatrix(matrixA);
        System.out.println("\nМатрица B:");
        printMatrix(matrixB);
        System.out.println("\nРезултат:");
        printMatrix(result);
    }

    public static void multiplyMatrices(int[][] matrixA, int[][] matrixB, int[][] result) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        ExecutorService executorService = Executors.newFixedThreadPool(rowsA);

        for (int i = 0; i < rowsA; i++) {
            final int row = i;
            executorService.submit(() -> {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        result[row][j] += matrixA[row][k] * matrixB[k][j];
                    }
                }
            });
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
