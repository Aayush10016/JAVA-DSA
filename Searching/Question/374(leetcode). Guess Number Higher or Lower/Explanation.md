# 📘 LeetCode 374 — Guess Number Higher or Lower  
**Category:** Binary Search  
**Difficulty:** Easy  
**Tags:** Binary Search, Interactive

---

## 📝 Problem Summary

You are given a number range from `1` to `n`.

There is a **hidden number** that you must guess.

You are provided with a predefined API:
```
guess(num)
```

The API returns:
- `0` → your guess is correct  
- `-1` → your guess is higher than the hidden number  
- `1` → your guess is lower than the hidden number  

Your task is to find the hidden number using the **minimum number of guesses**.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Guess a number between `1` and `n`
- Use feedback from `guess()` to adjust your next guess
- Find the correct number efficiently

This is NOT a brute-force guessing problem.

---

## 🧠 Why This Problem Is Important

This problem is a **textbook example of Binary Search**.

It tests whether you can:
- Narrow down a search space
- Use feedback to eliminate half the possibilities
- Apply binary search logic even when the data is “virtual”

---

## 🔑 Core Insight (MOST IMPORTANT)

Each response from `guess(num)` tells you **which half of the range can be discarded**.

That is exactly what Binary Search does.

---

## ⭐ Pattern Recognition

You should immediately think of Binary Search when you see:
- “Guess higher or lower”
- “Feedback-based narrowing”
- “Range from 1 to n”
- “Minimize number of guesses”

👉 This is **Binary Search on Answer Space**.

---

## 🛠 High-Level Strategy (NO CODE)

1. Set `low = 1`, `high = n`
2. Guess the middle number:
   ```
   mid = low + (high - low) / 2
   ```
3. Use `guess(mid)`:
   - `0` → correct answer
   - `-1` → search left half
   - `1` → search right half
4. Repeat until the number is found

Each step cuts the search space in half.

---

## 🧠 Why Binary Search Is Optimal Here

- Brute force → `O(n)` guesses  
- Binary search → `O(log n)` guesses  

For large `n`, this difference is massive.

This is the **minimum possible number of guesses**.

---

## 🧩 Example Walkthrough

### Suppose:
```
n = 10
Hidden number = 6
```

Guesses:
- Guess 5 → too low → search [6,10]
- Guess 8 → too high → search [6,7]
- Guess 6 → correct

Answer found in **3 steps**.

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Using linear guessing  
This wastes guesses and fails efficiency requirements.

### ❌ Incorrect mid calculation  
Using `(low + high) / 2` may overflow in other problems.

### ❌ Infinite loops  
Forgetting to move `low` or `high` properly.

### ❌ Overthinking the API  
`guess()` already gives all the information you need.

---

## 🧪 Edge Cases

- `n = 1` → answer is 1
- Hidden number is at boundaries (1 or n)
- Large `n` values

Binary search handles all of these naturally.

---


## CODE

Code added separately in a `.java` file inside this folder.

