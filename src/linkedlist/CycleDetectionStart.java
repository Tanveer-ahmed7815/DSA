package linkedlist;
/*
Linked List Cycle II — LC 142

Pattern: Fast & Slow pointer

Input:
head = [3,2,0,-4], pos = 1
Output:
Node with value 2
 */

public class CycleDetectionStart {
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

    private static ListNode detectCycleStart(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Linking nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Creating a cycle: 4 → 2
        node4.next = node2;

        //  displayLL(node1);
        System.out.println();

        ListNode listNode = detectCycleStart(node1);
        System.out.println(listNode.val);
    }


}
