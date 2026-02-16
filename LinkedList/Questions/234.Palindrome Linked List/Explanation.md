# 📘 LeetCode 234 — Palindrome Linked List  
**Category:** Linked List  
**Difficulty:** Easy  
**Tags:** Linked List, Two Pointers, Fast & Slow Pointers

---

## 📝 Problem Summary

You are given the head of a singly linked list.

Your task is to determine whether the linked list is a **palindrome**.

A palindrome means the list reads the same forward and backward.

Return:
- `true` if it is a palindrome  
- `false` otherwise  

---

## 🎯 What Is Being Asked (In Simple Words)

You must check whether:

```
1 → 2 → 3 → 2 → 1   → true
1 → 2 → 3 → 4       → false
```

The sequence of node values must be symmetric.

---

## 🧠 Why This Problem Is Important

This problem tests:

- Fast & slow pointer usage  
- Linked list reversal  
- Comparing two halves of a list  
- In-place space optimization  

It combines multiple linked list techniques in one problem.

---

## 🔑 Core Insight (MOST IMPORTANT)

To check palindrome in O(1) space:

1. Find the middle of the list  
2. Reverse the second half  
3. Compare first half and reversed second half  

If all corresponding nodes match → palindrome.

---

# 🛠 Approach — Fast & Slow Pointer + Reverse Second Half

## 🧠 Step 1 — Find the Middle

Use:
```
slow = head
fast = head
```

Move:
```
slow = slow.next
fast = fast.next.next
```

When fast reaches end:
```
slow is at middle
```

---

## 🧠 Step 2 — Reverse Second Half

Reverse the list starting from `slow`.

Now you have:
- First half (normal order)
- Second half (reversed order)

---

## 🧠 Step 3 — Compare Both Halves

Use two pointers:
- One from head
- One from reversed half

Compare node values one by one.

If mismatch → return false  
If all match → return true

---

## 🧠 (Optional) Step 4 — Restore List

Reverse the second half again if you want to restore original structure.

---

## ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

Single traversal + in-place reversal.

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 2 → 1
```

Step 1:
```
Middle at second 2
```

Step 2:
Reverse second half:
```
1 → 2
```

Step 3:
Compare:
```
1 == 1
2 == 2
```

Result:
```
true
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Not handling odd-length lists properly  
Middle element can be ignored.

### ❌ Forgetting to reverse second half  
Cannot compare directly without reversal.

### ❌ Losing list connection while reversing  
Must carefully manage pointers.

---

## 🧪 Edge Cases

- Empty list  
- Single node  
- Two nodes  
- Odd length list  
- Even length list  

All handled with fast & slow pointer logic.

---



## CODE
Solution added separately in a `.java` file inside this folder.

