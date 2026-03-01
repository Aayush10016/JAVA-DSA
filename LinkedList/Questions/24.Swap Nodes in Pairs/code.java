class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }  
        if(head.next == null){
            return head;
        } 
        ListNode current = head;
        while(current != null && current.next != null){
            
            int val = current.val;
            current.val = current.next.val;
            current.next.val = val;

            current = current.next.next;
            
        } 
        return head; 
    }    
}
