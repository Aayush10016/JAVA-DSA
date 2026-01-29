# 📘 LeetCode 326 — Power of Three  
**Category:** Math / Recursion / Bit Manipulation  
**Difficulty:** Easy  
**Tags:** Math, Recursion, Bit Manipulation

---

## 📝 Problem Summary

You are given an integer `n`.

Your task is to determine whether `n` is a **power of three**.

Return:
- `true` if `n` is a power of three  
- `false` otherwise  

---

## 🎯 What Is Being Asked (In Simple Words)

You must check if a number can be written as:

```
3^0, 3^1, 3^2, 3^3, ...
```

Examples:
```
1, 3, 9, 27, 81, 243, ...
```

---

## 🧠 Why This Problem Is Important

This problem tests:
- Recursion fundamentals  
- Mathematical reasoning  
- Efficient divisibility checks  
- Understanding of exponential growth  

Power-of-x problems are common in:
- Computer systems  
- Algorithms  
- Mathematical modeling  

---

## 🔑 Core Insight (MOST IMPORTANT)

A power of three means:

```
n = 3 × 3 × 3 × ... × 1
```

So:
- If `n` is divisible by 3, keep dividing  
- Eventually you must reach `1`  

If you cannot divide cleanly → NOT a power of three.

---

## ⭐ Pattern Recognition

You should think of:
- Recursion with division  
- Iterative division  
- Mathematical tricks  

👉 This is a **divide-by-constant recursion pattern**.

---

# 🛠 Approach 1 — Recursion (Your Approach)

## 🧠 Idea

Define power of three recursively:

```
n is power of three if:
- n == 1 (base case)
- n is divisible by 3 AND n/3 is power of three
```

---

## 🧩 Recursive Thought Process

1. If `n == 1` → return true  
2. If `n <= 0` or `n % 3 != 0` → return false  
3. Otherwise → recursively check `n / 3`  

This follows the mathematical definition directly.

---

## ⏱ Complexity

- **Time:** `O(log₃ n)`  
- **Space:** `O(log₃ n)` (recursion stack)

---

## 👍 Why Recursion Is Good Here

- Very intuitive  
- Matches mathematical definition  
- Great for learning recursion patterns  

⚠ In interviews, iterative or math tricks may be preferred for optimization.

---

# 🛠 Approach 2 — Iterative Division

## 🧠 Idea

- While `n % 3 == 0`, divide `n` by 3  
- If final value is 1 → power of three  

---

## ⏱ Complexity

- **Time:** `O(log₃ n)`  
- **Space:** `O(1)`  

---

# 🛠 Approach 3 — Mathematical Trick (Advanced)

## 🧠 Idea

The largest power of 3 within integer range is:

```
3^19 = 1162261467
```

If `n` is a divisor of this number:
```
1162261467 % n == 0 → power of three
```

---

## ⚠ Why This Is Not Always Preferred

- Depends on integer limits  
- Less intuitive  
- Harder to explain in interviews  

---

## 🧩 Example Walkthrough

### Input:
```
n = 27
```

Recursive:
```
27 → 9 → 3 → 1 → true
```

---

### Input:
```
n = 45
```

Check:
```
45 % 3 == 0 → 15
15 % 3 == 0 → 5
5 % 3 != 0 → false
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting base case (n == 1)  
Causes infinite recursion.

### ❌ Not checking n <= 0  
Negative numbers and zero are NOT powers of three.

### ❌ Using floating-point logs  
Precision errors.

### ❌ Overcomplicating with bit tricks  
Power of 3 does not have a simple bit trick like power of 2.

---

## 🧪 Edge Cases

- `n = 1` → true (3⁰)  
- `n = 0` → false  
- Negative numbers → false  
- Large integers  

---


## CODE

Solution added separately in a `.java` file inside this folder.

