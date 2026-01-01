# 📘 LeetCode 15 — 3Sum  
**Category:** Sorting / Two Pointers  
**Difficulty:** Medium  
**Tags:** Array, Sorting, Two Pointers

---

## 📝 Problem Summary

You are given an integer array `nums`.

Your task is to find **all unique triplets** `[nums[i], nums[j], nums[k]]` such that:
```
nums[i] + nums[j] + nums[k] = 0
```

Conditions:
- Triplets must be **unique**
- Order inside a triplet does not matter
- Order of triplets in the output does not matter

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Pick **three different elements**
- Their sum must be exactly **zero**
- You must **avoid duplicate triplets**

This is not about indices — it’s about **unique value combinations**.

---

## 🧠 Why This Problem Is Tricky

At first glance, it looks like:
> “Just try all triplets.”

❌ That leads to:
```
O(n³) time → too slow
```

Also:
- Duplicate values create duplicate triplets
- Managing uniqueness becomes hard quickly

This problem tests:
✔ optimization  
✔ duplicate handling  
✔ pattern recognition  

---

## 🔑 Core Insight (MOST IMPORTANT)

If the array is **sorted**, the problem reduces to:

> Fix one element, then find **two numbers whose sum is the negative of that element**.

That turns the problem into:
```
3Sum → Multiple 2Sum problems
```

And **2Sum on a sorted array** can be solved using **two pointers**.

---

## ⭐ Pattern Recognition

You should instantly think of this pattern when you see:
- “Triplets”
- “Sum equals target”
- “Unique combinations”
- “Avoid duplicates”

👉 This is a **Sorting + Two Pointers + Duplicate Skipping** problem.

---

## 🛠 High-Level Strategy (NO CODE)

### Step 1: Sort the array

Sorting helps:
- Apply two-pointer technique
- Group duplicates together
- Skip repeated values cleanly

---

### Step 2: Fix one element

For each index `i`:
- Treat `nums[i]` as the **first element**
- Reduce the problem to:
```
Find two numbers after i whose sum = -nums[i]
```

---

### Step 3: Apply Two Pointers

- Left pointer starts at `i + 1`
- Right pointer starts at end of array
- Move pointers based on sum comparison

---

### Step 4: Handle duplicates (VERY IMPORTANT)

To ensure **unique triplets**:
- Skip duplicate values for `i`
- After finding a valid triplet:
  - Move left pointer past duplicates
  - Move right pointer past duplicates

This is what prevents repeated answers.

---

## 🧠 Why Sorting Is Essential

Without sorting:
- Two-pointer technique doesn’t work
- Duplicate detection becomes extremely complex
- You cannot efficiently skip repeated values

Sorting simplifies **both logic and correctness**.

---

## 🧩 Example Walkthrough

### Input:
```
nums = [-1, 0, 1, 2, -1, -4]
```

Sorted:
```
[-4, -1, -1, 0, 1, 2]
```

Fix `-1`:
- Need two numbers that sum to `1`
- `0 + 1 = 1` → valid triplet `[-1, 0, 1]`

Fix next `-1`:
- Skip (duplicate)

Fix `0`:
- Need two numbers that sum to `0`
- No valid pair

Final result:
```
[[-1, -1, 2], [-1, 0, 1]]
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Using brute force  
`O(n³)` will TLE.

### ❌ Not skipping duplicates  
Leads to repeated triplets.

### ❌ Forgetting to sort  
Breaks two-pointer logic.

### ❌ Using HashSet incorrectly  
May pass but becomes messy and inefficient.

---

## 🧪 Edge Cases

- Array size < 3 → return empty
- All zeros → only one triplet `[0,0,0]`
- No valid triplets → return empty
- Many duplicate values
- Mix of positives and negatives

All must be handled correctly.

---

## CODE
code is added separately in a `.java` file inside this folder.

