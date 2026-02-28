# 📘 LeetCode 2095 — Delete the Middle Node of a Linked List  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Fast & Slow Pointers, Two Pointers

---

## 📝 Problem Summary

You are given the head of a singly linked list.

Your task is to **delete the middle node** and return the head of the modified list.

### Definition of Middle:
If the list has `n` nodes (0-based indexing),  
the middle node is at index:

```
⌊ n / 2 ⌋
```

---

## 🎯 What Is Being Asked (In Simple Words)

Remove the middle node from the list.

Example 1:

Input:
```
1 → 3 → 4 → 7 → 1 → 2 → 6
```

Length = 7  
Middle index = 7 / 2 = 3  

Remove node with value `7`

Output:
```
1 → 3 → 4 → 1 → 2 → 6
```

---

Example 2:

Input:
```
1 → 2 → 3 → 4
```

Length = 4  
Middle index = 4 / 2 = 2  

Remove node with value `3`

Output:
```
1 → 2 → 4
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Fast & slow pointer usage  
- Deleting a node with access to head  
- Edge case handling  
- Index calculation logic  

It is similar to LeetCode 876 (Find Middle), but here we must delete it.

---

## 🔑 Core Insight (MOST IMPORTANT)

To delete the middle node efficiently:

Use the **Fast & Slow pointer technique**.

- Slow moves 1 step
- Fast moves 2 steps
- When fast reaches end
- Slow is at the middle

To delete, we also need:
- A pointer to the node before slow

---

# 🛠 Approach — Fast & Slow Pointer

## 🧠 Step-by-Step Idea

1. Handle edge case:
   - If only one node → return null  

2. Initialize:
```
slow = head
fast = head
prev = null
```

3. Move:
```
prev = slow
slow = slow.next
fast = fast.next.next
```

4. When loop ends:
```
slow → middle node
prev → node before middle
```

5. Delete:
```
prev.next = slow.next
```

Return head.

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(1)

Single traversal.

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 3 → 4 → 5
```

Movement:

```
slow=1 fast=1
slow=2 fast=3
slow=3 fast=5
```

Now:
```
slow = 3 (middle)
prev = 2
```

Delete:
```
2.next = 4
```

Result:
```
1 → 2 → 4 → 5
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Not handling single-node list  
Must return null.

### ❌ Forgetting prev pointer  
Cannot delete without it.

### ❌ Off-by-one errors  
Make sure definition matches ⌊ n / 2 ⌋.

---

## 🧪 Edge Cases

- Single node  
- Two nodes  
- Even length list  
- Odd length list  
- Large list  

---



## CODE
Solution added separately in a `.java` file inside this folder.
