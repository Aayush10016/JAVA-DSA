# 📘 LeetCode 17 — Letter Combinations of a Phone Number  
**Category:** Recursion / Backtracking  
**Difficulty:** Medium  
**Tags:** Recursion, Backtracking, String

---

## 📝 Problem Summary

You are given a string `digits` containing digits from `2` to `9`.

Each digit maps to a set of letters just like a mobile phone keypad.

Your task is to return **all possible letter combinations** that the number could represent.

### Phone Keypad Mapping

```
2 → abc
3 → def
4 → ghi
5 → jkl
6 → mno
7 → pqrs
8 → tuv
9 → wxyz
```

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Take each digit
- Replace it with all its possible letters
- Generate all possible combinations of letters

This is similar to generating **all combinations from multiple choices**.

---

## 🧠 Why This Problem Is Important

This is a **classic backtracking problem** used in interviews to test:
- Recursion tree understanding  
- Combination generation  
- String building with backtracking  

---

## 🔑 Core Insight (MOST IMPORTANT)

At each digit, you have **multiple choices** (letters).

So for every letter of the current digit, you:
- Add the letter
- Move to the next digit
- Continue recursively

This builds a recursion tree of combinations.

---

## ⭐ Pattern Recognition

You should think of backtracking when you see:
- “All combinations”
- “Mapping digits to letters”
- “Build strings step by step”

👉 This is a **Backtracking + String Combination** problem.

---

# 🛠 Approach — Recursion + Backtracking

## 🧠 Idea

Create a recursive function that:
- Keeps track of current string combination
- Moves digit by digit
- Appends letters corresponding to the digit

---

## 🧩 Recursive Thought Process

For a digit:
```
For each letter mapped to this digit:
    Add letter to current string
    Recurse for next digit
    Remove letter (backtrack)
```

---

## 🧩 Base Case

When the current string length equals the length of digits:
- A valid combination is formed
- Add it to the result

---

## ⏱ Complexity

- **Time:** Exponential (because all combinations are generated)
- **Space:** Recursion stack + result storage

This is expected because we must list all combinations.

---

## 🧩 Example Walkthrough

### Input:
```
digits = "23"
```

Mapping:
```
2 → abc
3 → def
```

Combinations formed:
```
ad, ae, af,
bd, be, bf,
cd, ce, cf
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting to backtrack  
Leads to incorrect string formation.

### ❌ Not handling empty input  
If digits is empty, return empty list.

### ❌ Hardcoding mappings poorly  
Use a clean mapping structure.

---

## 🧪 Edge Cases

- Empty string → return empty list
- Single digit → return letters of that digit
- Multiple digits with different letter counts

---

## CODE

Solution added separately in a `.java` file inside this folder.

