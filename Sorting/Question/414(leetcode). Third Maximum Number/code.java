class Solution {
    public int thirdMax(int[] arr) {
        Arrays.sort(arr);
        int distinctCount = 1;  
        int last = arr[arr.length - 1]; 
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != last) {  
                distinctCount++;  
                last = arr[i];  
            }
            if (distinctCount == 3) {
                return last;  
            }
        }
        return arr[arr.length - 1];
    }
}
