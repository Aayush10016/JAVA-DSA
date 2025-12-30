# 📘 LeetCode 922 — Sort Array By Parity II  
**Category:** Sorting / Two Pointers  
**Difficulty:** Easy  
**Tags:** Array, Two Pointers, Greedy

---

## 📝 Problem Summary

You are given an integer array `nums` of **even length**.

The array contains:
- Exactly **half even numbers**
- Exactly **half odd numbers**

Your task is to rearrange the array such that:
- Numbers at **even indices** are even  
- Numbers at **odd indices** are odd  

📌 Indexing is **0-based**.

---

## 🎯 What Is Being Asked (In Simple Words)

You are NOT asked to sort by value.

You are asked to **place numbers based on parity and index**:
```
Index 0 → even number
Index 1 → odd number
Index 2 → even number
Index 3 → odd number
...
```

The problem guarantees that **a valid answer always exists**.

---

## 🧠 Why This Problem Is Tricky

At first glance, it looks like a sorting problem.

But actually:
- The *order between even numbers does not matter*
- The *order between odd numbers does not matter*
- Only **correct placement** matters

So full sorting is unnecessary and inefficient.

---

## 🔑 Core Insight (MOST IMPORTANT)

This is a **position-based matching problem**, not a value-based sorting problem.

Key facts:
- Even indices must hold even values  
- Odd indices must hold odd values  
- The array already has equal count of even and odd numbers  

This naturally leads to a **two-pointer strategy**.

---

## ⭐ Pattern Recognition

You should immediately think of this pattern when you see:
- “Place elements at specific indices”
- “Even index → even value”
- “Odd index → odd value”
- “Rearrange, not fully sort”

👉 This is a **Two Pointers + Greedy placement** problem.

---

## 🛠 Approaches (Conceptual Only — NO CODE)

---

## 🔹 Approach 1: Two Pointers on Even & Odd Indices (Optimal)

### Idea:
- Maintain one pointer for **even indices**
- Maintain one pointer for **odd indices**
- If an element is at the wrong index:
  - Swap it with a correctly-typed element from the opposite pointer

### Why it works:
- You directly fix misplaced elements
- Each swap corrects two positions
- No extra sorting required

### Complexity:
- Time → `O(n)`
- Space → `O(1)`

This is the **intended optimal solution**.

---

## 🔹 Approach 2: Extra Array Placement (Simple but Extra Space)

### Idea:
- Create a new array
- Fill even indices with even numbers
- Fill odd indices with odd numbers

### Complexity:
- Time → `O(n)`
- Space → `O(n)`

This is easier to implement but not in-place.

---

## 🔹 Approach 3: Sorting + Post-Processing (Not Recommended)

- Sort the array
- Then rearrange parity positions

❌ This wastes time (`O(n log n)`) and ignores the problem’s structure.

---

## 🧩 Example Walkthrough

### Input:
```
nums = [4,2,5,7]
```

Indices:
```
0 1 2 3
```

Goal:
```
index 0 → even
index 1 → odd
index 2 → even
index 3 → odd
```

Valid output:
```
[4,5,2,7]
```

or
```
[2,7,4,5]
```

Multiple correct answers exist.

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Trying to fully sort the array  
Sorting by value is unnecessary.

### ❌ Ignoring index parity  
Value parity must match index parity.

### ❌ Using nested loops  
Leads to inefficient `O(n²)` solutions.

### ❌ Forgetting the guarantee  
Problem guarantees equal even/odd count → no need for extra checks.

---

## 🧪 Edge Cases

- Minimum size array (`n = 2`)
- All evens initially in wrong places
- Already valid array
- Large array with random order

All handled naturally by two-pointer logic.


---

## CODE

Code is added in a seperate ".java" file inside this folder
Add your Java solution separately in a `.java` file inside this folder.

