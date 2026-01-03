# 📘 LeetCode 18 — 4Sum  
**Category:** Sorting / Two Pointers  
**Difficulty:** Medium  
**Tags:** Array, Sorting, Two Pointers

---

## 📝 Problem Summary

You are given an integer array `nums` and an integer `target`.

Your task is to find **all unique quadruplets**  
`[nums[a], nums[b], nums[c], nums[d]]` such that:
```
nums[a] + nums[b] + nums[c] + nums[d] = target
```

Conditions:
- All quadruplets must be **unique**
- Order of numbers inside a quadruplet does not matter
- Order of quadruplets in the result does not matter

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Pick **four distinct elements**
- Their sum must be **exactly equal** to `target`
- Avoid **duplicate quadruplets**

This is a **generalization of the 3Sum problem**.

---

## 🧠 Why This Problem Is Tricky

At first glance, brute force seems possible:
```
Try all combinations of 4 numbers → O(n⁴)
```

❌ This is far too slow.

Additionally:
- Duplicate values create duplicate quadruplets
- Managing uniqueness becomes complex without structure

This problem tests:
✔ pattern recognition  
✔ optimization  
✔ careful duplicate handling  

---

## 🔑 Core Insight (MOST IMPORTANT)

Just like:
```
3Sum → reduce to multiple 2Sum problems
```

Similarly:
```
4Sum → reduce to multiple 2Sum problems
```

How?
- Fix **two numbers**
- Solve **2Sum** on the remaining part using two pointers

---

## ⭐ Pattern Recognition

You should instantly think of this approach when you see:
- “k numbers sum to target”
- “find unique combinations”
- “avoid duplicates”

👉 This follows the **Sorting + Nested Loops + Two Pointers** pattern.

---

## 🛠 High-Level Strategy (NO CODE)

### Step 1: Sort the array

Sorting is essential because it:
- Enables two-pointer technique
- Groups duplicates together
- Makes skipping duplicates easy and safe

---

### Step 2: Fix the first two numbers

Use two loops:
- Outer loop fixes the **first number**
- Inner loop fixes the **second number**

Now the problem becomes:
```
Find two numbers whose sum = target − (first + second)
```

---

### Step 3: Apply Two Pointers for the remaining two numbers

- Left pointer starts after the second index
- Right pointer starts at the end
- Move pointers based on sum comparison

---

### Step 4: Handle duplicates carefully (VERY IMPORTANT)

To ensure **unique quadruplets**:
- Skip duplicate values for the first number
- Skip duplicate values for the second number
- After finding a valid quadruplet:
  - Move left pointer past duplicates
  - Move right pointer past duplicates

This prevents repeated answers.

---

## 🧠 Why Sorting Is Absolutely Required

Without sorting:
- Two-pointer logic does not work
- Duplicate detection becomes extremely complicated
- The solution becomes messy and error-prone

Sorting simplifies:
✔ correctness  
✔ performance  
✔ clarity  

---

## 🧩 Example Walkthrough

### Input:
```
nums = [1,0,-1,0,-2,2]
target = 0
```

Sorted:
```
[-2, -1, 0, 0, 1, 2]
```

Valid quadruplets:
```
[-2, -1, 1, 2]
[-2,  0, 0, 2]
[-1,  0, 0, 1]
```

All are unique and sum to 0.

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Using brute force (`O(n⁴)`)
Will time out.

### ❌ Forgetting to skip duplicates
Leads to repeated quadruplets.

### ❌ Not sorting first
Breaks two-pointer logic completely.

### ❌ Using HashSet incorrectly
Often leads to complex and inefficient solutions.

---

## 🧪 Edge Cases

- Array length < 4 → return empty
- All numbers same
- All positive or all negative numbers
- Very large target values
- Multiple duplicates in array

All must be handled correctly.

---


## CODE 
Code added separately in a `.java` file inside this folder.

