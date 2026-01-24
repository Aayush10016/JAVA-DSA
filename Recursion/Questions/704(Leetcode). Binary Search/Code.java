class Solution {
    public int search(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private int binarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (target < arr[m]) {
            return binarySearch(arr, target, s, m - 1);
        } else {
            return binarySearch(arr, target, m + 1, e);
        }
    }
}
