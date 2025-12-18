# 📘 Array Patterns – Complete Pattern Library (with Java Templates)

This file contains all major array problem-solving patterns used in interviews, along with reusable Java templates.

---

# 🌟 Pattern 1: Two-Pointer Technique

## ✔ When to Use
- Sorted arrays  
- Pair / triplet problems  
- Reverse operations  
- Duplicate removal  

---

## ✅ Two-Pointer Template (Java)

```java
public class TwoPointer {

    public static void twoPointerExample(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum == target) {
                System.out.println("Pair found: " + arr[start] + ", " + arr[end]);
                return;
            }

            if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9};
        twoPointerExample(arr, 10);
    }
}

```
🌟 Pattern 2: Sliding Window
✔ When to Use
Subarray problems

"Longest/shortest window"

"At most K…"

"Exactly K…"

✅ Fixed Size Sliding Window Template (Java)
```java
public class SlidingWindowFixed {

    public static int maxSum(int[] arr, int k) {
        int sum = 0;
        int max = 0;

        // first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max = sum;

        // sliding window
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println(maxSum(arr, 3));
    }
}

```
✅ Variable Size Sliding Window Template (Java)
```java
public class SlidingWindowVariable {

    public static int longestSubArray(int[] arr, int k) {
        int start = 0;
        int sum = 0;
        int maxLen = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > k) {
                sum -= arr[start];
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        System.out.println(longestSubArray(arr, 5));
    }
}

```
🌟 Pattern 3: Prefix Sum + HashMap
✔ When to Use
Subarray sum equals K

Negative numbers exist

Counting subarrays

✅ Prefix Sum Template (Java)
```java
import java.util.*;

public class PrefixSum {

    public static int subarraySum(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subarraySum(arr, 3));
    }
}

```
🌟 Pattern 4: Cyclic Sort
✔ When to Use
Input contains numbers 1 to N

Missing number

Duplicate number

"Place numbers in correct index"

✅ Cyclic Sort Template (Java)
```java
public class CyclicSort {

    public static void sort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

```
🌟 Pattern 5: Binary Search (Sorted Arrays & Binary Search on Answer)
✔ When to Use
Array is sorted

Searching threshold

Minimize/maximize

“Allocate books”, “Ship packages”, “Aggressive cows”

✅General binary search (sorted array)
```java
public class BinarySearch {

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9};
        System.out.println(search(arr, 7));
    }
}
```

✅ Binary Search on Answer Template (Java)
```java
public class BinarySearch {

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9};
        System.out.println(search(arr, 7));
    }
}

```
