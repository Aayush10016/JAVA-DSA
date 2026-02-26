# 📘 LeetCode 1721 — Swapping Nodes in a Linked List  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Two Pointers, One Pass

---

## 📝 Problem Summary

You are given the head of a singly linked list and an integer `k`.

Your task is to **swap the values of the k-th node from the beginning and the k-th node from the end**, and return the head of the modified list.

⚠️ You are swapping **values**, not the nodes themselves.

---

## 🎯 What Is Being Asked (In Simple Words)

Given a list:

```
1 → 2 → 3 → 4 → 5
k = 2
```

The 2nd node from start = `2`  
The 2nd node from end = `4`

After swapping:

```
1 → 4 → 3 → 2 → 5
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Two-pointer technique  
- Single-pass linked list traversal  
- Position-based node access  
- Efficient pointer movement  

It strengthens understanding of index-based traversal in linked lists.

---

## 🔑 Core Insight (MOST IMPORTANT)

To find the k-th node from the end:

Use the two-pointer trick:

1. Move one pointer `k` steps ahead.
2. Start another pointer from head.
3. Move both pointers together until the first pointer reaches the end.
4. The second pointer will be at the k-th node from the end.

---

# 🛠 Approach — One Pass Two Pointer Method

## 🧠 Step 1 — Find k-th Node from Start

Traverse from head `k-1` times.

Store:
```
firstKNode
```

---

## 🧠 Step 2 — Find k-th Node from End

- Start a pointer from head.
- Start another pointer from `firstKNode`.
- Move both together until the second pointer reaches the last node.
- The first pointer now points to:
```
k-th node from end
```

---

## 🧠 Step 3 — Swap Values

Swap:
```
firstKNode.val
and
secondKNode.val
```

Return head.

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(1)

Single traversal after locating first node.

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 3 → 4 → 5
k = 2
```

Step 1:
```
firstKNode = 2
```

Step 2:
Move second pointer to end:
```
secondKNode = 4
```

Step 3:
Swap values:
```
1 → 4 → 3 → 2 → 5
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Confusing swapping nodes vs swapping values  
Only swap values.

### ❌ Incorrect pointer movement  
Off-by-one errors common.

### ❌ Not handling k = 1 properly  

---

## 🧪 Edge Cases

- k = 1  
- k = length  
- Single node  
- Even length list  
- Odd length list  
- k exactly at middle  

---


## CODE
Solution added separately in a `.java` file inside this folder.
