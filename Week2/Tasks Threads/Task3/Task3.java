/*Напишете Java програма, която изчислява сумата на всички прости числа до даден лимит, използвайки множество нишки. */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Task3 {

    public static void main(String[] args) {
        int limit = 1000;

        long sumOfPrimeNumbers = calculateSumOfPrimes(limit);

        System.out.println("Сумата на простите числа до " + limit + " е: " + sumOfPrimeNumbers);
    }

    public static long calculateSumOfPrimes(int limit) {
        AtomicLong sum = new AtomicLong(0);
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int number = 2; number <= limit; number++) {
            final int currentNumber = number;
            executorService.submit(() -> {
                if (isPrime(currentNumber)) {
                    sum.addAndGet(currentNumber);
                }
            });
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }

        return sum.get();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
