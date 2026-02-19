# 📘 LeetCode 61 — Rotate List  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Two Pointers, Circular List

---

## 📝 Problem Summary

You are given the head of a singly linked list and an integer `k`.

Your task is to **rotate the list to the right by k places** and return the new head.

---

## 🎯 What Is Being Asked (In Simple Words)

Rotate the list to the right.

Example:

Input:
```
1 → 2 → 3 → 4 → 5
k = 2
```

Output:
```
4 → 5 → 1 → 2 → 3
```

Meaning:
- The last 2 nodes move to the front.

---

## 🧠 Why This Problem Is Important

This problem tests:

- Linked list traversal
- Length calculation
- Circular linking
- Careful pointer breaking

It strengthens understanding of list restructuring.

---

## 🔑 Core Insight (MOST IMPORTANT)

Instead of rotating one by one:

1. Compute the length of the list
2. Connect tail to head (make it circular)
3. Find new tail position
4. Break the circle

This makes the solution efficient.

---

# 🛠 Step-by-Step Approach

## 🧠 Step 1 — Handle Edge Cases

If:
- head is null  
- head.next is null  
- k == 0  

Return head.

---

## 🧠 Step 2 — Find Length and Tail

Traverse list to:
- Count nodes → `length`
- Reach last node → `tail`

---

## 🧠 Step 3 — Optimize k

Since rotating length times gives same list:

```
k = k % length
```

If k becomes 0 → return head.

---

## 🧠 Step 4 — Make List Circular

```
tail.next = head
```

Now the list forms a loop.

---

## 🧠 Step 5 — Find New Tail

New tail position:

```
length - k - 1
```

Traverse to this position.

---

## 🧠 Step 6 — Break the Circle

New head:
```
newTail.next
```

Then:
```
newTail.next = null
```

Return new head.

---

## ⏱ Complexity

- **Time:** O(n)
- **Space:** O(1)

Only one traversal required.

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 3 → 4 → 5
k = 2
```

Length:
```
5
```

k:
```
2 % 5 = 2
```

New tail position:
```
5 - 2 - 1 = 2
```

New tail:
```
3
```

New head:
```
4
```

Final:
```
4 → 5 → 1 → 2 → 3
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Not reducing k using modulo  
Leads to unnecessary rotations.

### ❌ Forgetting to break circular link  
Causes infinite loop.

### ❌ Off-by-one errors in new tail position  

### ❌ Not handling empty list  

---

## 🧪 Edge Cases

- k = 0  
- k multiple of length  
- Single node  
- Empty list  
- Large k  

---


## CODE
Solution added separately in a `.java` file inside this folder.

