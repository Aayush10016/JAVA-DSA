# 📘 LeetCode 148 — Sort List  
**Category:** Linked List / Divide and Conquer  
**Difficulty:** Medium  
**Tags:** Linked List, Merge Sort, Recursion

---

## 📝 Problem Summary

You are given the head of a linked list.

Your task is to **sort the linked list in ascending order** and return the sorted list.

⚠️ The problem requires:
- Time Complexity: `O(n log n)`
- Space Complexity: `O(1)` (if possible)

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Take an unsorted linked list
- Rearrange the nodes
- Return a sorted linked list

You cannot simply copy values into an array and sort — the intended solution works directly on the linked list.

---

## 🧠 Why This Problem Is Important

This problem tests:
- Linked list manipulation
- Divide and conquer thinking
- Merge sort understanding
- Fast & slow pointer technique

It is essentially asking you to implement **Merge Sort on a Linked List**.

---

## 🔑 Core Insight (MOST IMPORTANT)

Unlike arrays:
- Linked lists do NOT support random access.
- So Quick Sort is inefficient.

👉 The best sorting algorithm for linked lists is **Merge Sort**.

Why?
- Merge sort naturally works with linked lists.
- It doesn’t require random access.
- It guarantees `O(n log n)` time.

---

# 🛠 Approach — Merge Sort on Linked List (Recursive)

Merge Sort consists of 3 main steps:

1. **Divide** the list into two halves  
2. **Recursively sort** both halves  
3. **Merge** the sorted halves  

---

## 🧩 Step 1 — Find the Middle

Use the **Fast & Slow pointer technique**:

- Slow moves one step
- Fast moves two steps
- When fast reaches the end, slow is at the middle

Then:
- Break the list into two halves

---

## 🧩 Step 2 — Recursively Sort Both Halves

Call sort function on:
- Left half
- Right half

This continues dividing until:
- Base case: list has 0 or 1 node (already sorted)

---

## 🧩 Step 3 — Merge Two Sorted Lists

Use the same logic as **LeetCode 21 (Merge Two Sorted Lists)**:

- Compare nodes from both halves
- Always pick the smaller node
- Build merged sorted list

---

## ⏱ Complexity

### Time Complexity:
```
O(n log n)
```
- Each level splits the list
- There are log n levels
- Each level processes all nodes once

### Space Complexity:
```
O(log n)
```
- Due to recursion stack
- No extra array is used

---

## 🧩 Example Walkthrough

### Input:
```
4 → 2 → 1 → 3
```

### Step 1 — Split:
```
4 → 2     and     1 → 3
```

### Step 2 — Split further:
```
4   2     1   3
```

### Step 3 — Merge:
```
2 → 4
1 → 3
```

Final merge:
```
1 → 2 → 3 → 4
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting to break the list into two halves  
Leads to infinite recursion.

### ❌ Incorrect middle finding  
Must carefully manage pointers.

### ❌ Using extra array to sort  
Violates space constraint.

### ❌ Not handling base case properly  
If head is null or single node → return head.

---

## 🧪 Edge Cases

- Empty list  
- Single node  
- Already sorted list  
- Reverse sorted list  
- List with duplicate values  

---


## CODE
Solution added separately in a `.java` file inside this folder.

