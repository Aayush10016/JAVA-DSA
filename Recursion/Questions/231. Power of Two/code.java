class Solution {
    public boolean isPowerOfTwo(int n) {
        // Base case: 1 is a power of two
        if (n == 1) {
            return true;
        }

        // Base case: negative, zero, or odd numbers (except 1)
        if (n <= 0 || n % 2 != 0) {
            return false;
        }

        // Recursive call with smaller problem
        return isPowerOfTwo(n / 2);
    }
}
