# 📘 LeetCode 1464 — Maximum Product of Two Elements in an Array  
**Category:** Greedy / Sorting  
**Difficulty:** Easy  
**Tags:** Array, Sorting, Greedy

---

## 📝 Problem Summary

You are given an integer array `nums`.

You must pick **two different elements**, say `a` and `b`, and compute:
```
(a - 1) * (b - 1)
```

Your goal:
👉 **Return the maximum possible value of this expression.**

---

## 🎯 What the Problem Is Really Asking

This is NOT simply the product of the two largest numbers.

It is:
```
(largest - 1) * (second_largest - 1)
```

So the task becomes:
- Find the **two largest elements** in the array  
- Subtract 1 from each  
- Multiply them  

---

## 🧠 Key Insight (Most Important)

Since subtracting 1 is done after choosing the numbers:

### ✔ To maximize `(a - 1) * (b - 1)`, you must choose the **two largest values** in the array.

This is a pure **greedy strategy**:
> Choose the biggest two numbers available.

---

## ⭐ Pattern Recognition

This problem is identical to classic patterns:
- “Find the two largest elements”  
- “Maximize product of pair”  
- “Use greedy selection of top k elements”  

Most problems involving:
```
Max pair product
Max synergy
Max pair sum
Max (f(a), f(b))
```
→ Require selecting the largest two elements.

---

## 🛠 Approaches (Conceptual Only — No Code)

---

# 🔹 Approach 1: Sorting (Simple & Clear)

### Steps:
1. Sort the array  
2. Take the last two elements:
   ```
   max1 = nums[n-1]
   max2 = nums[n-2]
   ```
3. Return:
   ```
   (max1 - 1) * (max2 - 1)
   ```

### Complexity:
- Time: `O(n log n)`  
- Space: `O(1)` or `O(n)`  

This approach is easy to explain in interviews.

---

# 🔹 Approach 2: One-Pass Greedy (Optimal)

Instead of sorting:
- Traverse the array once  
- Keep track of:
  ```
  largest
  second_largest
  ```
- Apply the formula using them

### Complexity:
- Time: `O(n)`  
- Space: `O(1)`  

This is the **optimal** method.

---

## 🔍 Why Only the Two Largest Elements Matter?

Because the expression:
```
(a - 1) * (b - 1)
```
is **strictly increasing** in both `a` and `b`.

Meaning:
- If `a` increases → product increases  
- If `b` increases → product increases  

Therefore:
- Using any number smaller than the top two would reduce the result  
- No negative or special cases break this logic  
- There is always a unique optimal pair

This is simple, clean math — no tricks.

---

## 🧩 Example Walkthrough

### Example:
```
nums = [3,4,5,2]
```

Sorted:
```
[2,3,4,5]
```

Largest two:
```
5 and 4
```

Compute:
```
(5 - 1) * (4 - 1) = 4 * 3 = 12
```

Output → **12**

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Picking the two smallest values  
This minimizes the product.

### ❌ Forgetting to subtract 1  
The formula is very specific.

### ❌ Assuming duplicates cause issues  
Duplicates are perfectly fine:
```
nums = [5,5]
→ (4 * 4) = 16
```

### ❌ Using nested loops  
Leads to `O(n²)` time — unnecessary.

---

## 🧪 Edge Cases

- Array of exactly two numbers  
- Multiple equal values  
- Very large values  
- Small values like `[1,1]` → product is `0`  
- Mixed increasing/decreasing order  

All of these are handled naturally by picking the top two numbers.

---

## ⭐ short Explanation Tip


> “The expression (a - 1)(b - 1) increases as a and b increase, so the maximum result must come from the two largest elements. either sort or find the top two in one pass.”

---

## CODE
Code is added in a separate .java file inside this folder.

