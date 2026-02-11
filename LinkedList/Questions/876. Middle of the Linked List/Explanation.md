# 📘 LeetCode 876 — Middle of the Linked List  
**Category:** Linked List  
**Difficulty:** Easy  
**Tags:** Linked List, Two Pointers, Fast & Slow Pointers

---

## 📝 Problem Summary

You are given the head of a singly linked list.

Your task is to return the **middle node** of the linked list.

If there are **two middle nodes** (even length list), return the **second middle node**.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Traverse a linked list
- Find its middle node
- If the list has even length, return the second middle

Example:
```
Input: 1 → 2 → 3 → 4 → 5
Output: Node with value 3
```

```
Input: 1 → 2 → 3 → 4 → 5 → 6
Output: Node with value 4
```

---

## 🧠 Why This Problem Is Important

This is a **classic fast and slow pointer problem**.

It teaches:
- Pointer movement strategies  
- Efficient linked list traversal  
- Avoiding extra space  

This pattern is widely used in:
- Cycle detection  
- Palindrome linked list  
- Merge sort on linked list  

---

## 🔑 Core Insight (MOST IMPORTANT)

Use **two pointers**:

- `slow` moves one step at a time  
- `fast` moves two steps at a time  

When `fast` reaches the end:
```
slow will be at the middle
```

---

## ⭐ Pattern Recognition

You should think of this pattern when you see:
- “Find middle of linked list”
- “Single pass solution”
- “Two pointer technique”

👉 This is the **Fast & Slow Pointer template**.

---

# 🛠 Approach 1 — Fast & Slow Pointer (Optimal)

## 🧠 Idea

1. Initialize:
   ```
   slow = head
   fast = head
   ```
2. Move:
   - `slow = slow.next`
   - `fast = fast.next.next`
3. Stop when:
   - `fast == null` OR `fast.next == null`
4. Return `slow`

---

## 🧩 Why This Works

- Fast pointer moves twice as fast
- When fast finishes the list
- Slow has covered half the distance

Thus, slow is at the middle.

---

## ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

Single pass, no extra memory.

---

# 🛠 Approach 2 — Count Length First

## 🧠 Idea

1. Traverse list and count nodes
2. Traverse again until `length / 2`
3. Return that node

---

## ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`
- Requires two passes (less optimal)

---

## 🧩 Example Walkthrough

### Input:
```
1 → 2 → 3 → 4 → 5
```

Steps:
```
slow=1, fast=1
slow=2, fast=3
slow=3, fast=5
fast.next = null → stop
```

Return:
```
3
```

---

### Even Length Example:
```
1 → 2 → 3 → 4 → 5 → 6
```

Steps:
```
slow=1, fast=1
slow=2, fast=3
slow=3, fast=5
slow=4, fast=null
```

Return:
```
4
```

(Second middle node)

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Incorrect loop condition  
Must check `fast != null && fast.next != null`

### ❌ Returning first middle instead of second  
Problem requires second middle for even length.

### ❌ Using extra space  
Not required.

---

## 🧪 Edge Cases

- Empty list  
- Single node list  
- Two-node list  
- Large linked list  

All handled naturally by fast & slow pointers.

---

## CODE
Solution separately in a `.java` file inside this folder.

