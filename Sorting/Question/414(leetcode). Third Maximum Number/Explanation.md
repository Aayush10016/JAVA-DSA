# 📘 LeetCode 414 — Third Maximum Number  
**Category:** Sorting / Greedy  
**Difficulty:** Easy  
**Tags:** Array, Sorting, Greedy

---

## 📝 Problem Summary

You are given an integer array `nums`.

Your task is to return the **third distinct maximum number** in the array.

If the third distinct maximum **does not exist**, return the **maximum number** instead.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Consider **distinct values only** (duplicates do not count)
- Find the **3rd largest unique number**
- If there are **fewer than 3 distinct numbers**, return the largest one

This is NOT the same as finding the 3rd index from the end.

---

## 🧠 Why This Problem Is Tricky

At first glance, it sounds like:
> “Just sort and take the third last element.”

❌ That fails when **duplicates exist**.

Example:
```
nums = [2,2,3,1]
```

Sorted:
```
[1,2,2,3]
```

Distinct values:
```
[1,2,3]
```

Third maximum → `1`, not `2`.

So the key difficulty is:
👉 **Handling duplicates correctly**

---

## 🔑 Core Insight (MOST IMPORTANT)

This problem is about **ranking distinct values**, not positions.

You must:
- Ignore duplicates  
- Track only unique numbers  
- Find the 3rd largest among them  

This makes it a **distinct-ranking problem**.

---

## ⭐ Pattern Recognition

This problem fits these common patterns:

| Pattern | Why |
|-------|-----|
| **Sorting + uniqueness** | Sorting helps rank values |
| **Greedy top-k tracking** | Track top 3 distinct values |
| **Set usage** | Remove duplicates easily |
| **One-pass max tracking** | Optimal without sorting |

Whenever you see:
- “k-th maximum”
- “distinct values”
- “fallback if not exists”

👉 Think **top-k with duplicate handling**.

---

## 🛠 Approaches (Conceptual Only — NO CODE)

---

## 🔹 Approach 1: Sorting + Remove Duplicates (Simple)

### Steps:
1. Remove duplicates (using set or logic)
2. Sort the unique values
3. If size ≥ 3 → return 3rd largest
4. Else → return largest

### Complexity:
- Time → `O(n log n)`
- Space → `O(n)`

✔ Easy to explain  
✔ Very interview-friendly  

---

## 🔹 Approach 2: One-Pass Greedy (Optimal)

Instead of sorting:
- Track the **largest**, **second largest**, and **third largest** distinct values
- Skip duplicates
- Update values carefully while scanning

### Key idea:
You only care about the **top 3 unique numbers**, nothing else.

### Complexity:
- Time → `O(n)`
- Space → `O(1)`

✔ Best performance  
✔ Shows strong problem-solving skills  

---

## 🔹 Approach 3: Using a Set + Priority Queue

- Insert values into a set (removes duplicates)
- Use a max-heap or min-heap of size 3
- Extract answer based on size

### Complexity:
- Time → `O(n log k)`
- Space → `O(k)`

Useful conceptually, but overkill for this problem.

---

## 🧩 Example Walkthrough

### Example 1
```
nums = [3,2,1]
```

Distinct values:
```
[1,2,3]
```

Third maximum → `1`

---

### Example 2
```
nums = [1,2]
```

Distinct values:
```
[1,2]
```

Less than 3 distinct → return max → `2`

---

### Example 3
```
nums = [2,2,3,1]
```

Distinct values:
```
[1,2,3]
```

Third maximum → `1`

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Counting duplicates as separate values  
Duplicates must be ignored.

### ❌ Returning the 3rd index after sorting  
Sorting index ≠ ranking when duplicates exist.

### ❌ Forgetting fallback condition  
If fewer than 3 distinct values → return maximum.

### ❌ Using unnecessary data structures  
Only top 3 values matter.

---

## 🧪 Edge Cases

- All elements same → return that value
- Exactly 3 distinct values
- Large array with many duplicates
- Negative numbers
- Mixed positive & negative values

All must be handled correctly.



---

## CODE 

Code added separately in a `.java` file inside this folder.

