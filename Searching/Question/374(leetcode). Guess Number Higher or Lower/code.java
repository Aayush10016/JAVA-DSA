public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid;           // correct guess
            } else if (result == -1) {
                end = mid - 1;        // guessed too high
            } else {
                start = mid + 1;      // guessed too low
            }
        }
        return -1;
    }
}
