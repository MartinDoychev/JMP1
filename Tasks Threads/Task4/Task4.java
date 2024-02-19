/*Напишете Java програма за създаване и стартиране на множество нишки, които конкурентно увеличават споделена променлива на брояч. */

public class Task4 {

    private static int counter = 0;

    public static void main(String[] args) {
        int numberOfThreads = 5;

        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new IncrementThread();
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Стойност на брояча след увеличаването от всички нишки: " + counter);
    }

    static class IncrementThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                incrementCounter();
            }
        }
    }

    private synchronized static void incrementCounter() {
        counter++;
    }
}