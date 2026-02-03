# 📘 LeetCode 83 — Remove Duplicates from Sorted List  
**Category:** Linked List  
**Difficulty:** Easy  
**Tags:** Linked List, Two Pointers

---

## 📝 Problem Summary

You are given the head of a **sorted linked list**.

Your task is to **delete all duplicates** such that each element appears only once.

Return the head of the modified linked list.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Traverse a sorted linked list
- Remove nodes that have the same value as the previous node
- Keep only one occurrence of each value

Because the list is **sorted**, duplicates will always be adjacent.

---

## 🧠 Why This Problem Is Important

This is a fundamental linked list problem that tests:
- Pointer manipulation
- Traversing linked lists
- Understanding how sorted property simplifies logic

---

## 🔑 Core Insight (MOST IMPORTANT)

Since the linked list is **sorted**:

```
Duplicate values will always be next to each other
```

So you only need to compare:
```
current node and current.next node
```

---

## ⭐ Pattern Recognition

You should think of this pattern when you see:
- Sorted linked list
- Remove duplicates
- In-place modification

👉 This is a **single pointer traversal problem**.

---

# 🛠 Approach — Single Pointer Traversal

## 🧠 Idea

1. Start from the head
2. While the current node and next node exist:
   - If values are same → skip the next node
   - Else → move to next node

This removes duplicates without extra space.

---

## 🧩 Thought Process

At each step:
```
if current.val == current.next.val:
    current.next = current.next.next
else:
    current = current.next
```

This keeps only one copy of each value.

---

## ⏱ Complexity

- **Time:** `O(n)` (traverse once)
- **Space:** `O(1)` (in-place)

---

## 🧩 Example Walkthrough

### Input:
```
1 → 1 → 2 → 3 → 3
```

Steps:
```
Compare 1 and 1 → remove duplicate
List: 1 → 2 → 3 → 3

Compare 1 and 2 → move forward
Compare 2 and 3 → move forward
Compare 3 and 3 → remove duplicate
```

Output:
```
1 → 2 → 3
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Moving pointer even after deleting  
You must stay on the same node after deletion.

### ❌ Using extra data structures  
Not needed because list is sorted.

### ❌ Not checking current.next  
Can cause null pointer errors.

---

## 🧪 Edge Cases

- Empty list  
- Single node list  
- All nodes are duplicates  
- No duplicates at all  

All handled naturally by the same logic.

---

## CODE
Solution added separately in a `.java` file inside this folder.

