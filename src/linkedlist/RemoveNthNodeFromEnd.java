package linkedlist;
/*
Remove Nth Node From End

Problem:
Remove the Nth node from the end of the list.

Example:
Input: 1 → 2 → 3 → 4 → 5, n = 2
Output: 1 → 2 → 3 → 5
*/

public class RemoveNthNodeFromEnd {

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

    private static ListNode removeNthNode(ListNode head, int index) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= index; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }

    private static ListNode getNode(ListNode head, int index) {

        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        displayLL(head);

        System.out.println();

        ListNode listNode = removeNthNode(head, 2);

        displayLL(listNode);

    }

}
