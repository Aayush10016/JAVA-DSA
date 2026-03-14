# 📘 LeetCode 496 — Next Greater Element I  
**Category:** Stack / Array  
**Difficulty:** Easy  
**Tags:** Monotonic Stack, HashMap, Array

---

## 📝 Problem Summary

You are given two integer arrays:

```
nums1
nums2
```

Where:

- `nums1` is a subset of `nums2`
- All numbers are **unique**

For each element in `nums1`, find the **next greater element** in `nums2`.

The **next greater element** is the first element **to the right** in `nums2` that is greater than the current element.

If no such element exists, return `-1`.

---

## 🎯 What Is Being Asked (In Simple Words)

For every element in `nums1`:

1. Find its position in `nums2`
2. Look to the **right side**
3. Find the **first number greater than it**

If none exists → answer is `-1`.

---

### Example

Input:

```
nums1 = [4,1,2]
nums2 = [1,3,4,2]
```

Output:

```
[-1,3,-1]
```

Explanation:

```
4 → no greater element → -1
1 → next greater is 3
2 → no greater element → -1
```

---

## 🧠 Why This Problem Is Important

This problem introduces the **Next Greater Element pattern**, which is widely used in:

- Stack problems  
- Monotonic stack techniques  
- Range queries  

Many advanced problems are built on this concept.

---

## 🔑 Core Insight (MOST IMPORTANT)

Instead of scanning the array repeatedly:

We can process `nums2` **once** using a **monotonic decreasing stack**.

The stack keeps elements in decreasing order.

Whenever a larger element appears:

It becomes the **next greater element** for items in the stack.

---

# 🛠 Approach — Monotonic Stack + HashMap

## 🧠 Step 1 — Process nums2

Traverse `nums2`.

Maintain a stack.

While:

```
current number > stack top
```

Pop the stack element.

That popped element’s **next greater element = current number**.

Store this mapping in a HashMap.

---

## 🧠 Step 2 — Store Results

For elements that never find a greater element:

```
next greater = -1
```

---

## 🧠 Step 3 — Build Answer

For each element in `nums1`:

Retrieve the value from the HashMap.

---

## ⏱ Complexity

| Operation | Complexity |
|----------|------------|
| Building next greater map | O(n) |
| Querying nums1 | O(m) |

Total:

```
O(n + m)
```

Space:

```
O(n)
```

---

## 🧩 Example Walkthrough

Input:

```
nums2 = [1,3,4,2]
```

Processing:

```
stack = []

1 → push
3 → 3 > 1 → map[1] = 3
push 3

4 → 4 > 3 → map[3] = 4
push 4

2 → push
```

Remaining elements:

```
4 → no greater → -1
2 → no greater → -1
```

Final map:

```
1 → 3
3 → 4
4 → -1
2 → -1
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Using nested loops

Brute force leads to:

```
O(n²)
```

which is inefficient.

---

### ❌ Storing values instead of indices

Indices are safer when dealing with arrays.

---

### ❌ Forgetting remaining stack elements

All remaining stack elements have next greater = `-1`.

---

## 🧪 Edge Cases

- Element has no greater element  
- Single element array  
- Strictly decreasing array  

Example:

```
nums2 = [5,4,3,2,1]
```

All answers → `-1`

---


## CODE
Solution added separately in the `.java` file inside this folder.
