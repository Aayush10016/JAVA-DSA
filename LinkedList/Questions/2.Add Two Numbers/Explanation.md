# 📘 LeetCode 2 — Add Two Numbers  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Math, Carry Handling

---

## 📝 Problem Summary

You are given two non-empty linked lists representing two non-negative integers.

- The digits are stored in **reverse order**.
- Each node contains a single digit.
- Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero.

---

## 🎯 What Is Being Asked (In Simple Words)

Each linked list represents a number like this:

```
2 → 4 → 3
```

Represents:
```
342
```

Because digits are in reverse order.

If:

```
l1 = 2 → 4 → 3   (342)
l2 = 5 → 6 → 4   (465)
```

Then:

```
342 + 465 = 807
```

Return:
```
7 → 0 → 8
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Linked list traversal  
- Carry handling  
- Digit-by-digit addition  
- Creating a new linked list  

It is one of the most famous linked list problems.

---

## 🔑 Core Insight (MOST IMPORTANT)

Since digits are stored in reverse order:

You can directly simulate manual addition:

```
sum = digit1 + digit2 + carry
```

Then:
```
newDigit = sum % 10
carry = sum / 10
```

Continue until both lists end and carry becomes 0.

---

# 🛠 Approach — Iterative Addition with Carry

## 🧠 Step-by-Step Idea

1. Create a dummy node:
```
dummy → null
```

2. Use pointer `current` to build result list.

3. Initialize:
```
carry = 0
```

4. While:
```
l1 != null OR l2 != null OR carry != 0
```

- Extract values (0 if null)
- Compute sum
- Create new node with `sum % 10`
- Update carry

5. Move pointers forward.

6. Return:
```
dummy.next
```

---

## ⏱ Complexity

- **Time:** O(max(n, m))  
- **Space:** O(max(n, m)) (for result list)

---

## 🧩 Example Walkthrough

Input:
```
l1: 2 → 4 → 3
l2: 5 → 6 → 4
```

Step 1:
```
2 + 5 = 7
carry = 0
```

Step 2:
```
4 + 6 = 10
digit = 0
carry = 1
```

Step 3:
```
3 + 4 + 1 = 8
carry = 0
```

Final:
```
7 → 0 → 8
```

---

## 🧩 Example with Extra Carry

Input:
```
9 → 9
9 → 9
```

Step 1:
```
9 + 9 = 18 → digit 8, carry 1
```

Step 2:
```
9 + 9 + 1 = 19 → digit 9, carry 1
```

Step 3:
```
carry 1 remains
```

Final:
```
8 → 9 → 1
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting final carry  
Must check carry after loop.

### ❌ Not handling unequal lengths  
Use 0 when list ends.

### ❌ Incorrect pointer movement  

---

## 🧪 Edge Cases

- Different length lists  
- One list is null  
- Large carry chain  
- Single digit addition  

---


## CODE

Solution added separately in a `.java` file inside this folder.
