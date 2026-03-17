package interview;
/* Created by ayesh on 26-01-2026 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {

    private static final int MAX = 10;
    private static int counter = 1;
    private static int turn = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> printInOrder(1), "Thread - 1");
        t1.start();
    }

    private static void printInOrder(int threadNumber) {

        while (true) {
            synchronized (lock) {
                if (turn != threadNumber) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
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
