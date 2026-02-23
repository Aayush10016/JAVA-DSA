class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int d1 = 0;
            if(l1 != null){
                d1 = l1.val;
            }
            
            int d2 = 0;
            if(l2 != null){
                d2 = l2.val;
            }

            int sum = d1+d2+carry;
            int digit = sum%10;
            carry = sum/10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            if(l1 != null){
                l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
}
