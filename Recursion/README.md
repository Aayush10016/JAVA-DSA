# 🔁 Recursion 

Recursion is one of the most fundamental problem-solving techniques in DSA.  
A problem is recursive when **the solution depends on solving smaller versions of the same problem**.

# 🧠 1. What is Recursion?

**Recursion** is a technique where a function calls itself to break down a problem into smaller subproblems.

Every recursive function must have:

### ✔ Base Case  
Condition where recursion STOPS.

### ✔ Recursive Case  
Where the function keeps calling itself.

---

# ⚙️ 2. Why Use Recursion?

Recursion works best when:
- A problem can be broken into **smaller identical subproblems**
- Tree or graph traversal
- Generating combinations, permutations, subsets
- Backtracking problems  
- Divide and conquer algorithms (Merge Sort, Quick Sort)

---

# 🔍 3. How to Identify a Recursion Problem?

Look for these keywords:

| Keywords in Question | Recursion Pattern |
|----------------------|------------------|
| “all possible…” | Backtracking / Recursion |
| “subsets” | Recursion tree |
| “choices per step” | Recursion |
| “divide the problem into halves” | Divide & Conquer |
| “permutations / combinations” | Recursion |
| “tree traversal” | Recursion |
| “paths in grid” | Recursion |
| “solve using smaller subproblems” | Recursion |

If you see branching choices → **recursion is likely the best solution.**

---

# 🌳 4. Recursion Tree Intuition (Very Important)

Every recursive function can be visualized as a **tree**:

```
                f(n)
               /   \
          f(n-1)   f(n-2)
           / \        ...
```

Each call branches into smaller calls until hitting the **base case**.

This helps understand:
✔ Time complexity  
✔ How many calls happen  
✔ How subproblems are connected  

---

# 🧩 5. Core Template for Recursion (Kunal Kushwaha Style)

```java
public static void solve(int n) {
    // Base case
    if (n == 0) return;

    // Work (before recursion)
    
    solve(n - 1);  // Recursive call

    // Work (after recursion)
}
```

Every recursion problem follows this structure.

---

# 🧱 6. Common Recursion Patterns

### 🟦 Pattern 1: Simple Decreasing Recursion
Use when problem size reduces by 1.
- Print numbers
- Factorial
- Sum of digits

---

### 🟩 Pattern 2: Divide & Conquer
Split into halves
- Merge Sort
- Quick Sort
- Binary Search (recursive)

---

### 🟧 Pattern 3: Recursion on Strings / Arrays
- Remove characters
- Replace characters
- Subsequence generation

---

### 🟥 Pattern 4: Recursion on Trees
Every traversal in binary trees uses recursion.

---

### 🟪 Pattern 5: Backtracking
Modify → explore → undo
Used for:
- Permutations
- Combinations
- N-Queens
- Sudoku Solver
- Subsets

---

# 🔥 7. Recursion Golden Rule

> **“Do not try to solve the whole problem.  
Solve 1 step and let recursion handle the rest.”**

Example:
To reverse a string:
- Reverse smaller part
- Add first character at end

---

# 💡 8. Base Case Mistakes to Avoid

❌ Missing base case → infinite recursion  
❌ Wrong base case → incorrect output  
❌ Modifying input incorrectly before passing down  

---

# 🧪 9. Problems 

### ✔ Basics
- Print numbers 1 to n  
- Factorial  
- Fibonacci  
- Reverse string  
- Counting digits  

### ✔ Array/String Recursion
- Check if array sorted  
- Linear search using recursion  
- Remove character from string  
- Subsequence generation  

### ✔ Backtracking
- Subsets  
- Permutations  
- Combination Sum  
- Phone keypad  
- N-Queens  
- Sudoku Solver  

### ✔ Divide & Conquer
- Merge Sort  
- Quick Sort  

### ✔ Tree recursion (linked with Trees folder)
- Height  
- Traversal  
- Balanced tree  

---

# 🎯 FINAL NOTE

Recursion is a foundational topic for DSA mastery.  
Once you understand:
- Base case  
- Recursive case  
- Recursion tree  


This README will serve as your complete guide for Recursion.

