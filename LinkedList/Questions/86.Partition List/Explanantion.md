# 📘 LeetCode 86 — Partition List  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Two Lists, Pointer Manipulation

---

## 📝 Problem Summary

You are given the head of a singly linked list and an integer `x`.

Your task is to **partition the list** such that:

- All nodes with values **less than x** come before  
- All nodes with values **greater than or equal to x**

⚠️ Important:
- The **relative order** of nodes in each partition must be preserved.

---

## 🎯 What Is Being Asked (In Simple Words)

Rearrange the list so that:

- Smaller elements come first
- Larger or equal elements come after
- The order within each group remains the same

Example:

Input:
```
1 → 4 → 3 → 2 → 5 → 2
x = 3
```

Output:
```
1 → 2 → 2 → 4 → 3 → 5
```

Notice:
- 1, 2, 2 are before 3
- 4, 3, 5 are after
- Original order preserved inside groups

---

## 🧠 Why This Problem Is Important

This problem tests:

- Stable partitioning  
- Multiple list handling  
- Pointer reconnection  
- Order preservation  

It’s similar to the partition concept in quicksort but must remain stable.

---

## 🔑 Core Insight (MOST IMPORTANT)

Instead of rearranging nodes in place:

👉 Create two separate lists:
- One for nodes `< x`
- One for nodes `>= x`

Then connect them at the end.

This keeps the logic simple and clean.

---

# 🛠 Approach — Two Dummy Lists

## 🧠 Step-by-Step Idea

1. Create two dummy nodes:
```
smallDummy
largeDummy
```

2. Use two pointers:
```
small
large
```

3. Traverse original list:

If:
```
node.val < x
```
Add to small list

Else:
Add to large list

4. After traversal:
- Connect small list to large list
- Ensure large list ends with null

5. Return:
```
smallDummy.next
```

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(1)

No extra data structures, only pointer rearrangement.

---

## 🧩 Example Walkthrough

Input:
```
1 → 4 → 3 → 2 → 5 → 2
x = 3
```

Small list:
```
1 → 2 → 2
```

Large list:
```
4 → 3 → 5
```

Connect:
```
1 → 2 → 2 → 4 → 3 → 5
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Not preserving order  
Must append nodes, not insert at head.

### ❌ Forgetting to terminate large list  
Set `large.next = null`.

### ❌ Trying in-place swapping  
More complex and error-prone.

---

## 🧪 Edge Cases

- All nodes < x  
- All nodes ≥ x  
- Empty list  
- Single node  
- x smaller than all elements  
- x larger than all elements  

---


## CODE
Solution added separately in a `.java` file inside this folder.
