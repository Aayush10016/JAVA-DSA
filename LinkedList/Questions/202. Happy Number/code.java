class Solution {
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);    //moving only one time since its the slow pointer
            fast = findSquare(findSquare(fast));   //moving twice since its the fast pointer
        } while (slow != fast);

        if (slow == 1){
            return true;
        }
        return false;
    }
    private int findSquare(int number){
        int ans = 0;
        while(number > 0){
            int remainder = number % 10;
            ans += remainder * remainder;
            number /= 10;
        }
        return ans;
    }
}
