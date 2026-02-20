class Solution {
    public int getDecimalValue(ListNode head) {
        int decimal = 0;
        ListNode current = head;
        while(current != null){
            decimal = decimal *2 + current.val;
            current = current.next;
        }
    return decimal;
    }
}
