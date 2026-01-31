# 📘 LeetCode 39 — Combination Sum  
**Category:** Recursion / Backtracking  
**Difficulty:** Medium  
**Tags:** Recursion, Backtracking, Array

---

## 📝 Problem Summary

You are given:
- An array of **distinct integers** `candidates`
- A target integer `target`

Your task is to return **all unique combinations** of candidates where the chosen numbers sum to `target`.

### Important Rules
- You can use the **same number multiple times**
- Order inside a combination does not matter
- Combinations must be **unique**

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Pick numbers from the array
- Add them repeatedly
- Stop when the sum becomes exactly equal to target
- Backtrack when the sum exceeds target

This is a **classic recursion + backtracking** problem.

---

## 🧠 Why This Problem Is Important

This is one of the **most important backtracking problems** in interviews.

It teaches:
- Recursion tree building
- Backtracking decisions
- Choice → Explore → Undo pattern
- Combination generation logic

---

## 🔑 Core Insight (MOST IMPORTANT)

At every step, you have a choice:
```
Pick the current number OR skip it
```

And since numbers can be reused:
```
After picking, you stay on the same index
```

This creates a recursion tree of possibilities.

---

## ⭐ Pattern Recognition

You should think of backtracking when you see:
- “All combinations”
- “Target sum”
- “Reuse elements”
- “Return all possible answers”

👉 This is a **standard Backtracking template problem**.

---

# 🛠 Approach — Recursion + Backtracking (Main Approach)

## 🧠 Idea

Create a recursive function that:
- Keeps track of current combination
- Keeps track of remaining target
- Moves through the candidates

At each step:
1. If target becomes `0` → valid combination found
2. If target becomes negative → stop exploring
3. Otherwise:
   - Include the current element
   - Recurse
   - Remove the element (backtrack)
   - Move to next index

---

## 🧩 Recursive Thought Process

At index `i`, you have two choices:

### Choice 1 — Take the element
- Add `candidates[i]`
- Reduce target
- Call recursion with same index `i` (reuse allowed)

### Choice 2 — Skip the element
- Move to index `i + 1`

This builds the full solution space.

---

## ⏱ Complexity

- **Time:** Exponential (depends on combinations)
- **Space:** Recursion stack + combination storage

This is expected because we must generate all combinations.

---

## 🧩 Example Walkthrough

### Input:
```
candidates = [2,3,6,7]
target = 7
```

Possible combinations:
```
[2,2,3]
[7]
```

Recursive exploration:
```
Start with 2 → 2 → 2 → 2 (exceeds) → backtrack
Start with 2 → 2 → 3 (target reached)
Start with 3 → ...
Start with 7 (target reached)
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Not backtracking properly  
Forgetting to remove element after recursion.

### ❌ Moving to next index after picking  
You must stay on same index when reusing.

### ❌ Allowing duplicates  
Order must not create duplicate combinations.

### ❌ Not stopping when target < 0  
Leads to unnecessary recursion.

---

## 🧪 Edge Cases

- No combination possible  
- Single element equals target  
- Large target with small numbers  
- Candidates array of size 1  

---

## CODE  
Solution added separately in a `.java` file inside this folder.

