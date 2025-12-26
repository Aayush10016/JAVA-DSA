class Solution {
    public int maxProduct(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int j = 0;
        for(i = arr.length-1; i < arr.length; i++){
            for(j = arr.length-2; j < arr.length; j++){
                return ((arr[i]-1) * (arr[j]-1));
            }
        }
        return -1;
    }
}
