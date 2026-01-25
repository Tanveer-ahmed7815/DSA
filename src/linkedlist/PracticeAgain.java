package linkedlist;
/*
Reverse a Linked List

Problem:
Given the head of a singly linked list, reverse the list.

Example:
Input: 1 → 2 → 3 → 4 → null
Output: 4 → 3 → 2 → 1 → null
 */

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

    //Input: 1 → null
    // 2 → 3 → 4 → null
    //Output: 4 → 3 → 2 → 1 → null
    private static ListNode reverseLL(ListNode head) {

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

    private static ListNode middleLL(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private static ListNode removeDuplicates(ListNode head) {

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

    //Input: 1 → 3 → 5, 2 → 4 → 6
    //Output: 1 → 2 → 3 → 4 → 5 → 6
    private static ListNode mergeLL(ListNode head1, ListNode head2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if (head1 != null) {
            curr.next = head1.next;
        }
        if (head2 != null) {
            curr.next = head2.next;
        }
        return dummy.next;
    }

    //Input: 1 → 2 → 3 → 4 → 5, n = 2
    //Output: 1 → 2 → 3 → 5
    private static ListNode removeNthNode(ListNode head, int index) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = head;
        ListNode slow = head;

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


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(4);

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(6);

        displayLL(head);
        System.out.println();

//        ListNode reverseLL = reverseLL(head);
//        displayLL(reverseLL);
//        System.out.println();

//        ListNode middledLL = middleLL(head);
//        System.out.println(middledLL.val);

//        ListNode node = removeDuplicates(head);
//        displayLL(node);
//        System.out.println();

//        ListNode listNode = mergeLL(head, head1);
//        displayLL(listNode);
//        System.out.println();

        ListNode listNode = removeNthNode(head, 3);
        displayLL(listNode);
    }


}
