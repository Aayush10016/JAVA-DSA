# 📘 LeetCode 16 — 3Sum Closest  
**Category:** Sorting / Two Pointers  
**Difficulty:** Medium  
**Tags:** Array, Sorting, Two Pointers

---

## 📝 Problem Summary

You are given an integer array `nums` and an integer `target`.

Your task is to find **three integers** in `nums` such that:
```
Their sum is closest to target
```

Return **the sum** of those three integers.

📌 You may assume that **exactly one solution exists**.

---

## 🎯 What Is Being Asked (In Simple Words)

Unlike **3Sum**, here:

- You do **NOT** need sum = target
- You need the sum that is **closest** to target
- Only **one best answer** exists
- You return the **sum**, not the triplet

This is an **optimization problem**, not a matching problem.

---

## 🧠 Why This Problem Is Tricky

At first glance, it feels similar to 3Sum, but:

- You are **not allowed to stop early**
- You must compare absolute differences
- You must keep track of the *best answer so far*

This tests:
✔ greedy thinking  
✔ careful comparison  
✔ two-pointer control  

---

## 🔑 Core Insight (MOST IMPORTANT)

Just like 3Sum:

> If the array is **sorted**, the 3Sum Closest problem can be reduced to multiple **2Sum Closest** problems.

This allows you to:
- Fix one number
- Use two pointers to search remaining two
- Continuously improve the closest sum

---

## ⭐ Pattern Recognition

You should think of this approach immediately when you see:
- “closest to target”
- “three numbers”
- “minimize absolute difference”
- “sorted array”

👉 This is a **Sorting + Two Pointers + Greedy Optimization** problem.

---

## 🛠 High-Level Strategy (NO CODE)

### Step 1: Sort the array

Sorting allows:
- Two-pointer movement
- Controlled increase/decrease of sum
- Predictable behavior of pointers

---

### Step 2: Fix one element

For each index `i`:
- Treat `nums[i]` as the first element
- Remaining problem:
```
Find two numbers whose sum is closest to (target - nums[i])
```

---

### Step 3: Two-Pointer Search

- Left pointer → `i + 1`
- Right pointer → `end of array`
- Compute current sum:
```
currentSum = nums[i] + nums[left] + nums[right]
```

---

### Step 4: Greedy Adjustment

- If `currentSum < target` → move left pointer right
- If `currentSum > target` → move right pointer left
- If equal → this is the best possible answer (difference = 0)

Always update the **closest sum so far**.

---

## 🧠 Why Two Pointers Work Here

Because the array is sorted:

- Moving `left` increases the sum
- Moving `right` decreases the sum

This lets you **systematically explore sums** closer to the target without checking all combinations.

---

## 🧩 Example Walkthrough

### Input:
```
nums = [-1, 2, 1, -4]
target = 1
```

Sorted:
```
[-4, -1, 1, 2]
```

Try combinations:
- `-4 + -1 + 2 = -3`
- `-4 + 1 + 2 = -1`
- `-1 + 1 + 2 = 2`  ← closest to 1

Answer:
```
2
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Treating this like 3Sum  
There is **no exact match requirement**.

### ❌ Forgetting absolute difference  
You must compare:
```
|currentSum - target|
```

### ❌ Not updating the closest value every time  
You may miss a better solution.

### ❌ Using brute force  
`O(n³)` is unnecessary and inefficient.

---

## 🧪 Edge Cases

- Array size = 3 → only one possible sum
- Large positive or negative target
- All numbers positive
- All numbers negative
- Mix of positives & negatives

All are handled naturally by the sorted two-pointer approach.


---


## CODE
 
Code added separately in a `.java` file inside this folder.

