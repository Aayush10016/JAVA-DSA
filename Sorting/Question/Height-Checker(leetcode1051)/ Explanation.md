Question link - 
```https://leetcode.com/problems/height-checker/description/```
# 📘 LeetCode 1051 — Height Checker  
**Category:** Sorting  
**Difficulty:** Easy  
**Tags:** Array, Sorting, Counting Sort

---

# 📝 Problem Summary

You are given an integer array `heights` where each element represents the height of a student standing in a line.

Your task is to determine **how many students are NOT standing in the position they would be in if the array were sorted**.

Example:
```
Input:  [1,1,4,2,1,3]
Sorted: [1,1,1,2,3,4]
Output: 3   // because indices 2, 4, 5 differ
```

---

# 🎯 Goal  
Count the number of indices `i` where:
```
heights[i] != sorted(heights)[i]
```

---

# 🧠 Thought Process

We need to:
1. Compare current arrangement  
2. With the correct (sorted) order  
3. Count positions where values don't match  

The simplest solution is:
- Copy array  
- Sort the copy  
- Compare both arrays  

---

# 🛠 Approaches

---

## ✅ Approach 1: Sorting (Simple & Clean)
**Idea:**  
- Clone the array → this gives the “expected correct order”  
- Sort the cloned array  
- Count differences with the original  

### ✔ Time Complexity
`O(n log n)` — sorting  
### ✔ Space Complexity
`O(n)` — cloned array  

### ✔ Why This Works
Sorting gives the correct position for each height.  
Any mismatch means that student is not in the correct order.

---

## 🚀 Approach 2: Counting Sort (Optimized for Constraints)
### ✔ Why Counting Sort?
Heights range from `1 to 100`, very small range → counting sort becomes **O(n)**.

### ✔ Steps:
1. Create frequency array of size 101  
2. Iterate through sorted order using frequency  
3. Compare with original  

### ✔ Complexity
- Time: `O(n + range)` → `O(n + 100)`  
- Space: `O(100)`  


---

# 🧩 Edge Cases
- All heights already sorted → answer = 0  
- All heights reversed → answer = n  
- All students same height → answer = 0  
- Array length = 1 → answer = 0  

---
#CODE
Code is added in a separate `.java` file inside this folder.

