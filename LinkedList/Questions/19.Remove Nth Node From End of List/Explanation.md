# 📘 LeetCode 2074 — Reverse Nodes in Even Length Groups  
**Category:** Linked List  
**Difficulty:** Medium  
**Tags:** Linked List, Simulation, Group Processing, Pointer Manipulation

---

## 📝 Problem Summary

You are given the head of a singly linked list.

The nodes in the list are grouped in increasing group sizes:

- Group 1 → size 1  
- Group 2 → size 2  
- Group 3 → size 3  
- Group 4 → size 4  
- and so on...

Your task is:

👉 Reverse the nodes in each group **if the group length is even**.  
👉 If the group length is odd, leave it as it is.

Return the modified list.

---

## 🎯 What Is Being Asked (In Simple Words)

Divide the list into groups like:

```
1 node
2 nodes
3 nodes
4 nodes
5 nodes
...
```

For each group:
- If group size is even → reverse that group  
- If group size is odd → keep it as-is  

---

### Example

Input:
```
1 → 2 → 3 → 4 → 5 → 6
```

Groups:
```
[1]
[2,3]
[4,5,6]
```

Group sizes:
```
1 (odd) → no reverse
2 (even) → reverse → [3,2]
3 (odd) → no reverse
```

Output:
```
1 → 3 → 2 → 4 → 5 → 6
```

---

## 🧠 Why This Problem Is Important

This problem tests:

- Linked list traversal  
- Group-based processing  
- Careful pointer handling  
- Conditional reversal  
- Simulation logic  

It combines multiple linked list concepts in one structured problem.

---

## 🔑 Core Insight (MOST IMPORTANT)

You must:

1. Traverse list group by group  
2. Count actual group size  
3. If size is even → reverse that portion  
4. Carefully reconnect with rest of list  

⚠️ Important:
The last group may have fewer nodes than expected.  
You must use the **actual group size**, not the intended size.

---

# 🛠 Step-by-Step Approach

## 🧠 Step 1 — Initialize

- Create dummy node pointing to head  
- Keep:
  - `prevGroupEnd`
  - `current`
  - `groupSize = 1`

---

## 🧠 Step 2 — Traverse and Count Group

For each group:

- Count up to `groupSize` nodes  
- Store actual count  

---

## 🧠 Step 3 — If Group Size is Even

Reverse exactly `actualCount` nodes.

Use standard reversal logic for limited nodes.

---

## 🧠 Step 4 — Reconnect

After reversing:

- Connect previous group end to new group head  
- Connect reversed group tail to next node  

If not reversed:
- Simply move forward  

---

## 🧠 Step 5 — Increase Group Size

```
groupSize++
```

Repeat until list ends.

---

## ⏱ Complexity

- **Time:** O(n)  
- **Space:** O(1)

Each node is visited once.

---

## 🧩 Example Walkthrough

Input:
```
1 → 2 → 3 → 4 → 5 → 6 → 7 → 8
```

Groups:

```
[1]
[2,3]
[4,5,6]
[7,8]
```

Sizes:
```
1 → no reverse
2 → reverse → 3,2
3 → no reverse
2 → reverse → 8,7
```

Output:
```
1 → 3 → 2 → 4 → 5 → 6 → 8 → 7
```

---

## 🚫 Common Mistakes / Pitfalls

### ❌ Using expected group size instead of actual count  
Last group may be smaller.

### ❌ Incorrect pointer reconnection  
Must reconnect both ends carefully.

### ❌ Not moving prevGroupEnd properly  

### ❌ Forgetting to increment group size  

---

## 🧪 Edge Cases

- Single node  
- List shorter than group size  
- Last group smaller than expected  
- All groups odd  
- All groups even  

---



## CODE
Solution added separately in a `.java` file inside this folder.
