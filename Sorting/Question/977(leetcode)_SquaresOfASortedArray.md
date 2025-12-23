# 📘 LeetCode 977 — Squares of a Sorted Array  
**Category:** Two Pointers / Sorting  
**Difficulty:** Easy  
**Tags:** Array, Sorting, Two-Pointer Technique

---

## 📝 Problem Summary

You are given an integer array `nums` sorted in **non-decreasing order**, but it may contain:
- Negative numbers  
- Zero  
- Positive numbers  

After squaring each number, the order will **change**, because:

✔ Negative values become positive  
✔ Large negative values may become larger than positive ones after squaring  

### 🎯 Goal  
Return a **sorted array of the squares** of all numbers in `nums`.

---

## 🔍 Why This Problem Is Interesting

A naive approach would be:
1. Square every number  
2. Sort the results  

This works but is **not optimal**.

Since the input is *already sorted*, we can do better using a **two-pointer pattern**.

---

## 🧠 Key Insight (Most Important)

In a sorted array:

- The **largest square** will come from either the **leftmost negative number** or the **rightmost positive number**.
- This is because:
  ```
  (-9)^2 = 81   // large
   (10)^2 = 100 // also large
   (1)^2 = 1 
  ```

So the **extremes** of the array give the **biggest squares**.

This naturally leads to the **two-pointer technique**.

---

## ⭐ Recognizing the Pattern

This problem is a classic example of:

👉 **Two pointers moving inward to fill an output array from the back.**

Use this technique when:
- Array is sorted  
- But applying a function (like square, absolute value) breaks the order  
- You want sorted output without re-sorting  

---

## 🧠 Two-Pointer Thought Process

Let:

- `left = 0`  
- `right = n - 1`  
- Largest square gets placed at the **end** of the result array  

Compare:
```
abs(nums[left]) vs abs(nums[right])
```

Whichever is larger produces the larger square → put that at the end.

Then move the pointer inward.

Repeat until all elements are placed.

This eliminates the need for sorting after squaring.

---

## 🛠 Approaches (Conceptual Only)

---

### 🔹 Approach 1: Square + Sort (Simple but not optimal)

Steps:

1. Square each element  
2. Sort the result list  
3. Return sorted squares  

### Complexity:
- Time: `O(n log n)`
- Space: `O(n)`

Not bad, but does not use the sorted property of the input.

---

### 🔹 Approach 2: Two Pointers (Optimal Approach)

This method uses:
- Sorted input  
- Reverse filling technique  
- Pointer comparison  

### Steps:

1. Set `left` at start, `right` at end  
2. Compare absolute values  
3. Place *larger square* at the *end* of the output  
4. Move pointer inward  
5. Continue until array is filled  

### Complexity:
- Time: `O(n)`  
- Space: `O(n)` output array  

This is the intended and optimal way.

---

## 🧩 Example Walkthrough

### Input:
```
nums = [-4, -1, 0, 3, 10]
```

Squared values (unsorted):
```
[16, 1, 0, 9, 100]
```

But using two pointers:

- Compare |-4| vs |10| → 10 wins → place 100  
- Compare |-4| vs |3| → 4 wins → place 16  
- Compare |-1| vs |3| → 3 wins → place 9  
- Compare |-1| vs |0| → 1 wins → place 1  
- Remaining: 0 → place 0  

Final result:
```
[0, 1, 9, 16, 100]
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting that squares of negatives may be largest  
Always check both ends of the array.

### ❌ Trying to square in-place  
This breaks ordering and complicates logic.

### ❌ Sorting after squaring  
Works, but wastes the fact that input is already sorted.

### ❌ Not filling result array from the back  
Biggest square should go last.

---

## 🧪 Edge Cases to Keep in Mind

- All positive values → already sorted after square  
- All negative values → squares become decreasing; must reverse  
- Mix of negatives & positives → two-pointer method shines  
- Contains zeros → works naturally  

> “Why not just square and sort?”

You should answer:
> “Sorting is O(n log n), but since the input is already sorted, the largest squared value always comes from the edges. We can generate the sorted output in O(n) with two pointers.”



---

# CODE
solution code is in a separate `.java` file inside this folder.

