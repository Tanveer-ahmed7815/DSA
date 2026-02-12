package linkedlist;
/*
Reverse a Linked List

Problem:
Given the head of a singly linked list, reverse the list.

Example:
Input: 1 → 2 → 3 → 4 → null
Output: 4 → 3 → 2 → 1 → null
 */

import java.util.List;

public class PracticeAgain {

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

    private static boolean findLinkedListCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        head.next.next.next.next = head.next;


      //  displayLL(head);
        System.out.println();

        System.out.println(findLinkedListCycle(head));


    }


}
