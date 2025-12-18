# 📘 Sorting Algorithms — Complete Notes + Definitions + Patterns + Base Codes

Sorting is one of the most fundamental concepts in DSA.  
Many complex algorithms rely on sorted data structures.

This file includes:
✔ Comparison sorting  
✔ Non-comparison sorting  
✔ Stable vs unstable sorting  
✔ Bubble, Selection, Insertion  
✔ Merge Sort  
✔ Quick Sort  
✔ Cyclic Sort  
✔ Counting Sort  
✔ Radix Sort  


---

# 🟦 1. What Is Sorting?

Sorting means arranging data in:
- increasing order OR  
- decreasing order  

Sorting helps:
✔ Binary search  
✔ Grouping & categorization  
✔ Optimizing other algorithms  

---

# 🟩 2. Types of Sorting Algorithms

### ✔ Comparison-based  
(Use comparisons between elements)
- Bubble Sort  
- Selection Sort  
- Insertion Sort  
- Merge Sort  
- Quick Sort  

### ✔ Non-comparison-based  
(Use digit/position counting)
- Counting Sort  
- Radix Sort  

---

# 🟥 3. Sorting Complexity Table

| Algorithm | Time | Space | Stable? | Notes |
|----------|------|-------|---------|-------|
| Bubble | O(n²) | O(1) | Yes | Simple but slow |
| Selection | O(n²) | O(1) | No | Minimal swaps |
| Insertion | O(n²) | O(1) | Yes | Good for nearly sorted |
| Merge Sort | O(n log n) | O(n) | Yes | Divide & conquer |
| Quick Sort | O(n log n) avg | O(log n) | No | Fastest in practice |
| Heap Sort | O(n log n) | O(1) | No | Priority queue |
| Counting Sort | O(n+k) | O(k) | Yes | Integer keys |
| Radix Sort | O(n log k) | O(n) | Yes | Digit-based |

---

# 🟦 4. Pattern Recognition — When to Use What?

| Keyword / Situation | Best Algorithm |
|---------------------|----------------|
| “Already/nearly sorted” | Insertion Sort |
| “Need stable + O(n log n)” | Merge Sort |
| “Fastest average-case” | Quick Sort |
| “Numbers from 1 to N” | Cyclic Sort |
| “Small range integers” | Counting Sort |
| “Large integers (multiple digits)” | Radix + Counting Sort |
| “Find kth smallest” | QuickSelect |
| “Avoid extra memory” | Quick Sort / Heap Sort |

---

# 🟥 5. Pattern 1: Bubble Sort

## ✔ When to Use  
- Teaching simple sorting  
- Small inputs  
- When swaps needed to move heavy items to the right  

---

## 🧠 Thought Process  
Repeatedly compare adjacent elements and swap if out of order.

---

## ✅ Bubble Sort 

```java
public class BubbleSort {

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            boolean swapped = false;

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // optimization
        }
    }
}
```

---

# 🟧 6. Pattern 2: Selection Sort

## ✔ When to Use  
- Need minimal swaps  
- Memory constrained environments  

---

## 🧠 Thought Process  
Find max index and place at correct position.

---

## ✅ Selection Sort

```java
public class SelectionSort {

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
```

---

# 🟩 7. Pattern 3: Insertion Sort

## ✔ When to Use  
- Arrays nearly sorted  
- Simple & stable sort  

---

## 🧠 Thought Process  
Take an element → insert into correct position of already sorted left part.

---

## ✅ Insertion Sort

```java
public class InsertionSort {

    public static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
```

---

# 🟦 8. Pattern 4: Merge Sort (Divide & Conquer)

## ✔ When to Use  
- Need O(n log n) time guaranteed  
- Stable sort required  

---

## 🧠 Thought Process  
1. Divide array into halves  
2. Sort each half  
3. Merge sorted halves  

---

## ✅ Merge Sort

```java
import java.util.*;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] ans = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                ans[k++] = first[i++];
            } else {
                ans[k++] = second[j++];
            }
        }

        while (i < first.length) ans[k++] = first[i++];
        while (j < second.length) ans[k++] = second[j++];

        return ans;
    }
}
```

---

# 🟧 9. Pattern 5: Quick Sort (Most Used in Practice)

## ✔ When to Use  
- Fastest average-case sorting  
- In-place (low memory usage)  

---

## 🧠 Thought Process  
1. Choose pivot  
2. Partition array  
3. Recursively sort left and right parts  

---

## ✅ Quick Sort

```java
public class QuickSort {

    public static void quick(int[] nums, int low, int hi) {
        if (low >= hi) return;

        int start = low;
        int end = hi;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end) {
            while (nums[start] < pivot) start++;
            while (nums[end] > pivot) end--;

            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start++;
                end--;
            }
        }

        quick(nums, low, end);
        quick(nums, start, hi);
    }
}
```

---

# 🟥 10. Pattern 6: Cyclic Sort (IMPORTANT)

## ✔ When to Use  
Array contains numbers from:
```
1 to N  OR  0 to N
```

### Used in:
- Missing number  
- Duplicate number  
- All numbers in range  

---

## 🧠 Thought Process  
Place each element at index `arr[i] - 1`

---

## ✅ Cyclic Sort 

```java
public class CyclicSort {

    public static void sort(int[] arr) {
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
}
```

---

# 🟦 11. Pattern 7: Counting Sort

## ✔ When to Use  
- Small range integers  
- Frequency-based sorting  

---

## 🧠 Thought Process  
1. Count frequency of each value  
2. Compute prefix sum  
3. Build sorted array  

---

## ✅ Counting Sort

```java
public class CountingSort {

    public static int[] countSort(int[] arr, int maxVal) {
        int[] count = new int[maxVal + 1];

        for (int num : arr) {
            count[num]++;
        }

        int idx = 0;
        int[] sorted = new int[arr.length];

        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                sorted[idx++] = i;
            }
        }

        return sorted;
    }
}
```

---

# 🟧 12. Pattern 8: Radix Sort (Largest Numbers)

## ✔ When to Use  
- Large numbers  
- Stable sorting needed  
- Multi-digit values  

---

## 🧠 Thought Process  
Sort digits from least-significant to most-significant using counting sort.

---

## ✅ Radix Sort

```java
public class RadixSort {

    public static void radix(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // count digits
        for (int num : arr) {
            count[(num / exp) % 10]++;
        }

        // prefix sum
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // stable placing
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // copy back
        System.arraycopy(output, 0, arr, 0, n);
    }
}
```

---

# 🎯 FINAL SUMMARY

You now have complete sorting notes including:
✔ Bubble / Selection / Insertion  
✔ Merge Sort  
✔ Quick Sort  
✔ Cyclic Sort  
✔ Counting Sort  
✔ Radix Sort  
✔ Best use cases  
✔ Pattern recognition  



