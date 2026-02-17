# 📘 LeetCode 143 — Reorder List  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Two Pointers, Reverse List

---

## 📝 Problem Summary

You are given the head of a singly linked list.

Your task is to reorder the list in the following pattern:

```
L0 → L1 → L2 → ... → Ln-1 → Ln
```

Reorder it to:

```
L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → ...
```

⚠️ You must reorder the nodes in-place without modifying node values.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:

- Take the first node
- Then the last node
- Then the second node
- Then the second last node
- Continue alternating from both ends

Example:

Input:
```
1 → 2 → 3 → 4
```

Output:
```
1 → 4 → 2 → 3
```

---

## 🧠 Why This Problem Is Important

This problem combines:

- Fast & slow pointer technique  
- Linked list reversal  
- Merging two lists  
- Careful pointer manipulation  

It is a multi-step linked list problem frequently asked in interviews.

---

## 🔑 Core Insight (MOST IMPORTANT)

This problem can be broken into 3 steps:

1. Find the middle of the list  
2. Reverse the second half  
3. Merge the two halves alternately  

---

# 🛠 Step 1 — Find the Middle

Use fast and slow pointers:

```
slow moves one step
fast moves two steps
```

When fast reaches the end:
```
slow is at the middle
```

Split the list into two halves.

---

# 🛠 Step 2 — Reverse the Second Half

Reverse the second half of the list (similar to LeetCode 206).

Example:

Before reverse:
```
1 → 2 → 3 → 4 → 5
```

After splitting:
```
1 → 2 → 3
4 → 5
```

Reverse second half:
```
5 → 4
```

---

# 🛠 Step 3 — Merge Alternately

Now merge:

First half:
```
1 → 2 → 3
```

Reversed second half:
```
5 → 4
```

Merge pattern:
```
1 → 5 → 2 → 4 → 3
```

---

## ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

Only pointer manipulation, no extra data structures.

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 3 → 4 → 5
```

Step 1:
```
Middle = 3
```

Step 2:
```
Second half reversed → 5 → 4
```

Step 3:
```
1 → 5 → 2 → 4 → 3
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting to split the list  
Must break first half from second half.

### ❌ Not reversing second half properly  
Will merge incorrectly.

### ❌ Incorrect merge order  
Must alternate exactly.

### ❌ Forgetting to terminate the list  
Last node must point to null.

---

## 🧪 Edge Cases

- Empty list  
- Single node  
- Two nodes  
- Odd number of nodes  
- Even number of nodes  

All handled naturally with proper splitting and merging.

---



## CODE 
Solution added separately in a `.java` file inside this folder.

