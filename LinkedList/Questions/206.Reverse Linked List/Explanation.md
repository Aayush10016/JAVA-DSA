# 📘 LeetCode 206 — Reverse Linked List  
**Category:** Linked List  
**Difficulty:** Easy  
**Tags:** Linked List, Recursion, Iteration

---

## 📝 Problem Summary

You are given the head of a singly linked list.

Your task is to **reverse the linked list** and return the new head.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Reverse the direction of all pointers
- Make the last node the new head
- Ensure all `next` references are reversed

Example:

Input:
```
1 → 2 → 3 → 4 → 5
```

Output:
```
5 → 4 → 3 → 2 → 1
```

---

## 🧠 Why This Problem Is Important

This is one of the **most fundamental linked list problems**.

It tests:
- Pointer manipulation
- Iterative thinking
- Recursive thinking
- In-place reversal logic

This problem appears very frequently in interviews.

---

## 🔑 Core Insight (MOST IMPORTANT)

To reverse a linked list:

At each node:
- Store the next node
- Reverse the pointer
- Move forward

You must carefully preserve references before modifying them.

---

# 🛠 Approach 1 — Iterative (Optimal & Most Common)

## 🧠 Idea

Use three pointers:
- `prev` → initially null
- `current` → head
- `next` → temporary storage

At each step:
1. Save `current.next`
2. Reverse pointer (`current.next = prev`)
3. Move `prev` forward
4. Move `current` forward

Continue until `current` becomes null.

Return `prev` (new head).

---

## ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)` (in-place)

This is the preferred solution in interviews.

---

# 🛠 Approach 2 — Recursion (Elegant)

## 🧠 Idea

Recursively reverse the rest of the list.

Base case:
- If head is null or head.next is null → return head

Recursive step:
- Reverse rest of the list
- Make `head.next.next = head`
- Set `head.next = null`

Return new head from recursion.

---

## ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)` (recursion stack)

---

## 🧩 Example Walkthrough (Iterative)

Initial:
```
prev = null
current = 1
```

Step 1:
```
1 → null
prev = 1
current = 2
```

Step 2:
```
2 → 1
prev = 2
current = 3
```

Continue until:
```
5 → 4 → 3 → 2 → 1
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Losing reference to next node  
Must store `next` before reversing pointer.

### ❌ Forgetting to set last node's next to null  
Handled automatically if logic is correct.

### ❌ Returning wrong pointer  
Must return `prev`, not `current`.

---

## 🧪 Edge Cases

- Empty list  
- Single node  
- Two-node list  
- Large list  

All handled naturally by iterative approach.

---

## CODE
Solution added separately in a `.java` file inside this folder.

