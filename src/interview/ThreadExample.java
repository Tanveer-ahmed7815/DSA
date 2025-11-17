package interview;
/* Created by ayesh on 12-11-2025 */

/*
THREAD-1 : 1 THREAD-2 : 2 THREAD-3 : 3
THREAD-1 : 4 THREAD-2 : 5 THREAD-3 : 6
THREAD-1 : 7 THREAD-2 : 8 THREAD-3 : 9
THREAD-1 : 10
*/

public class ThreadExample {
    private static final int MAX = 10;
    private static int counter = 1;
    private static int turn = 1;

    private static final Object lock = new Object();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> printInOrder(1), "THREAD-1");
        Thread thread2 = new Thread(() -> printInOrder(2), "THREAD-2");
        Thread thread3 = new Thread(() -> printInOrder(3), "THREAD-3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

    private static void printInOrder(int threadNumber) {

        while (true) {
            synchronized (lock) {
                while (turn != threadNumber) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (counter > MAX) {
                    lock.notifyAll();
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " : " + counter);
                counter++;

                turn = (turn % 3) + 1;
                lock.notifyAll();
            }
        }

    }
}

