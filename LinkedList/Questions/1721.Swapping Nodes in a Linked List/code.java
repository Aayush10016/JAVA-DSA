class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int length = 0;
        //counting length
        while(temp != null){
            length++;
            temp = temp.next;
        }
        //kth from start 
        ListNode first = head;  
        for (int i = 1; i<k; i++){
            first = first.next;
        } 
        //kth from end
        ListNode second = head;
        for (int i = 1; i< length-k+1; i++){
            second = second.next;
        }
        //swap
        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head;  
    }
}
