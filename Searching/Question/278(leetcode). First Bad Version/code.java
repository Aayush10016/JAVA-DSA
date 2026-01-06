public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int ans = n;   // store potential first bad version
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                ans = mid;        // mid might be the first bad
                end = mid - 1;    // search earlier versions
            } else {
                start = mid + 1;  // mid is good → search right side
            }
        }
        return ans;
    }
}
