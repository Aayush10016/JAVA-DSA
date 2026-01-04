# 📘 LeetCode 179 — Largest Number  
**Category:** Sorting / Greedy  
**Difficulty:** Medium  
**Tags:** Array, Sorting, Greedy, String

---

## 📝 Problem Summary

You are given an array of non-negative integers `nums`.

Your task is to **arrange them** such that they form the **largest possible number**, and return it as a **string**.

---

## 🎯 What Is Being Asked (In Simple Words)

You are NOT asked to find the largest integer in the array.

Instead, you must:
- **Reorder** the numbers
- **Concatenate** them
- Make the **largest possible combined number**

Example:
```
nums = [3, 30, 34, 5, 9]
Output = "9534330"
```

---

## 🧠 Why This Problem Is Tricky

A normal descending sort **does NOT work**.

Example:
```
nums = [30, 3]
```

Normal sort → `[30, 3]` → `"303"` ❌  
Correct answer → `[3, 30]` → `"330"` ✅

So this is **not numeric sorting** — it’s **string comparison logic**.

---

## 🔑 Core Insight (MOST IMPORTANT)

To decide the correct order of two numbers `a` and `b`, compare:

```
a + b   vs   b + a
```

Whichever concatenation is **larger** determines the order.

This comparison ensures the global maximum result.

---

## ⭐ Pattern Recognition

You should immediately think of this pattern when you see:
- “Arrange numbers to form largest value”
- “Concatenate elements”
- “Return result as string”

👉 This is a **Custom Sorting + Greedy Decision** problem.

---

## 🧠 Why Greedy Works Here

For any two numbers:
- Placing the better pair first **always** improves the final result
- Local optimal decisions lead to global optimum

That’s why sorting using a custom comparator works perfectly.

---

## 🛠 Conceptual Approach (NO CODE)

### Step 1: Convert numbers to strings
Concatenation is a string operation.

---

### Step 2: Sort using custom rule

For two strings `a` and `b`:
```
If (a + b) > (b + a) → a comes before b
Else → b comes before a
```

This guarantees the largest final concatenation.

---

### Step 3: Join all strings

Concatenate the sorted strings into one final result.

---

### Step 4: Handle edge case (VERY IMPORTANT)

If the largest number is `"0"`:
```
Return "0"
```

This avoids outputs like `"0000"`.

---

## 🧩 Example Walkthrough

### Input:
```
nums = [3, 30, 34, 5, 9]
```

Convert to strings:
```
["3","30","34","5","9"]
```

Custom sort order:
```
"9" > "5" > "34" > "3" > "30"
```

Result:
```
"9534330"
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Using numeric sorting  
Fails for cases like `[3,30]`.

### ❌ Ignoring string concatenation comparison  
This is the heart of the problem.

### ❌ Returning integer instead of string  
Result may exceed integer limits.

### ❌ Forgetting `"0"` edge case  
Must return `"0"`, not `"000"`.

---

## 🧪 Edge Cases

- All zeros → return `"0"`
- Single element array
- Large numbers
- Numbers with different digit lengths
- Repeated values

All handled naturally by custom sorting logic.

---


## CODE
Code added separately in a `.java` file inside this folder.

