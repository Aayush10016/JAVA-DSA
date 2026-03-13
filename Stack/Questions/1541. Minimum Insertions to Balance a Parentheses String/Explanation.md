# 📘 LeetCode 1541 — Minimum Insertions to Balance a Parentheses String  
**Category:** Stack / Greedy / String  
**Difficulty:** Medium  
**Tags:** Stack, Greedy, Parentheses

---

## 📝 Problem Summary

You are given a string `s` consisting only of the characters:

```
'(' and ')'
```

The parentheses string is considered **balanced** if:

1. Every `'('` must be closed by **two consecutive ')'**
2. The closing parentheses must appear **after** the opening parenthesis.

Example of valid pattern:

```
()
→ invalid

())
→ valid
```

Your task is to determine the **minimum number of insertions** needed to make the string balanced.

---

## 🎯 What Is Being Asked (In Simple Words)

Each `'('` requires **two closing parentheses `))`**.

So valid groups look like:

```
())
())
())
```

Example:

Input:
```
s = "(()))"
```

Output:
```
1
```

Because we must insert one `')'` to complete the pair.

---

## 🧠 Why This Problem Is Important

This problem tests:

- Parentheses balancing logic  
- Greedy reasoning  
- Careful counting of unmatched parentheses  

It is an extension of the standard parentheses balancing problem.

---

## 🔑 Core Insight (MOST IMPORTANT)

For every `'('`, we need **two closing parentheses `))`**.

Maintain two values:

```
open = number of unmatched '('
insertions = number of insertions needed
```

While scanning the string:

- If `'('` appears → expect **two ')'**
- If `')'` appears → check whether it forms a valid pair

---

# 🛠 Approach — Greedy Counting

## 🧠 Step-by-Step Idea

Traverse the string from left to right.

Maintain:

```
open = number of unmatched '('
insertions = required insertions
```

Rules:

### When encountering `'('`

```
open++
```

But if previous closing was single `')'`, we may need adjustment.

---

### When encountering `')'`

Check next character:

If next character is also `')'`:

```
valid pair '))'
```

Else:

We must insert one `')'`.

---

### Matching with '('

If an unmatched `'('` exists:

```
open--
```

Else:

We must insert `'('`.

---

### Final Step

Remaining unmatched `'('` require:

```
2 × open
```

closing parentheses.

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(1)

Only counters are used.

---

## 🧩 Example Walkthrough

Input:

```
s = "(()))"
```

Steps:

```
( → open = 1
( → open = 2
)) → match → open = 1
) → missing ')' → insert 1
```

Final insertions:

```
1
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting that '(' needs **two** ')'

### ❌ Ignoring single closing parentheses

Example:

```
"()"
```

Needs extra `')'`.

### ❌ Not handling unmatched closing parentheses

---

## 🧪 Edge Cases

- Empty string  
- Only `'('` characters  
- Only `')'` characters  
- Already balanced string  

Example:

```
"())" → valid
```

---


## CODE
Solution added separately in the `.java` file inside this folder.
