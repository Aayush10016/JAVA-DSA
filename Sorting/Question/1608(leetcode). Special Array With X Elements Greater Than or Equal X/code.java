class Solution {
    public int specialArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int x = arr.length - i;                
            if (arr[i] >= x) {
                if (i == 0 || arr[i - 1] < x) {
                    return x;
                }
            }
        }
        return -1; 
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
