class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode headFirst = head;

        //rearrange
        while (headFirst != null && headSecond != null){
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        //setting next of tail to null as we know next element of 0.6 value 
        if (headFirst != null){
            headFirst.next = null;
        }
    }
    

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null){
            present.next = previous;
            previous = present;
            present = next;
            if (next != null){
                next = next.next;
            }
        }
        return previous;
    }
}
