package linkedlist;
/*
Merge Two Sorted Linked Lists

Problem:
Merge two sorted linked lists into one sorted list.

Example:
Input: 1 → 3 → 5, 2 → 4 → 6
Output: 1 → 2 → 3 → 4 → 5 → 6
 */

public class MergeTwoSortedLinkedLists {
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

    private static void mergeTwoLists(ListNode head, ListNode head1) {



    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);
        displayLL(head);

        System.out.println();

        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(6);
        displayLL(head1);

        mergeTwoLists(head, head1);
    }

}
