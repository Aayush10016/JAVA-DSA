# 📘 LeetCode 349 — Intersection of Two Arrays  
**Category:** Hashing / Set Operations  
**Difficulty:** Easy  
**Tags:** Array, HashSet, Sorting, Two Pointers

---

## 📝 Problem Summary

You are given two integer arrays `nums1` and `nums2`.

Your task is to return **an array of the unique intersection** of the two arrays:

- Only include elements that appear in **both** arrays  
- Each element must appear **once** (no duplicates)  
- The order of output does not matter  

---

## 🎯 What the Problem Really Wants

This problem is basically:

> “Find all **unique** elements that occur in **both** lists.”

This is the classic definition of an **intersection of two sets**.

---

## 🧠 Key Insight (Most Important)

There are **only two difficulties** in this problem:

1. Ensuring intersection is correct  
2. Ensuring **duplicates do NOT appear** in the result  

This makes **sets** the perfect data structure.

---

## ⭐ Pattern Recognition

This problem instantly matches these common patterns:

| Pattern | Why It Fits |
|--------|-------------|
| **HashSet intersection** | Sets remove duplicates automatically |
| **Sorting + Two Pointers** | If arrays are sorted, merge-like intersection becomes easy |
| **Counting / Membership checking** | Efficient lookup for repeated values |

When you see:
- “unique”
- “intersection”
- “return without duplicates”

👉 Think **Set**.

---

## 🛠 Approaches (Conceptual Only — NO CODE)

---

# 🔹 Approach 1: HashSet-Based Intersection (Recommended)

### Steps:
1. Insert all elements of `nums1` into a HashSet (unique values)
2. For each element in `nums2`, check if it exists in the set
3. Store matching elements in another set to avoid duplicates
4. Convert the result set to an array

### Why It Works:
- Sets automatically remove duplicates  
- Checking membership in a set is **O(1)**  
- Cleanest and easiest approach  

### Complexity:
- Time: `O(n + m)`  
- Space: `O(n)`  

This is the standard optimal solution.

---

# 🔹 Approach 2: Sorting + Two Pointer Technique

If both arrays are sorted:

### Steps:
1. Sort both arrays  
2. Use two pointers `i` and `j`  
3. Move pointers similar to merge step:  
   - If both elements equal → store and move both  
   - If nums1[i] < nums2[j] → move i  
   - Else → move j  
4. Skip duplicates while storing results  

### Why It Works:
- Sorted arrays allow linear scanning  
- Duplicate removal becomes simple with pointer logic  

### Complexity:
- Time: `O(n log n + m log m)`  
- Space: `O(1)` (if output ignored)  

This method is interview-friendly when sorting is allowed.

---

# 🔹 Approach 3: Boolean Frequency Array (Only if Range is Small)

If values are small and constrained:
- Use a boolean frequency array to mark presence
- Check matches without hashing

### But:
This only works when array values are small (e.g., 0–1000).  
Not a general solution for interview unless constraints guarantee it.

---

## 🧩 Example Walkthrough

### Input:
```
nums1 = [1,2,2,1]
nums2 = [2,2]
```

### Thinking:
- Unique elements in nums1 → `{1,2}`
- nums2 also contains 2
- Intersection → `{2}`

### Output:
```
[2]
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Returning duplicates  
Example mistake:
```
nums1 = [1,2,2]
nums2 = [2,2,3]
Output → [2,2]  ❌  (should be [2])
```

### ❌ Using nested loops  
This becomes `O(n²)` → inefficient.

### ❌ Sorting but forgetting to skip duplicates  
Leads to repeated values in output.

### ❌ Misunderstanding problem with LeetCode 350  
- Q349 → unique intersection  
- Q350 → intersection with frequencies  

They are not the same.

---

## 🧪 Edge Cases

- One or both arrays empty → result empty  
- No common elements → result empty  
- All elements same in both → result is that single element  
- Large inputs → hashing handles well  

---

## 🎓 What This Problem Teaches

✔ Efficient membership checking  
✔ Using HashSet for uniqueness  
✔ Applying two-pointer pattern for sorted arrays  
✔ Avoiding quadratic brute-force solutions  
✔ Understanding the difference between set intersection and multiset intersection  


---

## CODE

Code is added in a separate .java file inside this folder.
