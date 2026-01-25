package linkedlist;
/*

 */

public class CycleDetection {
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

    private static boolean detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        // Linking nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Creating a cycle: 4 → 2
        node4.next = node2;


      //  displayLL(node1);
        System.out.println();

        System.out.println(detectCycle(node1));

    }

}
