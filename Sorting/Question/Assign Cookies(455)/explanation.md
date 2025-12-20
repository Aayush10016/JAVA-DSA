# 🍪 LeetCode 455 — Assign Cookies  
**Category:** Greedy / Sorting  
**Difficulty:** Easy

---

# 📝 Problem Summary

You are given two integer arrays:

- `g[i]` → greed factor of child i  
- `s[j]` → size of cookie j  

A child i is satisfied **only if**:
```
cookie_size >= greed_factor
```

Each child can receive **at most one** cookie.  
Each cookie can be used **at most once**.

### 🎯 Goal  
Return the **maximum number of children** that can be satisfied.

---

# 🔍 Example

**Input:**  
```
g = [1,2,3]
s = [1,1]
```

**Sorted:**  
```
g = [1,2,3]
s = [1,1]
```

Only 1 child is satisfied → **Output: 1**

---

# 🧠 Intuition

To maximize the number of satisfied children, we must match:

✔ the **smallest cookie**  
with  
✔ the **least greedy child**

Why?

Because:
- Small cookies cannot satisfy big-greedy children  
- Using big cookies on small-greedy children *wastes potential*

This is a classic **Greedy Matching Strategy**:
> Always assign the smallest valid cookie to the child with the smallest greed.

---

# 🛠 Approaches

## ✅ Approach 1: Greedy + Sorting (Optimal)

### Steps:
1. Sort greed array `g`
2. Sort cookie sizes `s`
3. Use two pointers:
   - `i` → child
   - `j` → cookie
4. If cookie can satisfy child → assign → move both pointers  
5. Else → try next larger cookie

### ✔ Time Complexity  
`O(n log n)` — sorting  
`O(n)` — two pointer scan  
Total → **O(n log n)**

---
---

# 🚀 Why This Works

Sorting helps us:
- Always use the smallest cookie that can satisfy a child  
- Never waste large cookies on children with low greed  
- Maximize total satisfied children  

This greedy approach is proven optimal.

---

# 🧩 Alternative Approach (Not Optimal)

Trying to match large cookies first fails, because:
- You may waste large cookies on children who only need small ones  
- Lower-greed children might become impossible to satisfy later  

---

# 🧪 Edge Cases

- All children can be satisfied  
- No child can be satisfied  
- Equal length arrays  
- Large arrays (sorting still works efficiently)
  

---

Code should is added in a separate `.java` file inside this folder.



