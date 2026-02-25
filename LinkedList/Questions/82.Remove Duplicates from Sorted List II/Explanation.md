# 📘 LeetCode 82 — Remove Duplicates from Sorted List II  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Two Pointers, Dummy Node

---

## 📝 Problem Summary

You are given the head of a **sorted** linked list.

Your task is to **delete all nodes that have duplicate numbers**,  
leaving only distinct numbers from the original list.

⚠️ Important:
- If a value appears more than once, remove **all occurrences** of that value.

---

## 🎯 What Is Being Asked (In Simple Words)

If a number appears more than once, completely remove it.

Example:

Input:
```
1 → 2 → 3 → 3 → 4 → 4 → 5
```

Output:
```
1 → 2 → 5
```

Another example:

Input:
```
1 → 1 → 1 → 2 → 3
```

Output:
```
2 → 3
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Handling duplicates carefully  
- Pointer skipping logic  
- Dummy node usage  
- Advanced linked list traversal  

It is different from LeetCode 83 (which keeps one copy).  
Here, you must remove duplicates completely.

---

## 🔑 Core Insight (MOST IMPORTANT)

Since the list is sorted:

All duplicates will appear consecutively.

So the strategy is:

- Detect a duplicate sequence  
- Skip the entire block  
- Only attach nodes that appear once  

Using a dummy node simplifies handling head removals.

---

# 🛠 Approach — Dummy Node + Two Pointers

## 🧠 Step-by-Step Idea

1. Create dummy node:
```
dummy → head
```

2. Use pointer:
```
prev = dummy
```

3. Traverse using:
```
current = head
```

4. If:
```
current.next exists AND current.val == current.next.val
```

Then:
- Store duplicate value
- Skip all nodes with that value
- Connect `prev.next` to next distinct node

Else:
- Move `prev` forward

---

## 🧩 Why Dummy Node Is Important

If duplicates occur at the beginning:

Example:
```
1 → 1 → 2 → 3
```

Without dummy node:
Head must be updated manually.

With dummy:
Cleaner pointer handling.

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(1)

Single traversal.

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 3 → 3 → 4 → 4 → 5
```

Steps:

- 1 → keep  
- 2 → keep  
- 3 → duplicate detected → remove both  
- 4 → duplicate detected → remove both  
- 5 → keep  

Result:
```
1 → 2 → 5
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Only removing one duplicate  
Must remove entire block.

### ❌ Not handling head duplicates  
Use dummy node.

### ❌ Incorrect pointer movement  
Careful when skipping nodes.

---

## 🧪 Edge Cases

- Empty list  
- Single node  
- All nodes are duplicates  
- No duplicates  
- Duplicates at head  
- Duplicates at tail  

---


## CODE

Solution added separately in a `.java` file inside this folder.
