package linkedlist;
/*
Reverse a Linked List

Problem:
Given the head of a singly linked list, reverse the list.

Example:
Input: 1 → 2 → 3 → 4 → null
Output: 4 → 3 → 2 → 1 → null
 */

public class ReverseLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private static void displayOriginalLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

    private static ListNode reversLinkedList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        displayOriginalLinkedList(head);

        head = reversLinkedList(head);
        System.out.println();
        System.out.println("Reversed List:");
        displayOriginalLinkedList(head);

    }


}
