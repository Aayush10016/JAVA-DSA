class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i; j > 0; j--) {
                    if (arr[j-1] % 2 == 0){
                        swap(arr, j, j+1);
                    } else if(arr[j-1] % 2 != 0){
                        swap(arr, j, j-1);
                    } else {
                        break;
                    }
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
