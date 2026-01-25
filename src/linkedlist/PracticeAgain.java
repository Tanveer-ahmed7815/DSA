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

    private static ListNode middleOfLL(ListNode head) {

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

    //            1 -> 2 -> 3 -> 3 -> 5 ->
//            1 -> 2 -> 4 -> 6 ->
    private static ListNode mergeLL(ListNode head1, ListNode head2) {

        ListNode node1 = head1;
        ListNode node2 = head2;

        ListNode sortedLL = new ListNode(-1);
        ListNode dummy = sortedLL;

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
        } else {
            dummy.next = node2;
        }

        return sortedLL.next;
    }

    private static ListNode removeNthNodeLL(ListNode head, int index) {
        ListNode curr = head;
        if (index == 0) {
            head = curr.next;
            return head;
        }


        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }

        if (curr.next.next == null) {
            curr.next = null;
            return head;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }

        return head;
    }

    private static int findLengthLL(ListNode head) {

        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }


    private static ListNode searchElementLL(ListNode head, int i) {

        ListNode curr = head;

        while (curr != null) {
            if (curr.val == i) {
                return curr;
            }
            curr = curr.next;
        }

        return head;

    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        displayLL(head);
        System.out.println();

//        ListNode head1 = new ListNode(1);
//        head1.next = new ListNode(2);
//        head1.next.next = new ListNode(4);
//        head1.next.next.next = new ListNode(6);
//
//        displayLL(head1);
//        System.out.println();

//        ListNode listNode = reverseLL(head);
//        displayLL(listNode);
//        System.out.println();

//        ListNode middleNode = middleOfLL(head);
//        System.out.println(middleNode.val);

//        ListNode removedDuplicates = removeDuplicates(head);
//        displayLL(removedDuplicates);
//        System.out.println();

//        ListNode listNode = mergeLL(head, head1);
//        displayLL(listNode);
//        System.out.println();

//        ListNode head2 = removeNthNodeLL(head, 4);
//        displayLL(head2);
//        System.out.println();

//        int lengthLL = findLengthLL(head);
//        System.out.println(lengthLL);

        ListNode listNode = searchElementLL(head, 2);
        System.out.println(listNode.val);


    }

}
