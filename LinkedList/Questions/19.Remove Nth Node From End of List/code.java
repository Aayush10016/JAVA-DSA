class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        if (length - n == 0) {
            return head.next;
        }
        int skip = length - n;
        ListNode current = head;
        for (int i = 0; i < skip-1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        return head;
    }
}
