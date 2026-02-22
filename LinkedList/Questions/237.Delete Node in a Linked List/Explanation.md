# 📘 LeetCode 237 — Delete Node in a Linked List  
**Category:** Linked List  
**Difficulty:** Easy  
**Tags:** Linked List, Pointer Manipulation

---

## 📝 Problem Summary

You are given a node in a singly linked list.

⚠️ You are **NOT given the head** of the list.

Your task is to **delete the given node** from the linked list.

Important:
- The given node is **guaranteed not to be the last node**.

---

## 🎯 What Is Being Asked (In Simple Words)

You must delete a node **without having access to the head** of the list.

Example:

Original list:
```
4 → 5 → 1 → 9
```

Given node:
```
5
```

After deletion:
```
4 → 1 → 9
```

---

## 🧠 Why This Problem Is Important

This is a trick problem.

Normally, to delete a node, you need:
- Access to the previous node

But here:
- You only have access to the node itself.

So you must think differently.

---

## 🔑 Core Insight (MOST IMPORTANT)

Since we cannot access the previous node:

We cannot actually "remove" this node.

Instead:

👉 Copy the value of the next node into the current node  
👉 Then delete the next node  

Effectively, we shift the next node's data backward.

---

# 🛠 Approach — Overwrite and Skip

## 🧠 Step-by-Step Idea

Given:
```
node
```

1. Copy next node's value:
```
node.val = node.next.val
```

2. Skip next node:
```
node.next = node.next.next
```

This removes the next node, but since we copied its value,
it appears that the given node was deleted.

---

## 🧩 Why This Works

Original:
```
A → B → C
```

If we want to delete B:

We change B to C:
```
A → C → C
```

Then skip next C:
```
A → C
```

Now B is effectively removed.

---

## ⏱ Complexity

- **Time:** O(1)  
- **Space:** O(1)

No traversal required.

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Trying to access previous node  
Not available.

### ❌ Trying to delete last node  
Problem guarantees the node is not the last one.

### ❌ Forgetting to update next pointer  

---

## 🧪 Edge Cases

- Node is second last → works fine  
- Node is in middle → works fine  
- Node is last → NOT allowed by constraints  

---



## CODE
Solution added separately in a `.java` file inside this folder.
