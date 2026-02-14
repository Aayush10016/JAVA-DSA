class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right){
            return head;
        }

        //skip the first left-1 nodes
        ListNode present = head;
        ListNode previous = null;
        for (int i = 0; present != null && i < left-1; i++) {   //present should not be null otherwise nullpointer exception
            previous = present;
            present = present.next;
        }
        ListNode last = previous;
        ListNode newEnd = present;
        ListNode next = present.next;
        //now we reverse between left and right
        for (int i = 0; present != null && i < right-left+1; i++) {   //number of elements between left and right is right - left +1
            present.next = previous;
            previous = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        if (last != null){
            last.next = previous;
        } else {
            head = previous;
        }
        newEnd.next = present;
        return head;
    }
}
