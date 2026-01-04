package linkedlist;
/*
Remove Duplicates from Sorted Linked List

Problem:
Remove duplicates so that each element appears only once.

Example:
Input: 1 → 1 → 2 → 3 → 3
Output: 1 → 2 → 3
 */

public class RemoveDuplicatesFromSortedLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }


    }

    static void displayLL(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }

    private static ListNode removeDuplicatesFromLL(ListNode head) {

        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        displayLL(head);

        ListNode listNode = removeDuplicatesFromLL(head);
        System.out.println();
        displayLL(listNode);
    }


}
