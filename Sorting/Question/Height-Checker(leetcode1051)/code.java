class Solution {
    public int heightChecker(int[] arr) {
        int[] expected = arr.clone(); 
        Arrays.sort(expected);        
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != expected[i]) {
                count++;
            }
            i++;
        }
        return count;
    }
}
