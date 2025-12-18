
# 📂 Arrays — Complete Guide (Concepts + Pattern Recognition)

Arrays are the foundation of Data Structures and Algorithms.  
Most problems in DSA directly involve arrays or use them internally to simulate more complex structures.

This folder contains:
✔ Array fundamentals  
✔ Pattern recognition  
✔ Techniques used in interviews  
✔ Detailed problem categories  
✔ Subfolders for each technique  

---

# 🟦 1. What Is an Array?

An **array** is a collection of elements stored in contiguous memory locations.

### Key properties:
- Fixed size  
- Direct/random access using index  
- Fast read operations (O(1))  
- Insertions/deletions are expensive (O(n))  

---

# 🟩 2. Why Arrays Are Important?

Arrays are the basis of:
- Strings  
- Linked lists (conceptually)  
- Dynamic arrays (ArrayList)  
- Heaps  
- Hashing tables  
- Recursion and DP states  

Most interview questions start with arrays because they test:
✔ logic  
✔ loops  
✔ pointer movements  
✔ space/time optimization  

---

# 🟥 3. Array Operations & Their Complexity

| Operation | Time Complexity | Notes |
|----------|-----------------|-------|
| Access | O(1) | direct indexing |
| Update | O(1) | overwrite value |
| Insert at end | O(1) amortized | if dynamic array |
| Insert at index | O(n) | shifting required |
| Delete at index | O(n) | shifting required |
| Search | O(n) | unless sorted |

---

# 🟨 4. How to Identify Array Questions?

Look for these keywords:

| Problem Keyword | Pattern |
|-----------------|---------|
| “find pair”, “find triplet”, “sorted array” | Two-pointer technique |
| “longest/shortest subarray” | Sliding window |
| “count subarrays with…” | Prefix sum + hashing |
| “maximum/minimum sum” | Kadane’s algorithm |
| “numbers from 1 to N” | Cyclic sort |
| “searching target in sorted array” | Binary search |
| “frequency/occurrence” | Hashing |
| “merge”, “sort” | Merge/quick sort |

If a question involves:
- scanning  
- tracking  
- windowing over array  
→ a known pattern applies.

---

# 🟦 5. Common Array Patterns (You Will Find Separate `.md` Files Here)

### ✔ Two-Pointer Technique  
Used for sorted arrays, pair-sum, removing duplicates, merging arrays.

### ✔ Sliding Window (Fixed + Variable Size)  
Used for longest/shortest subarray, at most/exactly k operations.

### ✔ Prefix Sum + HashMap  
Used for subarray sum problems, negative values included.

### ✔ Binary Search on Sorted Arrays  
Used for threshold problems and "minimize/maximize" type questions.

### ✔ Cyclic Sort  
Used when array stores numbers from `1 to N` or `0 to N`.

### ✔ Sorting + Greedy Combinations  
When rearranging or optimizing based on sorted values.

---

# 🟪 6. Array Problem Categories (Useful for Interview Prep)

### 🔹 Easy Level
- Max/min element  
- Reverse array  
- Move zeros  
- Frequency count  
- Rotate array  

### 🔹 Medium Level
- Two-sum  
- Subarray sum  
- Longest substring without repeating (via sliding window)  
- Kadane’s max subarray  
- Merge intervals  
- Missing/duplicate number (cyclic sort)  

### 🔹 Hard Level
- Trapping rainwater  
- Sliding window maximum  
- Largest rectangle in histogram  
- K-sum variations  
- Partitioning arrays (DP + recursion)

---

# 🟧 7. Patterns You Will Implement in This Folder

```
Arrays/
 ├── TwoPointer
 ├── SlidingWindow
 ├── PrefixSum
 ├── BinarySearch
 ├── CyclicSort
 ├── Sorting
```
---

# 🟩 8. Tips for Mastering Array Problems

✔ Always check if array is sorted — this changes everything.  
✔ For subarray questions, think sliding window or prefix sums.  
✔ For arranging numbers 1…N — think cyclic sort.  
✔ For maximum/minimum values — consider Kadane or monotonic structures.  
✔ For frequency counting — hashing is faster.  
✔ Draw the problem using small examples.  
✔ Recognize patterns, don’t memorize solutions.

---




