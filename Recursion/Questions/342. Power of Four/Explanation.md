# 📘 LeetCode 342 — Power of Four  
**Category:** Math / Recursion / Bit Manipulation  
**Difficulty:** Easy  
**Tags:** Math, Recursion, Bit Manipulation

---

## 📝 Problem Summary

You are given an integer `n`.

Your task is to determine whether `n` is a **power of four**.

Return:
- `true` if `n` is a power of four  
- `false` otherwise  

---

## 🎯 What Is Being Asked (In Simple Words)

You must check if a number can be written as:

```
4^0, 4^1, 4^2, 4^3, ...
```

Examples:
```
1, 4, 16, 64, 256, ...
```

---

## 🧠 Why This Problem Is Important

This problem tests:
- Recursion and divide-by-constant logic  
- Bit manipulation understanding  
- Mathematical reasoning  
- Difference between power of 2 and power of 4  

Power-of-x problems appear in:
- Memory alignment  
- Graphics systems  
- Mathematical algorithms  
- Interview bit-trick questions  

---

## 🔑 Core Insight (MOST IMPORTANT)

A power of four means:

```
n = 4 × 4 × 4 × ... × 1
```

So:
- If `n` is divisible by 4, keep dividing  
- Eventually, you must reach `1`  

If at any point division is not possible → NOT a power of four.

---

## ⭐ Pattern Recognition

You should think of:
- Recursion with division by 4  
- Iterative division  
- Bit manipulation tricks (advanced)  

👉 This is a **divide-by-constant recursion pattern** similar to Power of Two and Power of Three.

---

# 🛠 Approach 1 — Recursion (Your Style)

## 🧠 Idea

Define power of four recursively:

```
n is power of four if:
- n == 1 (base case)
- n is divisible by 4 AND n/4 is power of four
```

---

## 🧩 Recursive Thought Process

1. If `n == 1` → return true  
2. If `n <= 0` or `n % 4 != 0` → return false  
3. Otherwise → recursively check `n / 4`  

This directly follows the mathematical definition.

---

## ⏱ Complexity

- **Time:** `O(log₄ n)`  
- **Space:** `O(log₄ n)` (recursion stack)

---

## 👍 Why Recursion Is Good Here

- Very intuitive  
- Matches math definition  
- Great recursion practice  

⚠ In interviews, bit tricks are preferred for O(1), but recursion is fully valid.

---

# 🛠 Approach 2 — Iterative Division

## 🧠 Idea

- While `n % 4 == 0`, divide `n` by 4  
- If final value is 1 → power of four  

---

## ⏱ Complexity

- **Time:** `O(log₄ n)`  
- **Space:** `O(1)`  

---

# 🛠 Approach 3 — Bit Manipulation Trick (Advanced)

## 🧠 Idea

A power of four has:
1. Exactly **one set bit** (like power of two)  
2. That set bit must be in an **even position**  

So:
- Check power of two using `n & (n - 1) == 0`
- Ensure the set bit is in even position using a bitmask

This is a classic **bit interview trick**.

---

## ⚠ Why Bit Trick Is Hard

- Requires binary position knowledge  
- Hard to derive under interview pressure  
- Less intuitive than recursion  

---

## 🧩 Example Walkthrough

### Input:
```
n = 64
```

Recursive:
```
64 → 16 → 4 → 1 → true
```

---

### Input:
```
n = 12
```

Check:
```
12 % 4 == 0 → 3
3 % 4 != 0 → false
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting base case (n == 1)  
Leads to infinite recursion.

### ❌ Not checking n <= 0  
Zero and negatives are NOT powers of four.

### ❌ Confusing power of two with power of four  
Example:
```
8 is power of two but NOT power of four
```

### ❌ Using floating-point logs  
Precision errors.

---

## 🧪 Edge Cases

- `n = 1` → true (4⁰)  
- `n = 0` → false  
- Negative numbers → false  
- Very large integers  


---

## CODE

Solution added separately in a `.java` file inside this folder.

