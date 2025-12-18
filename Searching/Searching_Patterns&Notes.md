# 📘 Searching Algorithms — Complete Notes + Definitions + Patterns + Base Codes

Searching is one of the most fundamental and most repeated concepts in DSA.  
Almost every algorithm — arrays, strings, trees, graphs — requires searching.

This file covers:
✔ Linear Search  
✔ Binary Search  
✔ Variants of Binary Search  
✔ Search in Rotated Array  
✔ Infinite Array Search  
✔ Peak Element  
✔ First/Last Occurrence  
✔ Floor/Ceil  

---

# 🟦 1. What Is Searching?

Searching means **finding the position of a required element** inside a data structure.

There are two main types:

### ✔ 1. Linear Search  
Works on **any** data  
Time: O(n)

### ✔ 2. Binary Search  
Works only on **sorted** data  
Time: O(log n)  
Space: O(1)

---

# 🟩 2. When to Use Which Search?

| If Array Is… | Use |
|--------------|-----|
| Unsorted | Linear Search |
| Sorted | Binary Search |
| Order unknown | Order-agnostic BS |
| Rotated | Rotated BS |
| Mountain/Peak | Peak Element BS |
| Infinite | Infinite Array Search |

---

# 🟥 3. Pattern Recognition for Binary Search Problems

Look for these keywords:

| Keyword | Pattern |
|---------|---------|
| “minimum”, “maximum” | BS on answer |
| “first”, “last”, “boundary” | Modified BS |
| “peak”, “mountain” | Peak BS |
| “rotated array” | Partitioned BS |
| “find smallest” | Boundary search |
| “infinite array” | Exponential search + BS |

If the problem deals with **sorted** data, ALWAYS consider binary search.

---

# 🟦 4. Pattern 1: Linear Search

## ✔ When to Use  
- Small arrays  
- Unsorted arrays  
- When elements are complex structures  

---

## 🧠 Thought Process  
Iterate from left to right until you find the target.

---

## ✅ Linear Search 

```java
public class LinearSearch {

    public static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }

        return -1;
    }
}
```

---

# 🟧 5. Pattern 2: Binary Search (Classic)

## ✔ When to Use  
- Array is sorted  

---

## 🧠 Thought Process  
1. Find middle  
2. Compare target with mid  
3. Based on comparison, search left or right half  

---

## ✅ Classic Binary Search

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
}
```

---

# 🟦 6. Pattern 3: Order-Agnostic Binary Search

## ✔ When to Use  
- Array may be ascending OR descending  
- You don't know the order  

---

## 🧠 Thought Process  
Detect order:  
```
if arr[start] < arr[end] → ascending
else descending
```

---

## ✅ Order-Agnostic BS

```java
public class OrderAgnosticBS {

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean asc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (asc) {
                if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }

        return -1;
    }
}
```

---

# 🟧 7. Pattern 4: First & Last Occurrence

### ✔ Used In:
- Counting occurrences  
- Boundary problems  
- Search ranges  

---

## 🧠 Thought Process  
Binary search but don’t stop when found —  
continue searching left or right.

---

## ✅ First Occurrence

```java
public class FirstOccurrence {

    public static int first(int[] arr, int target) {
        int ans = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1; // move left
            } 
            else if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return ans;
    }
}
```

---

## ✅ Last Occurrence

```java
public class LastOccurrence {

    public static int last(int[] arr, int target) {
        int ans = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1; // move right
            } 
            else if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return ans;
    }
}
```

---

# 🟥 8. Pattern 5: Floor & Ceil in Sorted Array

### ✔ Floor = greatest value ≤ target  
### ✔ Ceil = smallest value ≥ target  

---

## 🧠 Thought Process  
Binary search boundary.

---

## ✅ Floor

```java
public class Floor {

    public static int floor(int[] arr, int target) {
        int ans = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) return arr[mid];

            if (arr[mid] < target) {
                ans = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
```

---

# 🟧 9. Pattern 6: Peak Element / Mountain Array

### ✔ Used In:
- LeetCode “Peak Index in Mountain Array”
- Binary search on unsorted but structured data

---

## 🧠 Thought Process  
Compare mid with mid+1:
- If arr[mid] < arr[mid+1] → move right  
- Else → move left  

---

## ✅ Peak Element

```java
public class PeakElement {

    public static int peakIndex(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
```

---

# 🟥 10. Pattern 7: Search in Rotated Sorted Array

### ✔ Array looks like:
```
[4,5,6,7,0,1,2]
```

### ✔ Key Idea  
One half is ALWAYS sorted.

---

## 🧠 Thought Process  
1. Check which half is sorted  
2. Check if target lies in sorted half  
3. Move accordingly  

---

## ✅ Search in Rotated Array

```java
public class RotatedBinarySearch {

    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) return mid;

            // left half sorted
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // right half sorted
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
```

---

# 🟪 11. Pattern 8: Search in Infinite Sorted Array

### ✔ Used In:
- Unknown large datasets  
- Google-like indexing  

---

## 🧠 Thought Process  
1. Start with small window  
2. Expand exponentially  
3. Apply binary search inside window  

---

## ✅ Infinite Array Search

```java
public class InfiniteArraySearch {

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // expand range
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        // normal BS
        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
```

---

# 🟨 12. Pattern 9: Binary Search on Answer (VERY IMPORTANT)

Used when:
- "minimize the maximum"  
- "allocate pages"  
- "capacity required"  
- "ship packages"  

---

## 🧠 Thought Process  
Search the **answer**, not the array.

```
low = smallest possible answer
high = largest possible answer
mid = potential answer
check(mid) → good or bad?
```

---

## Template (Universal)

```java
public class BinarySearchOnAnswer {

    public static int solve(int[] arr) {
        int low = 0;
        int high = 0;

        for (int n : arr) {
            low = Math.max(low, n);
            high += n;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canDo(arr, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static boolean canDo(int[] arr, int capacity) {
        int sum = 0;

        for (int n : arr) {
            if (sum + n > capacity) return false;
            sum += n;
        }

        return true;
    }
}
```

---

# 🎯 FINAL SUMMARY

You now have complete searching notes including:
✔ Linear search  
✔ Binary search  
✔ Order-agnostic BS  
✔ First/last occurrence  
✔ Floor & ceil  
✔ Peak element  
✔ Rotated array search  
✔ Infinite array search  
✔ Binary search on answer  


