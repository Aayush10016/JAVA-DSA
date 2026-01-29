class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }

        // Base case: negative, zero, or odd numbers (except 1)
        if (n <= 0 || n % 3 != 0) {
            return false;
        }

        // Recursive call with smaller problem
        return isPowerOfThree(n / 3);

    }
} 
