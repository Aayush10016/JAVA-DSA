class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        int mid = length/2;

        ListNode current = head;
        for(int i = 0; i < mid-1; i++){
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
}
