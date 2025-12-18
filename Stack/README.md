# 📂 Stack

# 🧱 Stack — Complete Guide (Concepts + Pattern Recognition + Interview Roadmap)

A **Stack** is a linear data structure that follows the **LIFO (Last In → First Out)** principle.

Stacks are EXTREMELY important in:
✔ Expression evaluation  
✔ Backtracking  
✔ Recursion simulation  
✔ Histogram problems  
✔ Next greater/smaller element  
✔ Parentheses validation  
✔ DFS traversal  

This folder includes:
✔ Stack fundamentals  
✔ Types of stack problems  
✔ Monotonic stack  
✔ Expression/prefix/infix evaluation  
✔ Parentheses stack problems  
✔ Recommended folder structure  

---

# 🟦 1. What Is a Stack?

A **stack** stores elements such that the most recent element is processed first.

Representation:

```
Top → [9]
       [7]
       [4]
       [1] → Bottom
```

Operations:
- `push(x)` → insert  
- `pop()` → remove top  
- `peek()` → get top without removing  
- `isEmpty()`  

---

# 🟩 2. Why Do We Use Stacks?

Stacks are used when:
✔ You need to reverse operations  
✔ Last action must be undone  
✔ Expression parsing is needed  
✔ Recursion occurs  
✔ We must find nearest greater/smaller values  
✔ We need to backtrack  

Stacks simulate the call stack — they are foundational.

---

# 🟥 3. Types of Stack Problems

Stacks appear in MANY recurring patterns:

---

## 🟦 A. Monotonic Stack (Most Important)
Used for:
- Next Greater Element  
- Next Smaller Element  
- Previous Greater Element  
- Previous Smaller Element  
- Stock Span  
- Largest rectangle in histogram  
- Daily temperatures  

Monotonic stacks maintain:
- increasing order  
- OR decreasing order  

Extremely powerful for O(n) solutions.

---

## 🟧 B. Parentheses & Validity Problems
- Valid parentheses  
- Min add to make parentheses valid  
- Remove outer parentheses  
- Balance brackets `{}`, `[]`, `()`  

---

## 🟪 C. Expression Evaluation
Stacks evaluate:
- Infix  
- Prefix  
- Postfix  
- Expression simplification  
- Calculator problems  

Multiple stacks may be used:
- operand stack  
- operator stack  

---

## 🟫 D. Recursion Simulation
Recursion internally uses a stack.

Used for:
- Iterative DFS  
- Tree traversal (iterative inorder, preorder, postorder)  
- Function call simulation  

---

## 🟥 E. Backtracking
Undo operations via stack naturally.

Examples:
- path tracking  
- undo operations  
- restoring previous state  

---

# 🟧 4. Pattern Recognition — When to Use a Stack?

| Keywords / Clues | Use Stack |
|------------------|-----------|
| “undo/rollback/previous state” | Stack |
| “reverse process” | Stack |
| “valid parentheses” | Stack |
| “next greater/smaller” | Monotonic stack |
| “stock span / temperatures” | Monotonic stack |
| “expression evaluation” | Operator + operand stacks |
| “span”, “range”, “previous element greater than” | Stack |
| “largest rectangle” | Monotonic stack |
| “simulate recursion” | Stack |
| “DFS iterative” | Stack |

If the problem involves working backward or checking recent operations → **it is likely a stack problem.**

---

# 🟦 5. Classic Stack Interview Problems


---

## ✔ 1. Valid Parentheses  
Use stack to push opening brackets and match closing ones.

---

## ✔ 2. Next Greater Element (NGE)  
Monotonic decreasing stack.

---

## ✔ 3. Next Smaller Element  
Monotonic increasing stack.

---

## ✔ 4. Previous Greater / Previous Smaller  
Same concept but scan from left.

---

## ✔ 5. Stock Span Problem  
Classic monotonic stack.

---

## ✔ 6. Daily Temperatures  
Monotonic decreasing stack.

---

## ✔ 7. Largest Rectangle in Histogram  
One of the MOST important stack problems.

---

## ✔ 8. Trapping Rainwater  
Stack-based solution option (though two-pointer better).

---

## ✔ 9. Simplify Path (UNIX path simplifier)  
Stack stores directory levels.

---

## ✔ 10. Min Stack  
Stack that tracks minimum element in O(1) time.

---

## ✔ 11. Expression Evaluation  
- Infix to postfix  
- Postfix evaluation  
- Basic calculator (I, II, III)

---

## ✔ 12. Remove K Digits  
Monotonic stack variant.

---

# 🟫 6. Stack in Tree & Graph Problems

### ✔ Iterative DFS  
Use stack instead of recursion.

### ✔ Iterative Tree Traversals  
- Preorder  
- Inorder  
- Postorder  

Every recursive solution has an equivalent stack-based iterative version.

---

# 🟨 7. Time & Space Complexity

| Operation | Time |
|----------|------|
| Push | O(1) |
| Pop | O(1) |
| Peek | O(1) |
| Check empty | O(1) |

Monotonic stacks process each element once → **O(n)** time.

---

# 🟩 8. Types

```
Stacks/
 ├── README 
 ├── Basics 
 ├── Parentheses/
 │    ├── ValidParentheses 
 │    ├── MinAddToMakeValid 
 │    └── RemoveOuterParentheses 
 ├── MonotonicStack/
 │    ├── NextGreaterElement 
 │    ├── NextSmallerElement 
 │    ├── StockSpan 
 │    ├── DailyTemperatures 
 │    └── LargestRectangleHistogram 
 ├── ExpressionEvaluation/
 │    ├── InfixToPostfix 
 │    ├── PostfixEvaluation 
 │    └── BasicCalculator 
 ├── MinStack 
 ├── SimplifyPath 
 └── Practice/
```

---

# 🟥 9. Tips to Master Stack Problems

✔ Always draw stack operations step by step  
✔ Understand monotonic stacks deeply — many medium/hard problems use them  
✔ Practice parentheses and expression evaluation  
✔ Rewrite recursive solutions using stack to improve intuition  
✔ Trace through histogram & temperatures problems thoroughly  
✔ Know that many greedy + two-pointer optimizations start with stack solutions  

---

