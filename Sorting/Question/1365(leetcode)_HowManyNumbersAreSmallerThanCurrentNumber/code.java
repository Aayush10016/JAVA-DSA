class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (sorted[j] < arr[i]) {
                    count++;
                } else {
                    break; 
                }
            }
            result[i] = count;
        }
        return result;
    }
}
