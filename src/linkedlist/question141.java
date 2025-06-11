public class question141 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }

            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;


                if (slow == fast) {
                    return true;
                }
            }

            return false;
        }

        public static void main(String[] args) {

            // Create nodes
            ListNode head1 = new ListNode(3);
            ListNode node2_1 = new ListNode(2);
            ListNode node0_1 = new ListNode(0);
            ListNode nodeMinus4_1 = new ListNode(-4);

            // Build the list: 3 -> 2 -> 0 -> -4
            head1.next = node2_1;
            node2_1.next = node0_1;
            node0_1.next = nodeMinus4_1;

            // Create a cycle: -4 points back to 2
            nodeMinus4_1.next = node2_1;

            Solution sol = new Solution();
            boolean hasCycle1 = sol.hasCycle(head1);
            System.out.println("List 1 has cycle: " + hasCycle1); // Expected: true

            // --- Test Case 2: Linked list without a cycle ---
            ListNode head2 = new ListNode(1);
            ListNode node2_2 = new ListNode(2);
            head2.next = node2_2;

            boolean hasCycle2 = sol.hasCycle(head2);
            System.out.println("List 2 has cycle: " + hasCycle2); // Expected: false

            // --- Test Case 3: Empty list ---
            ListNode head3 = null;
            boolean hasCycle3 = sol.hasCycle(head3);
            System.out.println("List 3 has cycle: " + hasCycle3); // Expected: false


        }
    }
}