# 📘 LeetCode 344 — Reverse String  
**Category:** Two Pointers, Recursion  
**Difficulty:** Easy  
**Tags:** String, Two Pointers, In-place, Recursion

---

## 📝 Problem Summary

You are given a character array `s`.

Your task is to **reverse the array in-place**.  
You must modify the input array directly and **not return anything**.

---

## 🎯 What Is Being Asked (In Simple Words)

You must:
- Reverse the characters of the string
- Do it **in-place** (no extra array allowed)
- Use minimal memory

Example:
```
Input:  ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
```

---

## 🧠 Why This Problem Is Important

This is a **fundamental two-pointer problem**.

It tests:
- In-place array manipulation
- Pointer movement logic
- Understanding of space constraints

This pattern is used in:
- String reversal
- Palindrome checks
- Array transformations

---

## 🔑 Core Insight (MOST IMPORTANT)

To reverse an array:
- Swap the first and last element  
- Then move inward  

This is a **Two Pointer Pattern**:
```
left → start of array
right → end of array
```

Swap and move:
```
left++
right--
```

---

## ⭐ Pattern Recognition

You should instantly think of Two Pointers when you see:
- “Reverse array”
- “Reverse string”
- “In-place modification”
- “Swap from both ends”

👉 This is the **classic Two Pointer template problem**.

---

# 🛠 Approach 1 — Two Pointer In-Place Reversal (Optimal)

## 🧠 Idea

1. Start one pointer at the beginning  
2. Start one pointer at the end  
3. Swap characters  
4. Move pointers toward the center  
5. Stop when pointers cross  

---

## 🧩 Thought Process

- Swapping symmetric positions reverses the array  
- Each swap fixes two positions  
- No extra space is needed  

---

## ⏱ Complexity

- **Time:** `O(n)`  
- **Space:** `O(1)` (in-place)

This is the **optimal solution**.

---

# 🛠 Approach 2 — Using Extra Array (Not Allowed)

You could:
- Create a new array
- Copy characters in reverse order

But this violates the **in-place constraint**, so it is not accepted in interviews.

---

## 🧩 Example Walkthrough

### Input:
```
s = ["h","e","l","l","o"]
```

Steps:
```
Swap h and o → ["o","e","l","l","h"]
Swap e and l → ["o","l","l","e","h"]
Stop (pointers crossed)
```

Output:
```
["o","l","l","e","h"]
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Using extra space  
Problem explicitly requires in-place reversal.

### ❌ Wrong loop condition  
Should stop when left >= right.

### ❌ Forgetting to move pointers  
Causes infinite loop.

### ❌ Off-by-one errors  
Careful with even and odd length arrays.

---

## 🧪 Edge Cases

- Empty array  
- Single character  
- Even length string  
- Odd length string  
- Large input  

Two-pointer approach handles all cases.

---

## CODE 
Code added separately in a `.java` file inside this folder.

