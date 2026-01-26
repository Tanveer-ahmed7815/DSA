package stack;
/* Created by ayesh on 26-01-2026 */

import java.util.Stack;

public class ImplementQueueUsingStackRemoveEfficient {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public ImplementQueueUsingStackRemoveEfficient() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public int pop() {
        return first.pop();
    }

    public void push(int item) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }

    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public int peeked() {
        return first.peek();
    }

    public static void main(String[] args) {
        //same as ImplementQueueUsingStackAddEfficient
    }

}
