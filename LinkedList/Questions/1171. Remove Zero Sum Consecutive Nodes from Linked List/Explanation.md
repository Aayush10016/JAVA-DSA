# 📘 LeetCode 1171 — Remove Zero Sum Consecutive Nodes from Linked List  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Prefix Sum, HashMap

---

## 📝 Problem Summary

You are given the head of a singly linked list.

Your task is to **remove all consecutive sequences of nodes whose values sum to 0**, and return the modified linked list.

If after removing such a sequence another zero-sum sequence forms, you must also remove it.

---

## 🎯 What Is Being Asked (In Simple Words)

If a sequence of consecutive nodes adds up to **0**, delete that entire sequence.

Example:

Input:
```
1 → 2 → -3 → 3 → 1
```

The first three nodes sum to 0:

```
1 + 2 + (-3) = 0
```

After removing them:

```
3 → 1
```

Output:
```
3 → 1
```

---

Another example:

Input:
```
1 → 2 → 3 → -3 → 4
```

Here:

```
3 + (-3) = 0
```

After removing:

```
1 → 2 → 4
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Prefix sum technique  
- HashMap usage  
- Linked list restructuring  
- Detecting subarray sums equal to zero  

It combines array prefix-sum logic with linked lists.

---

## 🔑 Core Insight (MOST IMPORTANT)

If two prefix sums are equal:

```
prefixSum(i) == prefixSum(j)
```

Then the nodes between `i` and `j` sum to zero.

So we can remove those nodes.

Example:

Prefix sums:
```
1 → 3 → 0 → 3 → 4
```

If a prefix sum repeats, the nodes in between sum to zero.

---

# 🛠 Approach — Prefix Sum + HashMap

## 🧠 Step 1 — Use Dummy Node

Create:

```
dummy → head
```

This helps handle cases where the beginning nodes sum to zero.

---

## 🧠 Step 2 — First Pass (Store Prefix Sums)

Traverse the list and compute prefix sum.

Store in HashMap:

```
prefixSum → node
```

If prefix sum repeats, the latest node overwrites previous mapping.

---

## 🧠 Step 3 — Second Pass (Remove Zero Sum Sections)

Traverse again:

For each node:

```
currentSum += node.val
```

Set:

```
node.next = map.get(currentSum).next
```

This skips nodes whose total sum is zero.

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(n)

HashMap stores prefix sums.

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → -3 → 3 → 1
```

Prefix sums:
```
1
3
0
3
4
```

When prefix sum `0` repeats:

Nodes between them sum to zero.

Remove:

```
1 → 2 → -3
```

Remaining:

```
3 → 1
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting dummy node  
Needed when initial nodes sum to zero.

### ❌ Not overwriting prefix sums  
Latest occurrence must be stored.

### ❌ Only removing first zero sequence  
Must handle all occurrences.

---

## 🧪 Edge Cases

- Entire list sums to zero  
- Multiple zero-sum segments  
- Nested zero-sum segments  
- Single node list  
- No zero-sum segments  

---


## CODE
Solution added separately in a `.java` file inside this folder.
