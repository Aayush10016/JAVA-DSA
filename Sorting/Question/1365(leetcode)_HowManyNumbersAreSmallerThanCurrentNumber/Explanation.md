# 📘 LeetCode 1365 — How Many Numbers Are Smaller Than the Current Number  
**Category:** Sorting / Counting / Hashing  
**Difficulty:** Easy  
**Tags:** Array, Sorting, Frequency Counting

---

## 📝 Problem Summary

You are given an array `nums`.

For every element `nums[i]`, you must determine:
```
How many numbers in the array are strictly smaller than nums[i]?
```

Return the answer as a new array of the same length.

---

## 🎯 What the Problem Is Actually Asking

For each number:
- Count how many values are **less** than it  
- Order matters only for output, not for counting  
- Duplicates do NOT count as smaller  

This is a classic *frequency + prefix sum* type problem disguised as a sorting problem.

---

## 🧠 Key Insight (Most Important)

Since each value in `nums` lies within the range:
```
0 ≤ nums[i] ≤ 100
```
…the value range is **very small**.

This allows us to solve the problem without doing expensive sorting per element.

This constraint makes the **counting approach** extremely efficient.

---

## ⭐ Pattern Recognition

This problem instantly hints at these patterns:

| Pattern | Why it fits |
|--------|-------------|
| **Sorting** | Sorted array helps determine how many values come before each number |
| **Frequency counting** | Small value range makes counting arrays effective |
| **Prefix sums** | Helps answer “how many numbers are less than X” instantly |
| **Hashing** | Stores counts and rankings |

👉 When constraints are small (0 to 100), always think **counting sort logic**.

---

## 🛠 Approaches (Conceptual Only — NO CODE)

---

## 🔹 Approach 1: Sorting + Mapping (Easy & Intuitive)

### Idea:
1. Make a copy of the array  
2. Sort the copy  
3. For each unique number, record:
   ```
   first index of that number in the sorted array
   ```
4. That index tells how many numbers are smaller  

### Why it works:
In a sorted list:
- All numbers before position `i` are smaller than the value at `i`.

### Complexity:
- Time: `O(n log n)`  
- Space: `O(n)`  

This is the simplest-to-explain interview approach.

---

## 🔹 Approach 2: Frequency Counting (Optimal Approach)

### Why it works:
Since values are from **0 to 100**, create a freq array:
```
freq[x] = how many times x appears
```

Then compute **prefix sums**:
```
prefix[x] = how many numbers are < x
```

Finally:
```
answer[i] = prefix[nums[i]]
```

### Complexity:
- Time: `O(n + range)` → `O(n + 100)`
- Space: `O(100)`  
- No sorting needed  

This is the **fastest** and **most optimal** solution.

---

## 🔹 Approach 3: Brute Force (Not efficient)

For each element, check all others.
- Time: `O(n²)`
- Never acceptable for interviews unless array is tiny.

---

## 🧠 Deep Intuition Behind the Optimal Solution

### ✔ What does `prefix[x]` mean?
If `prefix[7] = 12`, it means:
```
There are 12 numbers in the array that are < 7.
```

So for any element `nums[i] = 7`:
```
answer[i] = prefix[7]
```

This directly answers the question.

---

## 🧩 Example Walkthrough

### Input:
```
nums = [8, 1, 2, 2, 3]
```

Sorted:
```
[1, 2, 2, 3, 8]
```

Smaller counts:
- 8 → 4 numbers smaller  
- 1 → 0  
- 2 → 1  
- 2 → 1  
- 3 → 3  

Final output:
```
[4, 0, 1, 1, 3]
```

---

## 🚫 Common Mistakes to Avoid

### ❌ Comparing equal numbers  
Numbers equal to the current number are **not smaller**.

### ❌ Double-counting duplicates  
All duplicates share the **same smaller count**, because sorting gives a fixed position.

### ❌ Using nested loops  
Will time out for larger input.

---

## 🧪 Edge Cases

- All numbers identical → result is all zeros  
- Strictly increasing → result is `[0,1,2,...]`  
- Strictly decreasing → result reflects sorted positions  
- Values include 0 (lowest possible number)  

---

##  Tip

If asked to optimize:

Say:
> “Since the numbers range only from 0 to 100, we can use a counting array and prefix sums to determine, for each number, how many elements are smaller than it. This gives an O(n) solution.”


---

## CODE
Code is added in a separate .java file inside this folder.

