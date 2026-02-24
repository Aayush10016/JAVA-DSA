# 📘 LeetCode 707 — Design Linked List  
**Category:** Linked List (Design)  
**Difficulty:** Medium  
**Tags:** Linked List, Data Structure Design, Implementation

---

## 📝 Problem Summary

Design a linked list that supports the following operations:

- `get(index)` → Get value at index  
- `addAtHead(val)` → Insert at beginning  
- `addAtTail(val)` → Insert at end  
- `addAtIndex(index, val)` → Insert before index  
- `deleteAtIndex(index)` → Delete node at index  

You must implement your own linked list class.

---

## 🎯 What Is Being Asked (In Simple Words)

You are required to **build a linked list from scratch** without using built-in LinkedList classes.

You must handle:
- Index-based access
- Insertions
- Deletions
- Edge cases

---

## 🧠 Why This Problem Is Important

This problem tests:

- Understanding of linked list structure  
- Pointer manipulation  
- Edge case handling  
- Class design  
- Data structure fundamentals  

It checks whether you truly understand how linked lists work internally.

---

## 🔑 Core Insight (MOST IMPORTANT)

To design a clean solution:

1. Maintain:
   - A `head` pointer
   - Optionally a `size` variable  

2. For easier edge-case handling:
   - Use a **dummy node** (recommended)

3. Carefully handle:
   - Index bounds
   - Insertions at head/tail
   - Deletion at head

---

# 🛠 Design Strategy

## 🧠 Data Members

Typical implementation includes:

- `Node head`
- `int size`

Node class contains:
- `int val`
- `Node next`

---

# 🛠 Operation Breakdown

---

## 1️⃣ get(index)

### Logic:
- If index invalid → return -1
- Traverse from head to index
- Return value

Time: O(n)

---

## 2️⃣ addAtHead(val)

### Logic:
- Create new node
- Point new node to current head
- Update head
- Increment size

Time: O(1)

---

## 3️⃣ addAtTail(val)

### Logic:
- Traverse to last node
- Attach new node
- Increment size

Time: O(n)

(If tail pointer maintained → O(1))

---

## 4️⃣ addAtIndex(index, val)

### Rules:
- If index == size → add at tail
- If index == 0 → add at head
- If index > size → do nothing
- Otherwise:
  - Traverse to node before index
  - Insert node
  - Update size

Time: O(n)

---

## 5️⃣ deleteAtIndex(index)

### Logic:
- If index invalid → do nothing
- If index == 0 → move head
- Otherwise:
  - Traverse to node before index
  - Skip node
  - Update size

Time: O(n)

---

## ⏱ Overall Complexity

| Operation        | Time Complexity |
|------------------|----------------|
| get              | O(n)           |
| addAtHead        | O(1)           |
| addAtTail        | O(n)           |
| addAtIndex       | O(n)           |
| deleteAtIndex    | O(n)           |

---

## 🧩 Example Walkthrough

Operations:
```
addAtHead(1)
addAtTail(3)
addAtIndex(1,2)
get(1)
deleteAtIndex(1)
get(1)
```

Execution:

```
1
1 → 3
1 → 2 → 3
get(1) = 2
1 → 3
get(1) = 3
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Not checking index bounds  
Must ensure:
```
0 ≤ index < size
```

### ❌ Forgetting to update size  

### ❌ Incorrect pointer updates  

### ❌ Not handling head separately  

---

## 🧪 Edge Cases

- Empty list  
- Insert at head when list empty  
- Delete only node  
- Insert at index equal to size  
- Delete last node  

---

## CODE 
Solution added separately in a `.java` file inside this folder.
