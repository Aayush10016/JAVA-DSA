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
public class TwoPointerTemplate {

    public static void findPair(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair: " + arr[left] + ", " + arr[right]);
                return;
            } 
            else if (sum < target) left++;
            else right--;
        }
        System.out.println("No pair found.");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10};
        findPair(arr, 8);
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

    public static int maxSumWindow(int[] arr, int k) {
        int windowSum = 0, maxSum = 0;

        for (int i = 0; i < k; i++)
            windowSum += arr[i];

        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println(maxSumWindow(arr, 3));
    }
}
```
✅ Variable Size Sliding Window Template (Java)
```java
public class SlidingWindowVariable {

    public static int longestSubArray(int[] arr, int k) {
        int left = 0, sum = 0, maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
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

public class PrefixSumTemplate {

    public static int countSubarraysWithSumK(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

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
        System.out.println(countSubarraysWithSumK(arr, 3)); // Output: 2
    }
}
```
🌟 Pattern 4: Kadane’s Algorithm (Max Subarray Sum)
✔ When to Use
"Maximum sum subarray"

"Maximum profit"

Contiguous maximum segment

✅ Kadane’s Template (Java)
```java
public class KadanesTemplate {

    public static int kadane(int[] arr) {
        int maxSum = arr[0];
        int current = 0;

        for (int num : arr) {
            current = Math.max(num, current + num);
            maxSum = Math.max(maxSum, current);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(kadane(arr)); // Output: 6
    }
}
```
🌟 Pattern 5: Cyclic Sort
✔ When to Use
Input contains numbers 1 to N

Missing number

Duplicate number

"Place numbers in correct index"

✅ Cyclic Sort Template (Java)
```java
public class CyclicSortTemplate {

    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        cyclicSort(arr);

        for (int n : arr)
            System.out.print(n + " ");

        // Output: 1 2 3 4 5
    }
}
```
🌟 Pattern 6: Binary Search (Sorted Arrays & Binary Search on Answer)
✔ When to Use
Array is sorted

Searching threshold

Minimize/maximize

“Allocate books”, “Ship packages”, “Aggressive cows”

✅ Binary Search on Answer Template (Java)
```java
public class BinarySearchOnAnswer {

    public static boolean canShip(int[] arr, int capacity) {
        int load = 0;

        for (int weight : arr) {
            if (weight > capacity) return false;

            if (load + weight > capacity)
                return false;

            load += weight;
        }

        return true;
    }

    public static int findMinimumCapacity(int[] arr) {
        int left = 1, right = 10000;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canShip(arr, mid))
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10};
        System.out.println(findMinimumCapacity(arr));
    }
}
```
