# 📘 LeetCode 921 — Minimum Add to Make Parentheses Valid  
**Category:** Stack / String  
**Difficulty:** Medium  
**Tags:** Stack, Greedy, String

---

## 📝 Problem Summary

You are given a string `s` consisting only of the characters:

```
'(' and ')'
```

Your task is to determine the **minimum number of parentheses that must be added** to make the string **valid**.

A string is valid if:

1. Every opening bracket `'('` has a corresponding closing bracket `')'`.
2. Parentheses are closed in the correct order.

---

## 🎯 What Is Being Asked (In Simple Words)

You must determine **how many parentheses need to be inserted** to make the string balanced.

Example:

Input:
```
s = "())"
```

Output:
```
1
```

Because adding one `'('` or one `')'` appropriately can balance the string.

---

## 🧠 Why This Problem Is Important

This problem tests:

- Parentheses balancing logic  
- Stack-based thinking  
- Greedy counting approach  

It is a variation of the classic **valid parentheses problem**.

---

## 🔑 Core Insight (MOST IMPORTANT)

Whenever we see:

- `'('` → it expects a future `')'`
- `')'` → it must match a previous `'('`

If there is no `'('` available for a `')'`, we must **add one `'('`**.

At the end, any remaining `'('` require **matching `')'`**.

---

# 🛠 Approach 1 — Stack Simulation

## 🧠 Idea

1. Traverse the string.
2. Use a stack to track unmatched `'('`.
3. If `')'` appears:
   - If stack has `'('` → pop it.
   - Otherwise → increment additions.

4. At the end:
   - Remaining `'('` in stack require closing `')'`.

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(n)

---

# 🛠 Approach 2 — Greedy Counter (Optimal)

Instead of using a stack, we can use counters.

## 🧠 Idea

Maintain two variables:

```
openNeeded
insertions
```

Traverse string:

- If `'('` → increase open count
- If `')'`:
  - If open exists → match it
  - Else → add an opening bracket

At the end:

Remaining open brackets must be closed.

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(1)

This is the most optimal approach.

---

## 🧩 Example Walkthrough

Input:
```
s = "()))(("
```

Processing:

```
( → open = 1
) → open = 0
) → need '(' → additions = 1
) → need '(' → additions = 2
( → open = 1
( → open = 2
```

Remaining opens:

```
2 → need 2 ')'
```

Total additions:

```
4
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Ignoring unmatched closing brackets  
Must add `'('`.

### ❌ Forgetting unmatched opening brackets at the end  

### ❌ Overcomplicating with full stack when counters suffice  

---

## 🧪 Edge Cases

- Empty string  
- Only `'('` characters  
- Only `')'` characters  
- Already balanced string  

Example:

```
"()()()" → 0 additions
```

---


## CODE
Solution added separately in the `.java` file inside this folder.
