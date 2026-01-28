# 📘 LeetCode 231 — Power of Two  
**Category:** Bit Manipulation / Math / Recursion  
**Difficulty:** Easy  
**Tags:** Bit Manipulation, Math, Recursion

---

## 📝 Problem Summary

You are given an integer `n`.

Your task is to determine whether `n` is a **power of two**.

Return:
- `true` if `n` is a power of two  
- `false` otherwise  

---

## 🎯 What Is Being Asked (In Simple Words)

You must check if a number can be written as:

```
2^0, 2^1, 2^2, 2^3, ...
```

Examples of powers of two:
```
1, 2, 4, 8, 16, 32, 64, ...
```

---

## 🧠 Why This Problem Is Important

This is a **classic interview problem** that tests:
- Binary properties  
- Recursion understanding  
- Bit manipulation tricks  
- Efficient number checks  

Power of two checks appear in:
- Memory allocation  
- Hash tables  
- Bit masking  
- Operating systems  

---

## 🔑 Core Insight (MOST IMPORTANT)

A power of two has **only one bit set** in binary.

Example:
```
1  -> 0001
2  -> 0010
4  -> 0100
8  -> 1000
```

---

## ⭐ Pattern Recognition

You should think of:
- Bit manipulation tricks  
- Recursion on numbers  
- Mathematical division by 2  

👉 This problem has **multiple valid patterns**.

---

# 🛠 Approach 1 — Bit Manipulation Trick (Optimal)

## 🧠 Idea

For any power of two:
```
n & (n - 1) == 0
```

Reason:
- `n` has only one set bit
- `n - 1` flips that bit and all bits after it
- AND operation becomes zero

Also ensure:
```
n > 0
```

---

## ⏱ Complexity

- **Time:** `O(1)`  
- **Space:** `O(1)`  

This is the **most optimal and expected solution**.

---

# 🛠 Approach 2 — Recursion (Your Approach)

## 🧠 Idea

A power of two can be defined recursively:

```
n is power of two if:
- n == 1 (base case)
- n is divisible by 2 AND n/2 is power of two
```

### Recursive Logic:
1. If `n == 1` → return true  
2. If `n <= 0` or `n % 2 != 0` → return false  
3. Otherwise, recursively check `n / 2`

This directly follows the mathematical definition of powers of two.

---

## ⏱ Complexity

- **Time:** `O(log n)`  
- **Space:** `O(log n)` (recursion stack)

---

## 👍 When Recursion Is Useful

- Learning recursion fundamentals  
- Demonstrating divide-by-2 recursive thinking  
- Educational clarity  

⚠ In interviews, bit manipulation is preferred, but recursion is still valid.

---

# 🛠 Approach 3 — Repeated Division (Iterative)

## 🧠 Idea

- While `n` is divisible by 2:
  - Divide by 2
- If final result is 1 → power of two

---

## ⏱ Complexity

- **Time:** `O(log n)`  
- **Space:** `O(1)`  

---

# 🛠 Approach 4 — Using Logarithms (Not Recommended)

## 🧠 Idea

Check:
```
log2(n) is an integer
```

❌ Floating-point precision issues  
❌ Not recommended in interviews  

---

## 🧩 Example Walkthrough

### Input:
```
n = 16
```

Recursive steps:
```
16 → 8 → 4 → 2 → 1 → true
```

Binary check:
```
16 & 15 = 0 → true
```

---

### Input:
```
n = 12
```

Recursive:
```
12 % 2 != 0 → false
```

Binary:
```
12 & 11 ≠ 0 → false
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting n > 0  
0 and negatives are not powers of two.

### ❌ Infinite recursion  
Forgetting base cases.

### ❌ Using recursion without constraints  
Recursion depth = log n, which is fine but still unnecessary.

### ❌ Using floating-point logs  
Precision errors.

---

## 🧪 Edge Cases

- `n = 1` → true  
- `n = 0` → false  
- Negative numbers → false  
- Very large integers  

---

## CODE
Solution added separately in a `.java` file inside this folder.

