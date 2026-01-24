# 📘 LeetCode 704 — Binary Search  
**Category:** Binary Search  
**Difficulty:** Easy  
**Tags:** Binary Search, Recursion, Iteration

---

## 📝 Problem Summary

You are given a **sorted integer array** `nums` and a target integer `target`.

Your task is to return the **index of `target`** in the array.  
If `target` is not present, return **-1**.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Search for a value in a **sorted array**
- Return its index if found
- Otherwise return -1
- Do it efficiently (not linear search)

---

## 🧠 Why This Problem Is Important

This is the **fundamental Binary Search problem**.

Binary Search is one of the most important algorithms in:
- Competitive programming  
- Interviews  
- Real-world systems (databases, search engines, OS kernels)

---

## 🔑 Core Insight (MOST IMPORTANT)

The array is **sorted**.

This means:
- If the middle element is greater than the target → target is on the **left**
- If the middle element is smaller than the target → target is on the **right**

Each step **cuts the search space in half**.

---

## ⭐ Pattern Recognition

You should instantly think of Binary Search when you see:
- Sorted array
- Search problem
- Need fast lookup
- Return index or -1

👉 This is the **classic binary search template problem**.

---

# 🛠 Approach 1 — Iterative Binary Search (Most Common)

## 🧠 Idea

Use two pointers:
```
low = 0
high = n - 1
```

Repeatedly:
1. Find middle index  
2. Compare middle value with target  
3. Move left or right pointer accordingly  

---

## 🧩 Thought Process

- If `nums[mid] == target` → return mid  
- If `nums[mid] < target` → discard left half  
- If `nums[mid] > target` → discard right half  

Continue until:
- Target is found  
- Or search space becomes empty  

---

## ⏱ Complexity

- **Time:** `O(log n)`  
- **Space:** `O(1)`  

---

## 👍 Why Iterative Is Preferred

- No recursion stack overhead  
- Faster in practice  
- Used in most production systems  

---

# 🛠 Approach 2 — Recursive Binary Search

## 🧠 Idea

Binary search can also be written using **recursion**.

Instead of looping:
- Call the function again on the left half or right half  
- Stop when the search range is invalid  

---

## 🧩 Thought Process

Recursive function parameters:
```
binarySearch(nums, low, high, target)
```

Base cases:
- If `low > high` → target not found → return -1  
- If middle value equals target → return mid  

Recursive calls:
- If target < mid value → search left half  
- If target > mid value → search right half  

---

## ⏱ Complexity

- **Time:** `O(log n)`  
- **Space:** `O(log n)` (due to recursion stack)  

---

## 👍 When to Use Recursion

- Educational purposes  
- Clean conceptual understanding  
- Functional programming style  

---

## 🧠 Iterative vs Recursive Binary Search

| Feature | Iterative | Recursive |
|----------|-----------|------------|
| Time Complexity | O(log n) | O(log n) |
| Space Complexity | O(1) | O(log n) |
| Performance | Faster | Slightly slower |
| Code Style | Loop-based | Function calls |
| Interview Preference | ✅ Preferred | Allowed |

---

## 🧩 Example Walkthrough

### Input:
```
nums = [-1,0,3,5,9,12]
target = 9
```

Steps:
1. mid = 2 → nums[2] = 3 → target > 3 → search right
2. mid = 4 → nums[4] = 9 → found

Output:
```
4
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Using linear search  
Binary search is required for optimal efficiency.

### ❌ Wrong mid calculation  
Using `(low + high) / 2` can overflow in other problems.

### ❌ Infinite loop  
Not updating `low` or `high` correctly.

### ❌ Forgetting base case in recursion  
Leads to stack overflow or wrong answers.

---

## 🧪 Edge Cases

- Empty array → return -1  
- Single element array  
- Target at first or last position  
- Target not present  
- Large arrays  

Binary search handles all efficiently.

---

## CODE

Code added separately in a `.java` file inside this folder.

