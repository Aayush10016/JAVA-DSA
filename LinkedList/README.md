# 📂 Linked List

# 🔗 Linked List — Complete Guide (Concepts + Pattern Recognition + Interview Roadmap)

A **Linked List** is a linear data structure where elements (nodes) are stored in non-contiguous memory and connected using pointers.

Linked Lists are one of the most important DS for interviews and are heavily used in:
✔ Stack & Queue implementation  
✔ Hashing (chaining)  
✔ Graph adjacency lists  
✔ Memory-efficient data manipulation  

This folder contains:
✔ Linked list basics  
✔ Types of linked lists  
✔ Pointer manipulation patterns  
✔ Cycle detection  
✔ Reversal techniques  
✔ Slow/Fast pointer tricks  
✔ Interview patterns  
✔ Recommended folder structure  

---

# 🟦 1. What Is a Linked List?

A linked list is a chain of nodes.  
Each node contains:
- **data**  
- **pointer/reference to next node**

Example:

```
[1] → [4] → [7] → [9] → null
```

Nodes are stored anywhere in memory — pointers bind them.

---

# 🟩 2. Why Do We Use Linked Lists?

### ✔ Dynamic size  
### ✔ O(1) insertion/deletion at head  
### ✔ Efficient memory usage  
### ✔ Used in underlying implementation of major DS  
### ✔ Pointer-based manipulation (very common in interviews)

---

# 🟥 3. Types of Linked Lists

### ✔ Singly Linked List  
Each node → points to next

### ✔ Doubly Linked List  
Node → next + prev pointers  
Faster for deletions and bidirectional traversal

### ✔ Circular Linked List  
Last node points to head  
Used in:
- scheduling  
- round-robin algorithms  

---

# 🟧 4. Common Linked List Operations

- Insert at head  
- Insert at tail  
- Delete node  
- Find middle  
- Reverse list  
- Detect cycle  
- Remove cycle  
- Merge sorted lists  
- Sort list  
- Check palindrome  
- Clone list with random pointer  

---

# 🟨 5. Linked List Pattern Recognition

Linked List problems almost ALWAYS use:

---

### 🟦 A. Slow + Fast Pointers  
Used for:
- Middle of list  
- Cycle detection (Floyd’s Algorithm)  
- Cycle length  
- Start of cycle  
- Palindrome check (using reverse)  

---

### 🟧 B. Pointer Manipulation  
Used for:
- Reverse linked list  
- Reverse in groups of K  
- Merge two lists  
- Partition list  
- Remove duplicates  

---

### 🟥 C. Dummy Node Technique  
Used to simplify:
- Edge cases  
- Insert/delete at head  
- Merging  
- Sorting lists  

---

### 🟪 D. Merge & Sort Techniques  
Used when:
- merging sorted lists  
- sorting a linked list (merge sort)

---

# 🟫 6. How to Identify Linked List Problems?

Look for keywords:

| Keyword / Clue | Pattern |
|----------------|---------|
| “middle element” | slow/fast |
| “detect loop”, “cycle” | Floyd’s cycle detection |
| “reverse”, “swap” | pointer manipulation |
| “merge two lists” | dummy node + merging |
| “k-group operations” | recursive reverse pattern |
| “reorder list” | slow/fast + reverse second half |
| “remove nth node from end” | 2-pointer gap technique |

If you see direct pointer manipulation → **Linked List pattern**.

---

# 🟦 7. Classic Linked List Interview Problems

---

## ✔ 1. Reverse Linked List  
Very important pattern.

## ✔ 2. Middle of Linked List (Slow/Fast)  
Used in many follow-up problems.

## ✔ 3. Cycle Detection (Floyd’s Algorithm)  
Includes:
- detect cycle  
- find cycle length  
- find cycle start  

## ✔ 4. Merge Two Sorted Lists  
Used in merge sort.

## ✔ 5. Remove Nth Node From End  
2-pointer gap technique.

## ✔ 6. Palindrome Linked List  
- find middle  
- reverse second half  
- compare halves  

## ✔ 7. Reorder List  
Tricky pointer manipulation problem.

## ✔ 8. Merge Sort on Linked List  
Efficient sorting (array sorting doesn’t work here).

## ✔ 9. Clone Linked List With Random Pointer  
Advanced / common medium-hard problem.

---

# 🟧 8. Types

```
LinkedList/
 ├── README 
 ├── Basics 
 ├── ReverseList 
 ├── MiddleNode 
 ├── CycleDetection/
 │    ├── DetectCycle 
 │    ├── CycleLength 
 │    └── CycleStart 
 ├── MergeTwoLists 
 ├── RemoveNthFromEnd 
 ├── PalindromeList 
 ├── ReorderList 
 ├── MergeSortLinkedList 
 └── CloneRandomPointerList 
```

---

# 🟥 9. Time Complexities Summary

| Operation | Singly List | Doubly List |
|----------|-------------|-------------|
| Insert at head | O(1) | O(1) |
| Insert at tail | O(n) or O(1)\* | O(1) |
| Delete node | O(n) | O(1)\* |
| Search | O(n) | O(n) |
| Reversal | O(n) | O(n) |

\*With tail pointer or pointer provided.

---

# 🟨 10. Tips for Mastering Linked Lists

✔ Draw diagrams — visualizing pointers is essential  
✔ Use dummy nodes for simplified code  
✔ Practice slow/fast pointer trick thoroughly  
✔ Reversal is used in MANY problems  
✔ Learn to trace pointer changes carefully  
✔ Think iteratively AND recursively  
✔ Don’t rush — small pointer mistakes break everything  

---



