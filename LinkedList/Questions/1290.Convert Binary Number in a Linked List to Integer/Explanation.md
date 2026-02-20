# 📘 LeetCode 1290 — Convert Binary Number in a Linked List to Integer  
**Category:** Linked List / Bit Manipulation  
**Difficulty:** Easy  
**Tags:** Linked List, Bit Manipulation, Math

---

## 📝 Problem Summary

You are given the head of a singly linked list.

Each node contains either `0` or `1`.

The linked list represents a binary number where:
- The most significant bit (MSB) is at the head.
- The least significant bit (LSB) is at the tail.

Your task is to return the decimal (base-10) value of this binary number.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Read the linked list as a binary number
- Convert it into its decimal equivalent

Example:

Input:
```
1 → 0 → 1
```

Binary:
```
101
```

Output:
```
5
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Linked list traversal
- Binary to decimal conversion
- Bit manipulation logic
- Mathematical accumulation

It combines basic math with linked list fundamentals.

---

## 🔑 Core Insight (MOST IMPORTANT)

Binary number conversion follows this rule:

If current number is `num`, and next bit is `b`:

```
num = num * 2 + b
```

This is equivalent to:
```
Left shift + add current bit
```

---

# 🛠 Approach — Iterative Binary Accumulation

## 🧠 Step-by-Step Idea

1. Initialize:
```
result = 0
```

2. Traverse the linked list:
   - For each node:
     ```
     result = result * 2 + node.val
     ```

3. Return result.

---

## 🧩 Why This Works

Binary shifting logic:

Example:
```
1 → 0 → 1
```

Step 1:
```
result = 0 * 2 + 1 = 1
```

Step 2:
```
result = 1 * 2 + 0 = 2
```

Step 3:
```
result = 2 * 2 + 1 = 5
```

Final result:
```
5
```

---

## ⏱ Complexity

- **Time:** O(n)
- **Space:** O(1)

Single traversal, constant space.

---

# 🛠 Alternative Thinking — Bit Shifting

Instead of multiplying by 2:

```
result = (result << 1) | node.val
```

This does the same operation using bit manipulation.

---

## 🧩 Example Walkthrough

Input:
```
1 → 1 → 1 → 1
```

Binary:
```
1111
```

Calculation:
```
0 → 1 → 3 → 7 → 15
```

Output:
```
15
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Reading list backward  
MSB is at head, not tail.

### ❌ Using power calculations unnecessarily  
Multiplication logic is simpler.

### ❌ Overflow (for very large input)  
Problem constraints usually prevent overflow.

---

## 🧪 Edge Cases

- Single node (0 or 1)  
- All zeros  
- All ones  
- Long binary sequence  

---


## CODE
Solution added separately in a `.java` file inside this folder.

