# 📂 Sorting

# 🔽 Sorting — Complete Guide (Concepts + When to Use + Interview Patterns)

Sorting is one of the MOST fundamental techniques in DSA.  
Many algorithms, data structures, and problem-solving approaches rely on sorted data to work efficiently.

This folder includes:
✔ All major sorting algorithms  
✔ Definitions & intuition  
✔ When to use which sort  
✔ Stability & complexity rules  
✔ Pattern recognition  
✔ Comparison charts  
✔ Real interview questions  
✔ Folder structure for organized notes  

---

# 🟦 1. What Is Sorting?

**Sorting** means arranging elements of a list/array in increasing or decreasing order.

Sorting helps in:
- Binary search  
- Two-pointer technique  
- Sliding window  
- Greedy algorithms  
- Interval problems  
- Hashing optimizations  
- Preprocessing data  

Sorting is a foundation for MANY interview problems.

---

# 🟩 2. Why Sorting Is Important?

### ✔ Makes searching easier  
### ✔ Helps eliminate duplicates  
### ✔ Enables two-pointer patterns  
### ✔ Allows efficient greedy solutions  
### ✔ Simplifies complex problems  

Example:  
"Find triplets with sum = k" becomes easy once array is sorted.

---

# 🟥 3. Classification of Sorting Algorithms

Sorting algorithms can be classified by:

### ✔ Comparison-based vs Non-comparison  
### ✔ Stable vs Unstable  
### ✔ Recursive vs Iterative  
### ✔ Adaptive vs Non-adaptive  
### ✔ In-place vs External  

---

# 🟦 4. Important Sorting Algorithms (Concepts Only)


---

## 🟩 A. Bubble Sort  
- Repeatedly swap adjacent elements  
- Best for teaching but not used in production  
- Stable, simple but slow  

---

## 🟧 B. Selection Sort  
- Find min element & place at correct position  
- Not stable  
- In-place  
- Simple but inefficient  

---

## 🟪 C. Insertion Sort  
- Insert elements in the correct sorted part  
- Stable & adaptive  
- Great for nearly sorted arrays  
- Used in real libraries for small datasets (TimSort hybrid)  

---

## 🟫 D. Merge Sort  
- Divide → Conquer → Merge  
- Time: O(n log n)  
- Stable  
- Used in external sorting  
- Not in-place (uses extra storage)  

---

## 🟥 E. Quick Sort  
- Partition array around pivot  
- Average O(n log n), worst O(n²)  
- In-place  
- Very fast in practice  
- Widely used in real systems  

---

## 🟦 F. Heap Sort  
- Based on max-heap  
- Time: O(n log n)  
- In-place  
- Not stable  
- Useful for selection (e.g., k largest)  

---

## 🟧 G. Counting Sort  
- Non-comparison sort  
- Time: O(n + k)  
- Used when range of numbers is small  
- Great for frequency-based problems  

---

## 🟩 H. Radix Sort  
- Sort numbers digit by digit  
- Works for integers only  
- Often uses counting sort internally  

---

## 🟪 I. Bucket Sort  
- Distribute numbers into buckets  
- Sort each bucket individually  
- Works best for floating-point numbers with uniform distribution  

---

# 🟨 5. Pattern Recognition — When to Use Which Sorting?

| Situation | Best Algorithm |
|----------|----------------|
| Array is almost sorted | Insertion Sort |
| Large array, stable sort needed | Merge Sort |
| Large array, in-place sort needed | Quick Sort |
| Small range of integers | Counting/Radix Sort |
| Need Kth largest/smallest | Heap Sort |
| Real-time system (predictable speed) | Heap Sort |
| Distributed or external sorting | Merge Sort |
| General fast sorting | Quick Sort |

---

# 🟧 6. Sorting Properties (VERY IMPORTANT)

### ✔ Stability  
Stable sort keeps equal elements in order.

Stable → Merge Sort, Insertion Sort, Bubble Sort  
Unstable → Quick Sort, Heap Sort, Selection Sort  

### ✔ In-place  
Uses constant extra memory.

In-place → Quick Sort, Heap Sort, Insertion Sort  
Not in-place → Merge Sort, Counting Sort  

### ✔ Adaptive  
Gets faster on nearly sorted input.

Adaptive → Insertion Sort  
Non-adaptive → Quick Sort, Merge Sort  

---

# 🟩 7. Real Interview Problems Related to Sorting

Sorting is NOT just algorithms — sorting unlocks MANY patterns.

### 🔹 Interval Problems  
- Merge intervals  
- Meeting rooms  
- Minimum platforms  

### 🔹 Two Pointer Problems  
- Pair sum  
- 3-sum  
- Sort colors (Dutch national flag)

### 🔹 Greedy Algorithms  
- Activity selection  
- Minimum arrows to burst balloons  
- Job sequencing  

### 🔹 Frequency Sorting  
- Sort by frequency  
- Top-K elements (heap + sorting)  

### 🔹 Custom Sorting  
- Comparator problems  
- Sorting strings  
- Sorting by last digit, first digit, or multiple keys  

---

# 🟪 8. Advanced Sorting Concepts

### ✔ Hybrid Sorting Algorithms  
Modern languages use hybrid sorts like **TimSort** (Python & Java).  
It combines:
- Merge Sort  
- Insertion Sort  

### ✔ External Sorting  
Used when data doesn't fit into memory.  
Merge Sort is used here.

### ✔ Parallel Sorting  
Divide input → sort parallelly → merge.

---

# 🟦 9. Types

```
Sorting/
 ├── README 
 ├── BasicSorts/
 │    ├── BubbleSort 
 │    ├── SelectionSort 
 │    ├── InsertionSort 
 ├── DivideAndConquer/
 │    ├── MergeSort 
 │    └── QuickSort 
 ├── HeapSort 
 ├── NonComparisonSorts/
 │    ├── CountingSort 
 │    ├── RadixSort 
 │    └── BucketSort 
 ├── SpecialProblems/
 │    ├── MergeIntervals 
 │    ├── SortColors 
 │    ├── MinimumPlatforms 
 │    └── ActivitySelection 
 └── Practice/
```

---

# 🟥 10. Complexity Summary

| Algorithm | Best | Average | Worst | Space | Stable |
|-----------|------|---------|-------|--------|--------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | No |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(1) | No |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) | No |
| Counting Sort | O(n+k) | O(n+k) | O(n+k) | O(k) | Yes |
| Radix Sort | O(d*(n+k)) | O(d*(n+k)) | O(d*(n+k)) | O(n+k) | Yes |
| Bucket Sort | O(n+k) | O(n+k) | O(n²) | O(n) | Yes |

---

# 🟨 11. Tips to Master Sorting

✔ Learn quick sort & merge sort deeply  
✔ Insertion sort helps for small / near-sorted arrays  
✔ Understand stability and when it matters  
✔ Practice comparator-based custom sorting  
✔ Know the time-space tradeoffs  
✔ Use sorting to unlock other patterns (greedy, two-pointer)  

---

