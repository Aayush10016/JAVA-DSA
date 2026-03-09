# 📘 LeetCode 232 — Implement Queue using Stacks  
**Category:** Stack / Queue Design  
**Difficulty:** Easy  
**Tags:** Stack, Queue, Design, Data Structures

---

## 📝 Problem Summary

Implement a **first-in-first-out (FIFO) queue** using only **two stacks**.

Your implemented queue should support the following operations:

- `push(x)` → Push element `x` to the back of queue  
- `pop()` → Removes the element from the front of queue  
- `peek()` → Returns the front element  
- `empty()` → Returns whether the queue is empty  

⚠️ You may only use standard stack operations:
```
push
pop
peek/top
size
isEmpty
```

---

## 🎯 What Is Being Asked (In Simple Words)

Queues work like this:

```
First In → First Out
```

Example:

```
push(1)
push(2)
push(3)

Queue: 1 → 2 → 3

pop() → 1
peek() → 2
```

But you are **not allowed to use a queue**.

Instead, you must build it using **two stacks**.

---

## 🧠 Why This Problem Is Important

This problem tests:

- Understanding of **stack vs queue behavior**
- Data structure simulation
- Smart use of multiple stacks
- Efficient design patterns

It is a classic data structure interview question.

---

## 🔑 Core Insight (MOST IMPORTANT)

Stacks are **LIFO**:

```
Last In → First Out
```

Queues are **FIFO**:

```
First In → First Out
```

To convert stack behavior into queue behavior:

Use **two stacks**.

One stack reverses the order of elements.

---

# 🛠 Approach 1 — Two Stacks (Push Costly)

Use:

```
stack1 → main stack
stack2 → temporary stack
```

### Push Operation

Steps:

1. Move all elements from stack1 → stack2
2. Push new element to stack1
3. Move elements back from stack2 → stack1

Now stack1 behaves like a queue.

---

## ⏱ Complexity

| Operation | Time |
|----------|------|
| push | O(n) |
| pop | O(1) |
| peek | O(1) |

---

# 🛠 Approach 2 — Two Stacks (Amortized Efficient)

Use two stacks:

```
inStack
outStack
```

### Push

```
Push element into inStack
```

### Pop / Peek

If `outStack` is empty:

Move all elements from `inStack` → `outStack`

This reverses order so queue behavior appears.

---

## ⏱ Complexity

| Operation | Time |
|----------|------|
| push | O(1) |
| pop | O(1) amortized |
| peek | O(1) amortized |

This is the **optimal solution**.

---

## 🧩 Example Walkthrough

Operations:

```
push(1)
push(2)
push(3)
```

Stacks:

```
inStack = [1,2,3]
outStack = []
```

First `pop()`:

Move elements:

```
outStack = [3,2,1]
```

Then:

```
pop() → 1
```

Queue behavior achieved.

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Always transferring elements
Only transfer when `outStack` is empty.

### ❌ Mixing push direction
Push always goes into `inStack`.

### ❌ Forgetting empty() condition

---

## 🧪 Edge Cases

- Empty queue  
- Single element  
- Multiple pops after pushes  

---


## CODE
Solution added separately in a `.java` file inside this folder.
