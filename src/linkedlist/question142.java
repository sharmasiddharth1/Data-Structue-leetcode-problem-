public class question142 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // This class contains the logic to detect the cycle
    static class detectcycle {
        public ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) { // Cycle detected
                    ListNode start = head;
                    while (start != slow) {
                        start = start.next;
                        slow = slow.next;
                    }
                    return start; // Return the node where the cycle begins
                }
            }
            return null; // No cycle found
        }
    }

    public static void main(String[] args) {
        // Example Usage for detectCycle

        // Create a linked list with a cycle: 3 -> 2 -> 0 -> -4
        //                                      ^         |
        //                                      |_________|
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeMinus4 = new ListNode(-4);

        head.next = node2;
        node2.next = node0;
        node0.next = nodeMinus4;
        nodeMinus4.next = node2; // Cycle here (cycle starts at node2)

        // Create an instance of detectcycle
        detectcycle solution = new detectcycle();

        // Call the detectCycle method
        ListNode cycleStartNode = solution.detectCycle(head);

        // Print the result
        if (cycleStartNode != null) {
            System.out.println("Cycle detected! The cycle starts at node with value: " + cycleStartNode.val);
        } else {
            System.out.println("No cycle detected.");
        }

        // Example of a list without a cycle
        ListNode headNoCycle = new ListNode(1);
        headNoCycle.next = new ListNode(2);
        headNoCycle.next.next = new ListNode(3);

        ListNode cycleStartNodeNoCycle = solution.detectCycle(headNoCycle);
        if (cycleStartNodeNoCycle != null) {
            System.out.println("Cycle detected! The cycle starts at node with value: " + cycleStartNodeNoCycle.val);
        } else {
            System.out.println("No cycle detected in the second list.");
        }
    }
}