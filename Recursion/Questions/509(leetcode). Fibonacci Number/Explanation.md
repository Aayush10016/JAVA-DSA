# 📘 LeetCode 509 — Fibonacci Number  
**Category:** Dynamic Programming / Recursion  
**Difficulty:** Easy  
**Tags:** Recursion, Dynamic Programming, Math

---

## 📝 Problem Summary

The Fibonacci sequence is defined as:

```
F(0) = 0
F(1) = 1
F(n) = F(n - 1) + F(n - 2)  for n > 1
```

You are given an integer `n`.  
Your task is to return `F(n)`.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Compute the nth Fibonacci number
- Follow the mathematical definition
- Return the value efficiently

---

## 🧠 Why This Problem Is Important

This is a **classic recursion and dynamic programming problem**.

It is used to test:
- Recursion fundamentals  
- Overlapping subproblems  
- Optimization using DP  
- Time vs space tradeoffs  

---

## 🔑 Core Insight (MOST IMPORTANT)

The Fibonacci definition is **recursive**, but naive recursion is **very slow**.

```
F(n) = F(n-1) + F(n-2)
```

This creates **exponential repeated calculations**.

So we must optimize.

---

## ⭐ Pattern Recognition

You should think of these patterns:
- Recursion
- Dynamic Programming (Memoization / Tabulation)
- Iterative DP
- Space optimization

👉 This is the **introductory DP problem**.

---

# 🛠 Approach 1 — Recursion (Naive)

## 🧠 Idea

Directly follow the definition:
- If `n == 0` or `n == 1`, return `n`
- Otherwise return `fib(n-1) + fib(n-2)`

---

## ❌ Why This Is Bad

This recomputes the same values many times.

### Time Complexity:
```
O(2^n)  (Exponential)
```

### Space Complexity:
```
O(n) recursion stack
```

This approach **fails for large n**.

---

# 🛠 Approach 2 — Dynamic Programming (Memoization)

## 🧠 Idea

Store previously computed Fibonacci values so you don’t recompute them.

- Use an array or HashMap
- Save results of `F(n)` when computed
- Reuse them when needed

---

## ⏱ Complexity

- **Time:** `O(n)`  
- **Space:** `O(n)`  

This converts exponential recursion into linear time.

---

# 🛠 Approach 3 — Bottom-Up DP (Tabulation)

## 🧠 Idea

Compute Fibonacci from `0 → n` iteratively.

- Start from base cases
- Build up to `n`
- Avoid recursion completely

---

## ⏱ Complexity

- **Time:** `O(n)`  
- **Space:** `O(n)`  

This is the most commonly used DP solution.

---

# 🛠 Approach 4 — Space Optimized DP (Best)

## 🧠 Idea

You only need the last **two Fibonacci values** at any time.

So instead of an array:
- Keep two variables
- Update them iteratively

---

## ⏱ Complexity

- **Time:** `O(n)`  
- **Space:** `O(1)`  

This is the **optimal solution**.

---

## 🧩 Example Walkthrough

### Input:
```
n = 5
```

Fibonacci sequence:
```
0, 1, 1, 2, 3, 5
```

Output:
```
5
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Using naive recursion for large n  
Leads to TLE.

### ❌ Forgetting base cases  
Causes infinite recursion.

### ❌ Using large arrays unnecessarily  
Space optimized solution exists.

### ❌ Integer overflow for large Fibonacci values  
In other languages, use long or big integers.

---

## 🧪 Edge Cases

- `n = 0` → return 0  
- `n = 1` → return 1  
- Large n values (like 30, 100, etc.)  
- Negative input (not valid in this problem)

---

## CODE
solution added separately in a `.java` file inside this folder.

