class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) return head;

        ListNode present = head;
        ListNode previous = null;

        while (true) {

            // Check if k nodes exist
            ListNode temp = present;
            int count = 0;
            while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }
            if (count < k) break; // DO NOT reverse

            ListNode last = previous;
            ListNode newEnd = present;
            ListNode next = present.next;

            // Reverse k nodes
            for (int i = 0; i < k; i++) {
                present.next = previous;
                previous = present;
                present = next;
        
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = previous;
            } else {
                head = previous;
            }

            newEnd.next = present;
            previous = newEnd;
        }

        return head;
    }
}
