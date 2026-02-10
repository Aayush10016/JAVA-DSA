# 📘 LeetCode 142 — Linked List Cycle II  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Two Pointers, Floyd’s Algorithm

---

## 📝 Problem Summary

You are given the head of a linked list.

The linked list may contain a **cycle**.  
Your task is to **return the node where the cycle begins**.

If there is **no cycle**, return `null`.

⚠️ You are **not allowed to modify the linked list**.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Detect if a cycle exists in the linked list
- If it exists, find the **exact node** where the cycle starts
- If it does not exist, return `null`

This is **not just cycle detection**, but **cycle start detection**.

---

## 🧠 Why This Problem Is Important

This is a **classic linked list interview problem**.

It tests:
- Pointer movement logic
- Mathematical reasoning
- Floyd’s Cycle Detection Algorithm
- Deep understanding of linked list traversal

---

## 🔑 Core Insight (MOST IMPORTANT)

This problem is solved using **Floyd’s Tortoise and Hare Algorithm**.

There are **two phases**:
1. Detect if a cycle exists
2. Find the starting node of the cycle

---

## ⭐ Pattern Recognition

You should think of this pattern when you see:
- Linked list
- Cycle
- Detect loop
- Find entry point of loop

👉 This is a **Two Pointer (Fast & Slow) problem**.

---

# 🛠 Approach — Floyd’s Cycle Detection Algorithm

## 🧠 Phase 1: Detect Cycle

### Idea:
- Use two pointers:
  - `slow` moves one step
  - `fast` moves two steps
- If a cycle exists, `slow` and `fast` will **meet inside the cycle**

If they never meet → no cycle.

---

## 🧠 Phase 2: Find Cycle Start

Once a meeting point is found:
1. Place one pointer at the **head**
2. Keep the other pointer at the **meeting point**
3. Move both pointers **one step at a time**
4. The node where they meet again is the **start of the cycle**

---

## 🧩 Why This Works (Intuition)

Let:
- Distance from head to cycle start = `x`
- Distance from cycle start to meeting point = `y`
- Cycle length = `c`

Mathematically:
```
fast = 2 × slow
```

This leads to:
```
x = c - y
```

So when one pointer starts from head and the other from meeting point,
they meet exactly at the cycle start.

---

## ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)` (no extra memory used)

This is the most optimal solution.

---

## 🧩 Example Walkthrough

### Example:
```
1 → 2 → 3 → 4 → 5
          ↑       ↓
          ← ← ← ← ←
```

Steps:
- Fast and slow meet at some node inside the cycle
- Move one pointer to head
- Move both one step at a time
- They meet again at node `3` → cycle start

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Returning meeting point instead of cycle start  
Meeting point is NOT always the start.

### ❌ Forgetting to check `fast` and `fast.next`  
Leads to null pointer exception.

### ❌ Using extra data structures  
HashSet solution exists but uses extra space.

---

## 🧪 Edge Cases

- Empty list  
- Single node without cycle  
- Single node with cycle  
- Cycle starts at head  
- Long list with late cycle  

---

## CODE
Solution added separately in a `.java` file inside this folder.

