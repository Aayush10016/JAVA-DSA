class Solution {
    public ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode f = first;
        ListNode s = second;

        // Dummy node to simplify insertion
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (f != null && s != null) {
            if (f.val < s.val) {
                tail.next = f;
                f = f.next;
            } else {
                tail.next = s;
                s = s.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes
        if (f != null) {
            tail.next = f;
        }
        if (s != null) {
            tail.next = s;
        }

        return dummy.next; // head of merged list
    }
}
