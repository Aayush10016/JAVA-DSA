# 📘 LeetCode 37 — Sudoku Solver  
**Category:** Recursion / Backtracking  
**Difficulty:** Hard  
**Tags:** Recursion, Backtracking, Matrix

---

## 📝 Problem Summary

You are given a partially filled **9×9 Sudoku board**.

Your task is to **fill the empty cells** so that the board becomes a **valid Sudoku solution**.

### Sudoku Rules
1. Each row must contain digits `1–9` without repetition  
2. Each column must contain digits `1–9` without repetition  
3. Each 3×3 sub-box must contain digits `1–9` without repetition  

Empty cells are represented by `'.'`.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Try placing numbers from `1 to 9` in empty cells
- Check if the placement is valid
- Continue recursively
- Backtrack when a placement leads to conflict

This is a **classic backtracking problem**.

---

## 🧠 Why This Problem Is Important

This is one of the **most famous backtracking problems** in interviews.

It teaches:
- Deep recursion
- Constraint checking
- Smart pruning of invalid paths
- Grid-based backtracking

---

## 🔑 Core Insight (MOST IMPORTANT)

At every empty cell:

```
Try numbers from 1 → 9
If valid → move forward
If not → try next number
If no number works → backtrack
```

This builds a **recursion tree** of possibilities.

---

## ⭐ Pattern Recognition

You should think of backtracking when you see:
- Fill a grid
- Follow strict rules
- Try all possibilities
- Undo when invalid

👉 This is **Backtracking with Constraints**.

---

# 🛠 Approach — Recursion + Backtracking

## 🧠 Idea

1. Traverse the board cell by cell
2. When you find an empty cell:
   - Try placing digits `1–9`
   - Check if the placement is valid
3. If valid:
   - Recurse to solve the rest of the board
4. If recursion fails:
   - Remove the digit (backtrack)

---

## 🧩 Validity Check (Very Important)

Before placing a number, check:
- Row does not contain the number
- Column does not contain the number
- 3×3 box does not contain the number

Only then proceed.

---

## 🧩 Recursive Thought Process

For each empty cell:
```
for number in 1 to 9:
    if valid:
        place number
        recurse
        if solved → stop
        else → remove number (backtrack)
```

---

## ⏱ Complexity

- Very high (exponential in worst case)
- But pruning invalid paths makes it feasible

This is expected for Sudoku solving.

---

## 🧩 Example (Conceptual)

If a cell is empty:
```
Try 1 → conflict
Try 2 → conflict
Try 3 → valid → go deeper
...
If later stuck → backtrack and try next number
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Not checking all 3 conditions (row, column, box)  
Leads to invalid board.

### ❌ Forgetting to backtrack  
Board remains wrongly filled.

### ❌ Using brute force without pruning  
Becomes too slow.

### ❌ Not stopping after solution is found  
Unnecessary extra recursion.

---

## 🧪 Edge Cases

- Almost complete board
- Very few clues (hard Sudoku)
- Multiple empty cells in a row/column/box

Backtracking handles all cases.


---

## CODE

Solution added separately in a `.java` file inside this folder.

