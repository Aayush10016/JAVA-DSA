//1)Squaring and sorting approach (not optimal)

  class Solution {
    public int[] sortedSquares(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}

//2)Two pointer approach(optimal)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[index] = leftSq;
                left++;
            } else {
                result[index] = rightSq;
                right--;
            }
            index--;
        }

        return result;
    }
}
