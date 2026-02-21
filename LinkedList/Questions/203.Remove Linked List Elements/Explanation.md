# 📘 LeetCode 203 — Remove Linked List Elements  
**Category:** Linked List  
**Difficulty:** Easy  
**Tags:** Linked List, Pointer Manipulation, Iteration, Recursion

---

## 📝 Problem Summary

You are given the head of a singly linked list and an integer `val`.

Your task is to **remove all nodes of the linked list that have value equal to `val`**, and return the new head.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:

- Traverse the linked list  
- Delete every node whose value equals `val`  
- Return the updated list  

Example:

Input:
```
1 → 2 → 6 → 3 → 4 → 5 → 6
val = 6
```

Output:
```
1 → 2 → 3 → 4 → 5
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Basic linked list traversal  
- Safe node deletion  
- Handling edge cases at the head  
- Clean pointer updates  

It strengthens core linked list fundamentals.

---

## 🔑 Core Insight (MOST IMPORTANT)

When removing nodes in a linked list:

You must carefully handle:
- Deleting the head node  
- Deleting multiple consecutive nodes  
- Maintaining correct connections  

Using a **dummy node** simplifies handling head removal.

---

# 🛠 Approach 1 — Iterative Using Dummy Node (Recommended)

## 🧠 Step-by-Step Idea

1. Create a dummy node:
```
dummy → head
```

2. Use a pointer:
```
current = dummy
```

3. Traverse while:
```
current.next != null
```

4. If:
```
current.next.val == val
```

Remove it:
```
current.next = current.next.next
```

Else:
```
move current forward
```

5. Return:
```
dummy.next
```

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(1)  

Single traversal, constant extra space.

---

# 🛠 Approach 2 — Recursion (Elegant)

## 🧠 Idea

Recursive logic:

1. Base case:
   - If head is null → return null  

2. Recursively process:
   ```
   head.next = remove(head.next)
   ```

3. If:
   ```
   head.val == val
   ```
   Return:
   ```
   head.next
   ```
   Else:
   ```
   return head
   ```

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(n) (recursion stack)

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 6 → 3
val = 6
```

Traversal:
```
1 → keep
2 → keep
6 → remove
3 → keep
```

Final:
```
1 → 2 → 3
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Not handling head removal  
If head itself equals val.

### ❌ Skipping pointer movement incorrectly  
Only move pointer when not deleting.

### ❌ Losing reference to next node  

### ❌ Not using dummy node  
Makes head removal messy.

---

## 🧪 Edge Cases

- Empty list  
- All nodes equal to val  
- No nodes equal to val  
- Single node list  



---

## CODE

Solution added separately in a `.java` file inside this folder.
