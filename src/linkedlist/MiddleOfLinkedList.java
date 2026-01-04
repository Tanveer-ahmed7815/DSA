package linkedlist;
/*
Find the Middle of a Linked List

Problem:
Return the middle node of the linked list. If there are two middles, return the second one.

Example:
Input: 1 → 2 → 3 → 4 → 5
Output: 3
 */


public class MiddleOfLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

    }

    private static void displayLL(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        displayLL(head);

    }

}
