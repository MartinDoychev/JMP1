/*Напишете Java програма за създаване на сценарий на производител-консуматор, използвайки методите wait() и notify() за синхронизация на нишките. */

import java.util.LinkedList;

public class Task5 {

    private static final LinkedList<Integer> buffer = new LinkedList<>();
    private static final int BUFFER_CAPACITY = 5;

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                synchronized (buffer) {
                    while (buffer.size() == BUFFER_CAPACITY) {
                        try {
                            System.out.println("Контейнерът е пълен. Производителят чака...");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("Произведено: " + i);
                    buffer.add(i);

                    buffer.notifyAll();
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            System.out.println("Контейнерът е празен. Консуматорът чака...");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    int value = buffer.remove();
                    System.out.println("Консумирано: " + value);

                    buffer.notifyAll();
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
