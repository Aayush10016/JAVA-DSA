# 📘 LeetCode 147 — Insertion Sort List  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Sorting, Insertion Sort

---

## 📝 Problem Summary

You are given the head of a singly linked list.

Your task is to **sort the linked list using the insertion sort algorithm** and return the sorted list.

---

## 🎯 What Is Being Asked (In Simple Words)

Sort the linked list in **ascending order** using **insertion sort**.

Example:

Input:
```
4 → 2 → 1 → 3
```

Output:
```
1 → 2 → 3 → 4
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Understanding of **insertion sort**
- Linked list traversal
- Pointer manipulation
- Building a sorted list dynamically

It helps understand how sorting works when random access is not available.

---

## 🔑 Core Insight (MOST IMPORTANT)

Insertion sort works by:

1. Maintaining a **sorted portion**
2. Taking the next node from the unsorted portion
3. Inserting it in the correct position in the sorted portion

For linked lists, insertion is efficient because we only need to adjust pointers.

---

# 🛠 Approach — Simulate Insertion Sort

## 🧠 Step-by-Step Idea

1. Create a **dummy node** to represent the start of the sorted list.

```
dummy → null
```

2. Traverse the original list.

For each node:

- Store the next node (so we don’t lose the list)
- Find the correct position in the sorted list
- Insert the node there

3. Continue until all nodes are processed.

---

## 🧠 Key Observation

The sorted part grows gradually.

Example process:

```
4 → 2 → 1 → 3
```

Step 1:
```
4
```

Step 2:
```
2 → 4
```

Step 3:
```
1 → 2 → 4
```

Step 4:
```
1 → 2 → 3 → 4
```

---

## ⏱ Complexity

- **Time:** O(n²) in worst case  
- **Space:** O(1)

Because each node may require scanning the sorted portion.

---

## 🧩 Example Walkthrough

Input:
```
4 → 2 → 1 → 3
```

Iteration steps:

Insert 4:
```
4
```

Insert 2:
```
2 → 4
```

Insert 1:
```
1 → 2 → 4
```

Insert 3:
```
1 → 2 → 3 → 4
```

Final result:
```
1 → 2 → 3 → 4
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Losing next pointer
Always store the next node before inserting.

### ❌ Incorrect insertion position
Must search from the beginning of the sorted list.

### ❌ Not resetting pointer to dummy
Each insertion search must start from dummy.

---

## 🧪 Edge Cases

- Empty list  
- Single node  
- Already sorted list  
- Reverse sorted list  

---


## CODE
Solution added separately in a `.java` file inside this folder.
