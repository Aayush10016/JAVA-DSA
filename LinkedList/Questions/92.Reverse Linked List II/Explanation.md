# 📘 LeetCode 92 — Reverse Linked List II  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Two Pointers, In-place Reversal

---

## 📝 Problem Summary

You are given the head of a singly linked list and two integers `left` and `right`  
(where `1 ≤ left ≤ right ≤ n`).

Your task is to **reverse the nodes of the list from position `left` to position `right`**,  
and return the modified list.

⚠️ You must reverse the sublist **in-place**.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Keep the first part of the list unchanged
- Reverse only the portion between `left` and `right`
- Keep the remaining part unchanged
- Reconnect everything properly

Example:

Input:
```
1 → 2 → 3 → 4 → 5
left = 2, right = 4
```

Output:
```
1 → 4 → 3 → 2 → 5
```

---

## 🧠 Why This Problem Is Important

This problem tests:
- Advanced pointer manipulation
- Sublist reversal
- Careful reconnection of nodes
- Handling edge cases

It builds directly on **LeetCode 206 (Reverse Linked List)**.

---

## 🔑 Core Insight (MOST IMPORTANT)

You must:
1. Reach the node just before position `left`
2. Reverse nodes between `left` and `right`
3. Reconnect the reversed portion back to the main list

This is a **partial linked list reversal problem**.

---

# 🛠 Approach — Iterative Sublist Reversal

## 🧠 Step-by-Step Idea

### Step 1 — Use a Dummy Node

Create a dummy node pointing to head to simplify edge cases  
(especially when `left = 1`).

---

### Step 2 — Move to Node Before `left`

Use a pointer (`prev`) to move:
```
prev → node just before position left
```

---

### Step 3 — Reverse the Sublist

Let:
```
current = prev.next
```

Reverse nodes from `left` to `right` using the standard reversal logic  
(similar to LeetCode 206 but limited to this range).

---

### Step 4 — Reconnect the List

Reconnect:
- The node before `left` to the new head of reversed sublist
- The original `left` node (now tail) to the node after `right`

---

## ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

Only one traversal is needed.

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 3 → 4 → 5
left = 2, right = 4
```

Step 1:
```
prev = 1
```

Step 2:
Reverse:
```
2 → 3 → 4
```

Becomes:
```
4 → 3 → 2
```

Step 3:
Reconnect:
```
1 → 4 → 3 → 2 → 5
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Not using dummy node  
Causes issues when `left = 1`.

### ❌ Losing connection to remainder of list  
Must store `right.next`.

### ❌ Incorrect pointer updates  
Careful management is required.

### ❌ Off-by-one errors  
Positions are 1-based indexing.

---

## 🧪 Edge Cases

- `left = right` (no change)
- Reversal starts at head
- Reversal ends at last node
- Single-node list
- Entire list reversed

---


## CODE
Solution added separately in a `.java` file inside this folder.

