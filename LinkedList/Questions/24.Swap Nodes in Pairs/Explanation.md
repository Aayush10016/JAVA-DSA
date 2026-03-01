# 📘 LeetCode 24 — Swap Nodes in Pairs  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Recursion, Iteration, Pointer Manipulation

---

## 📝 Problem Summary

You are given the head of a singly linked list.

Your task is to **swap every two adjacent nodes** and return the modified list.

⚠️ Important:
- You must swap the **nodes themselves**, not just their values.
- If the list has an odd number of nodes, the last node remains unchanged.

---

## 🎯 What Is Being Asked (In Simple Words)

Given:

```
1 → 2 → 3 → 4
```

You must return:

```
2 → 1 → 4 → 3
```

Swap:
- (1,2)
- (3,4)

If input is:

```
1 → 2 → 3
```

Output:

```
2 → 1 → 3
```

Last node remains as it is.

---

## 🧠 Why This Problem Is Important

This problem tests:

- Pointer manipulation  
- Linked list restructuring  
- Handling pairs carefully  
- Recursion logic  

It builds strong fundamentals for more advanced linked list problems.

---

## 🔑 Core Insight (MOST IMPORTANT)

For every pair:

Before:
```
prev → first → second → nextPair
```

After swap:
```
prev → second → first → nextPair
```

You must:
- Store references carefully
- Update links in correct order
- Move forward to next pair

---

# 🛠 Approach 1 — Iterative (Using Dummy Node)

## 🧠 Step-by-Step Idea

1. Create dummy node:
```
dummy → head
```

2. Use pointer:
```
prev = dummy
```

3. While:
```
prev.next != null AND prev.next.next != null
```

4. Identify:
```
first = prev.next
second = first.next
```

5. Perform swap:
```
first.next = second.next
second.next = first
prev.next = second
```

6. Move:
```
prev = first
```

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(1)

Single traversal.

---

# 🛠 Approach 2 — Recursion

## 🧠 Idea

Base Case:
- If head is null or head.next is null → return head  

Recursive Step:
- Let first = head
- Let second = head.next
- Recursively swap from second.next
- Connect:
```
second.next = first
first.next = recursive_result
```
- Return second

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(n) recursion stack  

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 3 → 4
```

Step 1:
Swap 1 & 2
```
2 → 1
```

Step 2:
Swap 3 & 4
```
4 → 3
```

Final:
```
2 → 1 → 4 → 3
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Losing nextPair reference  
Always store before swapping.

### ❌ Forgetting dummy node  
Makes head swapping complex.

### ❌ Swapping values instead of nodes  

### ❌ Incorrect pointer update order  

---

## 🧪 Edge Cases

- Empty list  
- Single node  
- Two nodes  
- Odd number of nodes  
- Large list  

---



## CODE
Code added Separately in a `.java` file inside this folder.
