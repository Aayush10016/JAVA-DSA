# 📘 LeetCode 278 — First Bad Version  
**Category:** Binary Search  
**Difficulty:** Easy  
**Tags:** Binary Search, Interactive

---

## 📝 Problem Summary

You are given `n` versions of a product, labeled from `1` to `n`.

There exists a **bad version**, and **all versions after it are also bad**.

You are provided with an API:
```
isBadVersion(version)
```

- Returns `true` if the version is bad  
- Returns `false` if the version is good  

Your task is to find the **first bad version**.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Identify the **earliest version** that is bad
- Minimize the number of API calls
- Use the information that versions change **monotonically** from good → bad

This is **not** a linear scan problem.

---

## 🧠 Why This Problem Is Important

This problem is a **classic Binary Search on Answer Space** example.

It tests whether you can:
- Detect a monotonic condition
- Efficiently narrow down a range
- Minimize expensive API calls

---

## 🔑 Core Insight (MOST IMPORTANT)

The versions follow this pattern:
```
Good → Good → Good → Bad → Bad → Bad
```

Once a version is bad, **all later versions are also bad**.

This monotonic behavior makes the problem **perfect for binary search**.

---

## ⭐ Pattern Recognition

You should immediately think of Binary Search when you see:
- “First occurrence”
- “All values after a point satisfy a condition”
- “Good then bad”
- “Minimize API calls”

👉 This is **Binary Search on a Monotonic Predicate**.

---

## 🛠 High-Level Strategy (NO CODE)

1. Set:
   ```
   low = 1
   high = n
   ```
2. While `low < high`:
   - Check the middle version
   - If `mid` is bad → the first bad version is **at or before mid**
   - If `mid` is good → the first bad version is **after mid**
3. Narrow the range accordingly
4. When the loop ends, `low` points to the first bad version

---

## 🧠 Why Binary Search Is Optimal Here

- Linear scan → `O(n)` API calls ❌  
- Binary search → `O(log n)` API calls ✅  

Since `isBadVersion()` is considered **expensive**, minimizing calls is critical.

Binary search guarantees the minimum possible calls.

---

## 🧩 Example Walkthrough

### Suppose:
```
n = 5
Bad versions start at = 4
```

Versions:
```
1 → Good
2 → Good
3 → Good
4 → Bad
5 → Bad
```

Binary search steps:
- Check mid = 3 → good → search [4,5]
- Check mid = 4 → bad → search [4,4]

Answer → **4**

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Using linear search  
Too slow and wastes API calls.

### ❌ Returning the first bad version found  
You must ensure it is the **first**, not just any bad one.

### ❌ Incorrect mid calculation  
Using `(low + high) / 2` can overflow in other problems.

### ❌ Infinite loops  
Not updating `low` and `high` correctly.

---

## 🧪 Edge Cases

- `n = 1` (only one version)
- First version is bad
- Last version is bad
- Large `n` values

Binary search handles all cases cleanly.

---

## CODE

Code added separately in a `.java` file inside this folder.

