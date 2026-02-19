class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0 || head == null || head.next == null){
            return head;
        }
        ListNode last = head;   //we dont have the last node of our list given so we start it initially from head
        int length = 1;         //initial length of list is 1
        while (last.next != null){
            last = last.next;   //till last.next will not be null last will increase starting from head and till then length of list will also increase and as soon as last will be equal to null loop will end and we will be pointing to last node we want
            length++;
        }
        last.next = head;       //last.next pointing to original head
        int rotations = k % length;    //to find the rotations and not waste extra compute
        int skip = length-rotations;   //the number we need to skip to land at the newLast

        ListNode newLast = head;   //newLast will also start from head

        for (int i = 0; i < skip - 1; i++) {    //we go till skip-1
            newLast = newLast.next;     //newLast starts from head and we move it forward till our k value it increases one by one in each increment and as soon as our rotations end newLast will point to the last node of our new rotated list 
        }
        head = newLast.next;       //our final head will become the next node of newLast
        newLast.next = null;       //newLast will then point to null after all the rotations

        return head;               //we return head because LeetCode requires us to return the head so that it can run its process internally
    }
}
