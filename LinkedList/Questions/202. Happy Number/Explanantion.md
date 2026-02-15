# 📘 LeetCode 202 — Happy Number  
**Category:** Linked List Concept / Cycle Detection  
**Difficulty:** Easy  
**Tags:** Math, Linked List Logic, Cycle Detection

---

## 📝 Problem Summary

Write an algorithm to determine if a number `n` is a **happy number**.

A happy number is defined as:

1. Replace the number by the **sum of the squares of its digits**.
2. Repeat the process.
3. If the number eventually becomes `1`, it is a happy number.
4. If it enters a cycle that does not include `1`, it is not a happy number.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Continuously transform the number
- Detect whether it reaches `1`
- Or whether it enters a repeating loop

---

## 🧠 How I Solved It (Using Linked List Logic)

Instead of using a HashSet, I treated the transformation process like a **linked list**.

Think of each number as a node:

```
n → f(n) → f(f(n)) → f(f(f(n))) → ...
```

Where:
```
f(n) = sum of squares of digits of n
```

This forms a sequence exactly like a linked list.

If a cycle exists, it behaves like a linked list cycle.

---

## 🔑 Core Insight (Linked List Perspective)

This problem can be converted into:

> Detect cycle in a linked list

So I used **Floyd’s Cycle Detection Algorithm (Fast & Slow Pointers)**.

---

# 🛠 Approach — Fast & Slow Pointer (Linked List Method)

## 🧠 Idea

1. Define a function:
   ```
   getNext(n) → returns sum of squares of digits
   ```

2. Initialize:
   ```
   slow = n
   fast = n
   ```

3. Move:
   ```
   slow = getNext(slow)
   fast = getNext(getNext(fast))
   ```

4. If:
   - `fast == 1` → happy number
   - `slow == fast` → cycle detected → not happy

---

## 🧩 Why This Works

Because:

- Either the sequence reaches `1`
- Or it loops in a cycle

And any cycle can be detected using:
```
Fast & Slow pointers
```

Just like detecting a loop in a linked list.

---

## ⏱ Complexity

- **Time:** O(log n) per transformation  
- **Space:** O(1) (no extra memory used)

This is optimal compared to using a HashSet.

---

## 🧩 Example Walkthrough

### Input:
```
n = 19
```

Sequence:
```
19 → 82 → 68 → 100 → 1
```

Fast pointer reaches 1 → Happy Number.

---

### Not Happy Example:
```
2 → 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
```

Cycle detected → Not happy.

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Using infinite loop without cycle detection  
Leads to TLE.

### ❌ Incorrect digit extraction  
Must use:
```
digit = n % 10
n = n / 10
```

### ❌ Not handling n = 1 case early  

---

## 🧪 Edge Cases

- n = 1 → true  
- Single digit numbers  
- Large numbers  
- Numbers entering small cycle  

---


## CODE
Solution added separately in a `.java` file inside this folder.

