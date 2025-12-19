# 📘 LeetCode 1502 — Can Make Arithmetic Progression From Sequence  
**Category:** Sorting / Math  
**Difficulty:** Easy  
**Tags:** Array, Sorting

---

# 📝 Problem Summary

You are given an array of integers.  
Your task is to determine whether the values **can be rearranged** to form an **arithmetic progression**.

### 🔍 What is an Arithmetic Progression (AP)?
A sequence is an AP if:
```
A[i+1] - A[i] = constant difference (d)
```

Example:
```
[3,5,1]  → after sorting → [1,3,5]
Difference = 2 each step → valid AP
```

---

# 🎯 Goal  
Return **true** if the numbers can be rearranged into an arithmetic sequence.  
Return **false** otherwise.

---

# 🧠 Thought Process

The key insight is:

👉 **If the array can be rearranged into an AP, then the sorted version must have equal differences.**

Because in an AP:
- The smallest number must come first  
- The second smallest must come next  
- And so on…

So the quickest method:

### ✔ **Sort → Check differences → Done**

---

# 🟦 Why Sorting Works

After sorting the array, if the difference between:
```
A[1] - A[0]
A[2] - A[1]
A[3] - A[2]
…
```
is the same for all consecutive pairs, then the array **can** be rearranged into an AP.

If any difference does not match → **not an AP**.

---

# 🧩 Example Walkthrough

### Input:
```
arr = [1, 3, 5]
```

Sorted:
```
[1, 3, 5]
diff = 3-1 = 2  
check 5-3 = 2  
→ Valid AP
```

---

# 🚫 Common Mistakes / Pitfalls

### ❌ Checking AP without sorting  
Order of input does NOT matter. Rearranging is allowed, so sort first.

### ❌ Using floating point differences  
Differences are integers → no need for float.

### ❌ Allowing inconsistent differences  
Even ONE mismatch means it cannot be an AP.

---

# 💡 Quick Tricks to Identify AP Problems

### ✔ Trick 1:  
If rearranging is allowed → **sort first**.

### ✔ Trick 2:  
AP requires:
```
max - min must be divisible evenly when evenly spaced
```
(though this is optional, sorting is simpler).

### ✔ Trick 3:  
If array has duplicates → still possible AP (like `[2,2,2]` → difference = 0).

### ✔ Trick 4:  
For small arrays (size ≤ 2), answer is always true.

---

# 🛠 Approaches 

---

## Approach 1: Sorting (Recommended)
1️⃣ Sort the array  
2️⃣ Compute the first difference  
3️⃣ Loop and compare all differences  
4️⃣ If any mismatch → return false  
5️⃣ Else → true  

### ✔ Time: `O(n log n)`  
### ✔ Space: `O(1)` or `O(n)` depending on sort implementation  

---

## Approach 2: Hashing + Math (Interesting alternative)

Observations:
- In an AP, all elements are of the form `min + k*d`  
- And must evenly fit into positions 0..n-1  
- Using a hash set, you can check if all required values exist

Procedure:
1. Find min and max  
2. Compute `d = (max - min) / (n - 1)` — must be integer  
3. Using a hash set, check that all required AP elements exist  

Useful when sorting must be avoided, but sorting is usually simpler.

---

# 🧪 Edge Cases

### ✔ Single element  
Always true.

### ✔ Two elements  
Always true (one step difference).

### ✔ All elements same  
Difference = 0 → valid AP.

### ✔ Negative numbers  
Still valid — AP works with negative values.

---


# ✅ Status: Explanation Completed  
Code should be added in a separate `.java` file inside this folder.

