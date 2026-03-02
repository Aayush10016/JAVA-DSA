class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;
        ListNode curr = head;

        int groupSize = 1;

        while (curr != null) {

            // Step 1: Count actual nodes in this group
            int count = 0;
            ListNode temp = curr;

            while (temp != null && count < groupSize) {
                temp = temp.next;
                count++;
            }

            // Step 2: If count is even, reverse this group
            if (count % 2 == 0) {
                ListNode prev = null;
                ListNode node = curr;

                for (int i = 0; i < count; i++) {
                    ListNode next = node.next;
                    node.next = prev;
                    prev = node;
                    node = next;
                }

                // Connect reversed group
                prevGroupEnd.next = prev;
                curr.next = node;

                prevGroupEnd = curr;
                curr = node;

            } else {
                // Move pointers without reversing
                for (int i = 0; i < count; i++) {
                    prevGroupEnd = curr;
                    curr = curr.next;
                }
            }

            groupSize++;
        }

        return dummy.next;
    }
}
