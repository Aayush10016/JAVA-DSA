# 📘 LeetCode 628 — Maximum Product of Three Numbers  
**Category:** Sorting / Greedy / Math  
**Difficulty:** Easy  
**Tags:** Array, Sorting, Greedy, Math

---

## 📝 Problem Summary

You are given an integer array `nums` that may contain:
- Positive numbers
- Negative numbers
- Zero

Your task is to find the **maximum possible product** that can be formed by multiplying **exactly three different elements** from the array.

---

## 🎯 What Is Being Asked (In Simple Words)

Out of all possible combinations of three numbers:
- Choose the three numbers
- Multiply them
- Return the **largest possible result**

---

## 🧠 Why This Problem Is Tricky

At first glance, it looks simple:
> “Just take the three largest numbers.”

❌ **This is NOT always correct.**

Why?

Because **negative numbers change everything**.

---

## 🔑 Core Mathematical Insight (MOST IMPORTANT)

### Negative × Negative = Positive

This single fact completely changes the solution.

That means:
- Two **very small (negative)** numbers can combine to give a **very large positive** result.
- When multiplied by a large positive number, this can beat the product of the top three positives.

---

## 🧩 Key Observation That Solves the Problem

After arranging the numbers in order (mentally or by sorting), **only two combinations can produce the maximum product**.

### ✔ Candidate 1: Three Largest Numbers
```
largest × second_largest × third_largest
```

This works when:
- Numbers are mostly positive
- Negatives are not large enough to matter

---

### ✔ Candidate 2: Two Smallest Numbers × Largest Number
```
smallest × second_smallest × largest
```

This works when:
- The smallest numbers are **negative**
- Their product becomes a large positive
- Multiplying by the largest positive boosts the result

---

## 🧠 Why ONLY These Two Cases?

Because:
- Using any number smaller than the top 3 positives reduces the product
- Using any number larger than the two smallest negatives reduces the negative impact
- No other combination can mathematically exceed these two cases

So instead of checking all `O(n³)` combinations, we reduce the problem to **just two comparisons**.

---

## 📊 Example Walkthrough (Very Important)

### Example 1
```
nums = [1, 2, 3, 4]
```

- Three largest → `4 × 3 × 2 = 24`
- Two smallest × largest → `1 × 2 × 4 = 8`

✅ Answer → `24`

---

### Example 2 (The Tricky One)
```
nums = [-10, -10, 5, 2]
```

- Three largest → `5 × 2 × (-10) = -100`
- Two smallest × largest → `(-10) × (-10) × 5 = 500`

✅ Answer → `500`

This example is **WHY the problem exists**.

---

## 🔍 Pattern Recognition (How to Spot This Quickly in Interviews)

You should immediately think of this approach when you see:
- “Maximum product”
- “Array contains negative numbers”
- “Choose fixed number of elements”

👉 This is a **Sorting + Greedy + Math observation problem**, NOT brute force.

---

## 🛠 Possible Approach

### 🔹 Approach 1: Sorting-Based Reasoning
1. Conceptually arrange numbers in increasing order
2. Identify:
   - The three largest numbers
   - The two smallest numbers
3. Compare the two candidate products
4. Choose the maximum

✔ Simple  
✔ Easy to explain  
✔ Interview-friendly  

---

## 🚫 Common Mistakes (Interview Traps)

### ❌ Always picking the top three values
Fails when large negatives exist.

### ❌ Ignoring negative numbers
Negatives are the **entire trick** of this problem.

### ❌ Trying brute force
`O(n³)` is unnecessary and inefficient.

---

## 🧪 Edge Case Awareness

- All positive numbers → top three
- All negative numbers → three least negative
- Zeros present → comparison still works
- Large array → sorting or one-pass both safe

---
# CODE
code is added separately in a `.java` file.

