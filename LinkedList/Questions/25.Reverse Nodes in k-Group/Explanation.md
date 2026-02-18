# 📘 LeetCode 25 — Reverse Nodes in k-Group  
**Category:** Linked List  
**Difficulty:** Hard  
**Tags:** Linked List, Recursion, Iteration, Pointer Manipulation

---

## 📝 Problem Summary

You are given the head of a singly linked list and an integer `k`.

Your task is to **reverse the nodes of the list k at a time**, and return the modified list.

### Rules:
- Reverse every group of `k` nodes.
- If the number of nodes remaining is less than `k`, leave them as they are.
- You must reverse the nodes themselves, not just the values.
- Do it in-place.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:

- Divide the list into groups of size `k`
- Reverse each group
- Connect them back properly
- Leave the last group unchanged if its size < k

Example:

Input:
```
1 → 2 → 3 → 4 → 5
k = 2
```

Output:
```
2 → 1 → 4 → 3 → 5
```

---

## 🧠 Why This Problem Is Important

This is an advanced linked list problem that combines:

- Linked list reversal (LeetCode 206)
- Group-based processing
- Careful pointer reconnection
- Recursive or iterative structuring

It is a high-level pointer manipulation problem frequently asked in interviews.

---

## 🔑 Core Insight (MOST IMPORTANT)

This problem can be broken into repeated steps:

1. Check if at least `k` nodes exist
2. Reverse the first `k` nodes
3. Recursively or iteratively process the remaining list
4. Connect the reversed group to the next part

---

# 🛠 Approach 1 — Iterative Group Reversal

## 🧠 Step 1 — Count k Nodes

Before reversing:
- Ensure at least `k` nodes exist
- If not → return head as-is

---

## 🧠 Step 2 — Reverse k Nodes

Use standard linked list reversal logic for exactly `k` nodes.

Keep track of:
- Start of group
- End of group
- Next group start

---

## 🧠 Step 3 — Reconnect

After reversing:
- Connect previous group's tail to new head of reversed group
- Connect old head (now tail) to next group

Repeat for remaining nodes.

---

## ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

Each node is visited once.

---

# 🛠 Approach 2 — Recursion (Elegant)

## 🧠 Idea

1. Check if `k` nodes exist
2. Reverse first `k` nodes
3. Recursively call function for remaining list
4. Connect reversed portion to result of recursion

---

## ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(n/k)` recursion stack

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 3 → 4 → 5
k = 3
```

Step 1:
Reverse first 3:
```
3 → 2 → 1
```

Remaining:
```
4 → 5
```

Since remaining size < 3:
Leave as-is.

Final:
```
3 → 2 → 1 → 4 → 5
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Not checking if k nodes exist  
May reverse incomplete group incorrectly.

### ❌ Losing reference to next group  
Must store next group start before reversal.

### ❌ Incorrect reconnection  
Careful linking is required.

### ❌ Forgetting to terminate final node  
Avoid cycles.

---

## 🧪 Edge Cases

- k = 1 → no change  
- k equals list length → entire list reversed  
- k greater than list length → no change  
- Empty list  
- Single node  

---



## CODE
Solution added separately in a `.java` file inside this folder.

