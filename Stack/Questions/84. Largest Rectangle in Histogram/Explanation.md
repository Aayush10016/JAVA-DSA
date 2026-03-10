# 📘 LeetCode 84 — Largest Rectangle in Histogram  
**Category:** Stack / Array  
**Difficulty:** Hard  
**Tags:** Stack, Monotonic Stack, Array

---

## 📝 Problem Summary

You are given an array `heights` representing the height of bars in a histogram where each bar has a width of `1`.

Your task is to **find the area of the largest rectangle that can be formed within the histogram**.

---

## 🎯 What Is Being Asked (In Simple Words)

Each bar represents a vertical column.

You must determine the **largest rectangle area** that can be formed using consecutive bars.

Example:

Input:
```
heights = [2,1,5,6,2,3]
```

Output:
```
10
```

Because the largest rectangle is formed using bars:

```
5 and 6
```

Area:

```
height = 5
width = 2

area = 5 × 2 = 10
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Monotonic stack concepts  
- Efficient boundary detection  
- Range expansion logic  
- Optimal O(n) algorithm design  

It is one of the most important **stack-based interview problems**.

---

## 🔑 Core Insight (MOST IMPORTANT)

For each bar:

We want to find how far it can extend:

```
Left boundary → first smaller bar
Right boundary → first smaller bar
```

The width of the rectangle becomes:

```
width = rightSmallerIndex - leftSmallerIndex - 1
```

Area:

```
area = height × width
```

---

# 🛠 Approach — Monotonic Increasing Stack

## 🧠 Idea

Maintain a stack that stores indices of bars in **increasing height order**.

While traversing:

If the current bar is smaller than the bar at the top of the stack:

That means the rectangle for the top bar has ended.

We compute the area using that bar as the smallest height.

---

## 🧠 Steps

1. Traverse all bars.

2. Maintain stack with **increasing heights**.

3. When a smaller height appears:
   - Pop from stack
   - Calculate rectangle area

4. Continue until stack becomes increasing again.

5. After traversal, process remaining bars.

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(n)

Each element is pushed and popped once.

---

## 🧩 Example Walkthrough

Input:
```
[2,1,5,6,2,3]
```

Stack operations:

```
Push 2
1 is smaller → pop 2 → area = 2
Push 1
Push 5
Push 6
2 is smaller → pop 6 → area = 6
2 is smaller → pop 5 → area = 10
Push 2
Push 3
```

Maximum area found:

```
10
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Forgetting to process remaining stack  
Important after traversal.

### ❌ Incorrect width calculation  

Width formula:

```
width = currentIndex - stack.peek() - 1
```

### ❌ Using values instead of indices in stack  

---

## 🧪 Edge Cases

- Single bar  
- All bars same height  
- Increasing heights  
- Decreasing heights  

Example:

```
[2,2,2,2]
```

Largest rectangle:

```
2 × 4 = 8
```

---

## CODE
Solution added separately in the `.java` file inside this folder.
