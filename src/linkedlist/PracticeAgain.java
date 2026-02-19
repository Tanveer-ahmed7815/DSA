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

    //1 -> 2 -> 3 -> 4 ->
    //1 -> null
    private static ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;
        }

        return prev;

    }

    private static ListNode findMiddleOfLL(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    private static boolean detectCycleLL(ListNode head) {
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

    //1 -> 2 -> 2 -> 4 ->
    private static ListNode removeDuplicates(ListNode head) {
        ListNode node = head;

        while (node != null && node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }

        }

        return head;
    }

    //Input: 1 → 3 → 5, 2 → 4 → 6
    //Output: 1 → 2 → 3 → 4 → 5 → 6
    private static ListNode mergeTwoLL(ListNode node1, ListNode node2) {

        ListNode node = new ListNode(-1);
        ListNode dummy = node;

        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                dummy.next = node1;
                node1 = node1.next;
            } else {
                dummy.next = node2;
                node2 = node2.next;
            }
            dummy = dummy.next;
        }

        if (node1 != null) {
            dummy.next = node1;
        }

        if (node2 != null) {
            dummy.next = node2;
        }


        return node.next;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // n4.next = n2;


        //displayLL(head);
        System.out.println();
        // ListNode listNode = reverseLL(head);

        //  displayLL(listNode);

        System.out.println();

        //   ListNode middleOfLL = findMiddleOfLL(head);
        //  System.out.println(middleOfLL.val);

//        boolean b = detectCycleLL(n1);
//        System.out.println(b);

        //  ListNode node = removeDuplicates(head);

        //   displayLL(node);

        ListNode listNode = mergeTwoLL(head, n1);
        displayLL(listNode);
    }


}
