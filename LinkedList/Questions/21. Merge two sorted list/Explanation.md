# 📘 LeetCode 21 — Merge Two Sorted Lists  
**Category:** Linked List  
**Difficulty:** Easy  
**Tags:** Linked List, Two Pointers, Recursion

---

## 📝 Problem Summary

You are given the heads of two **sorted linked lists** `list1` and `list2`.

Your task is to **merge both lists into one sorted linked list** and return its head.

The new list must be made by **splicing together the nodes** of the first two lists.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Compare nodes from both lists
- Always pick the smaller value
- Connect nodes to form one sorted list

This is similar to the **merge step of merge sort**.

---

## 🧠 Why This Problem Is Important

This is one of the **most fundamental linked list problems**.

It teaches:
- Pointer manipulation
- Sorted list merging
- Recursion thinking
- Two-pointer traversal

---

## 🔑 Core Insight (MOST IMPORTANT)

Because both lists are **already sorted**:

```
The smallest element at any time will be either
the current node of list1 or list2
```

So you only need to compare the two current nodes.

---

## ⭐ Pattern Recognition

You should think of this pattern when you see:
- Two sorted lists
- Merge into one sorted list
- Similar to merge sort

👉 This is a **Two Pointer + Linked List** problem.

---

# 🛠 Approach 1 — Iterative (Two Pointers)

## 🧠 Idea

1. Create a dummy node to start the merged list
2. Use a pointer `temp` to build the result
3. Compare current nodes of both lists:
   - Attach the smaller one to `temp`
   - Move that list’s pointer forward
4. Move `temp` forward
5. After one list finishes, attach the remaining nodes of the other list

---

## 🧩 Thought Process

At each step:
```
if list1.val < list2.val:
    attach list1
    move list1
else:
    attach list2
    move list2
```

---

## ⏱ Complexity

- **Time:** `O(n + m)`  
- **Space:** `O(1)` (in-place, no extra nodes)

---

# 🛠 Approach 2 — Recursion (Elegant)

## 🧠 Idea

We can solve this recursively:

- If one list is empty → return the other list
- Compare heads of both lists
- The smaller node becomes part of the result
- Recursively merge the rest

This naturally builds the merged list.

---

## ⏱ Complexity

- **Time:** `O(n + m)`  
- **Space:** `O(n + m)` recursion stack

---

## 🧩 Example Walkthrough

### Input:
```
list1: 1 → 2 → 4
list2: 1 → 3 → 4
```

Steps:
```
Pick 1 (from list1)
Pick 1 (from list2)
Pick 2
Pick 3
Pick 4
Pick 4
```

Output:
```
1 → 1 → 2 → 3 → 4 → 4
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting to attach remaining nodes  
One list may still have elements.

### ❌ Not using dummy node in iterative method  
Makes handling head complicated.

### ❌ Creating new nodes instead of reusing  
Problem asks to splice existing nodes.

---

## 🧪 Edge Cases

- One list is empty  
- Both lists are empty  
- Lists of different sizes  
- All elements of one list smaller than the other  

---


## CODE

Solution added separately in a `.java` file inside this folder.

