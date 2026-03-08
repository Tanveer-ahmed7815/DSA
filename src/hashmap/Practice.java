package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {

    static final int MAX = 10;
    static int counter = 1;
    static int turn = 1;

    static Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> printOrder(1), "Thread 1");
        Thread thread2 = new Thread(() -> printOrder(2), "Thread 2");
        Thread thread3 = new Thread(() -> printOrder(3), "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static void printOrder(int order) {

        while (true) {
            synchronized (lock) {
                while (turn != order) {
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
