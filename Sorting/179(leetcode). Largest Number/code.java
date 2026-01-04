class Solution {
    public String largestNumber(int[] arr) {
        // Step 1: Convert numbers to strings
        String[] s = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            s[i] = String.valueOf(arr[i]);
        }
        // Step 2: Sort using custom comparator
        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));
        // Step 3: Edge case -> if highest is "0", answer is "0"
        if (s[0].equals("0")) return "0";
        // Step 4: Build largest number
        StringBuilder result = new StringBuilder();
        for (String str : s) {
            result.append(str);
        }
        return result.toString();
    }
}
