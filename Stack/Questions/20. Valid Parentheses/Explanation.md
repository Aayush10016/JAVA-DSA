# 📘 LeetCode 20 — Valid Parentheses  
**Category:** Stack / String  
**Difficulty:** Easy  
**Tags:** Stack, String, Brackets

---

## 📝 Problem Summary

You are given a string `s` containing only the characters:

```
( ) { } [ ]
```

Your task is to determine whether the input string is **valid**.

A string is valid if:

1. Open brackets must be closed by the **same type of brackets**.
2. Open brackets must be closed in the **correct order**.
3. Every closing bracket must have a **corresponding opening bracket**.

---

## 🎯 What Is Being Asked (In Simple Words)

Check whether the parentheses/brackets in the string are **properly matched and ordered**.

Example:

Valid examples:

```
()
()[]{}
{[]}
```

Invalid examples:

```
(]
([)]
(((
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Stack usage  
- Matching pair logic  
- String traversal  
- Order validation  

It is one of the most common beginner stack problems.

---

## 🔑 Core Insight (MOST IMPORTANT)

When we encounter:

- **Opening bracket** → push it into the stack  
- **Closing bracket** → check if it matches the last opening bracket  

Stacks work perfectly here because they follow:

```
Last In → First Out (LIFO)
```

Which matches how nested parentheses work.

---

# 🛠 Approach — Using a Stack

## 🧠 Step-by-Step Idea

1. Create an empty stack.

2. Traverse the string character by character.

3. If the character is an **opening bracket**:

```
push it into the stack
```

4. If the character is a **closing bracket**:

- Check if stack is empty → invalid
- Pop the top element
- Verify it matches the correct opening bracket

5. After processing the entire string:

- If stack is empty → valid
- Otherwise → invalid

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(n)

In worst case all characters are pushed into the stack.

---

## 🧩 Example Walkthrough

Input:

```
s = "{[]}"
```

Steps:

```
push '{'
push '['
push ']'
```

Processing:

```
[ → matched with ]
{ → matched with }
```

Stack becomes empty.

Result:

```
Valid
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Not checking stack empty before pop  
May cause errors.

### ❌ Incorrect bracket mapping  

Correct pairs:

```
( → )
[ → ]
{ → }
```

### ❌ Ignoring order of brackets  

Example:

```
([)]
```

This is invalid.

---

## 🧪 Edge Cases

- Empty string → valid  
- Only opening brackets → invalid  
- Only closing brackets → invalid  
- Nested brackets → valid  

Example:

```
((({[]})))
```

---


## CODE
Solution added separately in the `.java` file inside this folder.
