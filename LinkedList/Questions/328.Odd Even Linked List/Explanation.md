# 📘 LeetCode 328 — Odd Even Linked List  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Two Pointers, Pointer Manipulation

---

## 📝 Problem Summary

You are given the head of a singly linked list.

Your task is to **group all the nodes with odd indices together followed by the nodes with even indices**, and return the reordered list.

⚠️ Important:
- The relative order of nodes within the odd and even groups must remain the same.
- The node index starts from **1** (not 0).

---

## 🎯 What Is Being Asked (In Simple Words)

Rearrange the list so that:

- All nodes at **odd positions** come first  
- All nodes at **even positions** come after  

Example:

Input:
```
1 → 2 → 3 → 4 → 5
```

Output:
```
1 → 3 → 5 → 2 → 4
```

Odd positions:
```
1, 3, 5
```

Even positions:
```
2, 4
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Pointer manipulation  
- Linked list restructuring  
- Maintaining order while rearranging  
- Efficient in-place modifications  

It is a very common linked list pattern problem.

---

## 🔑 Core Insight (MOST IMPORTANT)

Instead of rearranging nodes randomly:

Maintain **two chains**:

```
Odd list
Even list
```

Traverse the list and link odd nodes together and even nodes together.

At the end, attach the even list after the odd list.

---

# 🛠 Approach — Two Pointer Method

## 🧠 Step-by-Step Idea

1. Handle edge cases:
   - If list has 0 or 1 node → return head.

2. Initialize:

```
odd = head
even = head.next
evenHead = even
```

3. Traverse the list while even and even.next exist.

4. Update links:

```
odd.next = even.next
odd = odd.next

even.next = odd.next
even = even.next
```

5. Connect odd list to even list:

```
odd.next = evenHead
```

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(1)

Only pointer manipulation is used.

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 3 → 4 → 5
```

Initial:
```
odd = 1
even = 2
evenHead = 2
```

Step 1:
```
odd.next = 3
odd = 3

even.next = 4
even = 4
```

Step 2:
```
odd.next = 5
odd = 5

even.next = null
```

Finally connect:

```
5 → 2
```

Result:

```
1 → 3 → 5 → 2 → 4
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Mixing up node values with node indices  
This problem is about **positions**, not values.

### ❌ Losing evenHead reference  
Needed to reconnect lists.

### ❌ Incorrect pointer updates  

---

## 🧪 Edge Cases

- Empty list  
- Single node  
- Two nodes  
- Odd number of nodes  
- Even number of nodes  

---



## CODE
Solution added separately in a `.java` file inside this folder.
