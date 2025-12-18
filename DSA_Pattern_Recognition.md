# 🚀 DSA Pattern Recognition Cheat Sheet — Advanced Edition  
Quick pattern-matching rules to identify which algorithm or data structure to use in common interview problems.

This guide contains high-frequency patterns from LeetCode, FAANG interviews, Striver A2Z, and Blind 75.

---

# 🔥 1. ARRAY & NUMBER PATTERNS  

### ⭐ **1. Numbers range from 1 to N or 0 to N → Use Cyclic Sort**
Common problems:
- Missing Number  
- All Numbers Disappeared  
- Find Duplicate Number  

Trigger words:
- “Numbers are from 1…N”
- “Find missing/duplicate”

---

### ⭐ **2. Find missing number / duplicate → Math, Cyclic Sort, XOR**
- If **one missing**, **one extra** → Cyclic Sort OR XOR  
- If **sum mismatch** → Use Gauss Formula  
- If **two missing** → XOR split trick  

---

### ⭐ **3. Find two elements that sum to target → Two Sum Pattern**
- Use HashMap  
- O(n) solution  
- Works for arrays & strings  

---

### ⭐ **4. Subarray with given sum / longest subarray → Prefix Sum + HashMap**
Trigger words:
- “Longest subarray with sum K”
- “Count number of subarrays with sum K”

Pattern:
- prefixSum  
- map stores earliest index  

---

### ⭐ **5. Sliding Window Pattern (Very high frequency)**  
Use when:
- Subarray / substring  
- Need max/min, longest, shortest  
- Window grows and shrinks  

Trigger words:
- “Longest substring…”
- “At most K”
- “Exactly K”
- “Smallest window containing…”

---

### ⭐ **6. Two Pointer Pattern**
Use when:
- Sorted array  
- String reversal  
- Pair problems  
- Removing duplicates  

Trigger words:
- “Sorted array”
- “Left pointer, right pointer”
- “Compare from ends”

---

### ⭐ **7. Intervals Pattern**
Use when:
- Start/End times  
- Overlapping intervals  
- Merging meetings  

Trigger phrase:
- “Meetings”, “Intervals”, “Calendar”, “Overlapping”

Use:
- Sort by start time  
- Merge using simple logic  

---

### ⭐ **8. Kadane’s Algorithm → Max subarray sum**
Trigger words:
- “Largest sum subarray”
- “Contiguous subarray”

---

---

# 🔥 2. STRING PATTERNS

### ⭐ **1. Anagrams → Sorting or Frequency Array**
Trigger words:
- “Rearrange”
- “Anagram”
- “Same characters”

---

### ⭐ **2. Palindrome → Two Pointers**
Trigger words:
- “Check if string is palindrome”
- “Almost palindrome”

---

### ⭐ **3. Longest substring with… → Sliding Window**
- Without repeating → sliding window + set/hashmap  
- With at most K distinct → sliding window  

---

### ⭐ **4. Pattern Matching → KMP / Sliding Window**
Trigger word:
- “Pattern occurs in text”

---

### ⭐ **5. Decode String / Nested String → Stack**
Trigger words:
- “Decode”
- “Nested encoding”
- “k[abc]”

---

---

# 🔥 3. LINKED LIST PATTERNS  

### ⭐ **1. Fast + Slow Pointer**
Use for:
- Middle of list  
- Cycle detection (Floyd’s Algorithm)  
- Detect cycle start  
- Palindrome check  

Trigger words:
- “Find middle”
- “Cycle”
- “Loop”

---

### ⭐ **2. Reversal Pattern**
- Reverse entire list  
- Reverse first K nodes  
- Reverse in groups of K  

Trigger words:
- “Reverse nodes in k-group”

---

---

# 🔥 4. HASHMAP / HASHSET PATTERNS  

### ⭐ **1. Frequency Counting**
Used for:
- Anagrams  
- Top K frequent  
- Bucket sort style solutions  

---

### ⭐ **2. Store seen values**
Used for:
- Two sum  
- Detect cycles (in sequences)  
- Check duplicates  

---

### ⭐ **3. Prefix Sum + HashMap**
Very important pattern:
- Longest subarray sum  
- Count subarrays sum = K  
- Binary arrays trick  

---

### ⭐ **4. HashSet best for uniqueness**
Trigger words:
- “distinct”
- “unique”
- “first repeating / non repeating”

---

---

# 🔥 5. STACK & QUEUE PATTERNS  

### ⭐ **1. Monotonic Stack → Next greater/smaller element**
Trigger words:
- “Next greater element”
- “Next smaller element”
- “Stock span”
- “Daily temperatures”

---

### ⭐ **2. Stack for Expression Problems**
Used for:
- Infix → postfix  
- Evaluate postfix  
- Decode strings  

Trigger words:
- “Evaluate expression”
- “Parentheses”

---

### ⭐ **3. Queue → BFS or sliding window**
Trigger words:
- “Level order”
- “Breadth-first search”

---

---

# 🔥 6. TREE PATTERNS  

### ⭐ **1. DFS Recursion**
Pattern for:
- Height  
- Diameter  
- Sum of nodes  
- Path sums  

Trigger words:
- “Compute height”
- “Sum from root to leaf”

---

### ⭐ **2. BFS Level-order**
Pattern for:
- Left view  
- Right view  
- Top/bottom view  

---

### ⭐ **3. BST Patterns**
Use these rules:
- Left < Node < Right  
- Inorder traversal → Sorted output  

Trigger words:
- “Find kth smallest”
- “Insert/delete/search”

---

---

# 🔥 7. GRAPH PATTERNS  

### ⭐ **1. BFS → Shortest path (unweighted graph)**
---

### ⭐ **2. Dijkstra → Shortest path weighted**
---

### ⭐ **3. DFS → Components, cycle detection**
---

### ⭐ **4. Topological Sort → Course schedule**
Trigger words:
- “Prerequisites”
- “Order of tasks”
- “Directed acyclic graph”

---

### ⭐ **5. Union Find (DSU)**
Use when:
- Cycle detection in undirected graph  
- Connectivity queries  
- Dynamic graph problems  

Trigger words:
- “Connected components”
- “Are X and Y connected?”

---

---

# 🔥 8. DYNAMIC PROGRAMMING PATTERNS  

### ⭐ General DP rule:
If a problem has:
- **Choices**
- **Optimal value**
- **Overlapping subproblems**
→ It's DP.

---

### ⭐ Common DP Patterns to Recognize  

#### **1. Subsequence DP**
Used for:
- LCS  
- LIS  
- Edit Distance  

Trigger words:
- “Insert/delete/replace”
- “Minimum operations”
- “Longest increasing/longest common…”

---

#### **2. Knapsack DP**
Used for:
- Partition  
- Subset sum  
- 0/1 knapsack  

Trigger words:
- “Pick or not pick”
- “Maximize value”

---

#### **3. Grid DP**
Used for:
- Unique paths  
- Min path sum  
- Grid with obstacles  

Trigger words:
- “Start at top-left end at bottom-right”

---

#### **4. DP on digits / Strings**
Used for:
- Palindromic subsequences  
- Count ways to decode  

---

---

# 🔥 9. HEAPS & PRIORITY QUEUE PATTERNS  

### ⭐ Use a min-heap or max-heap when:
- Top K problems  
- Kth largest/smallest element  
- Merge K sorted lists  
- Frequent problems  

Trigger words:
- “Find Kth…”
- “Top K frequent”
- “Merge K arrays”

---

---

# 🎯 FINAL MASTER LIST — Identify problems instantly

| **If you see…** | **Use…** |
|------------------|-----------|
| Numbers 1…N | Cyclic Sort |
| Sorted array | Two pointers / Binary search |
| “Kth largest/smallest” | Heap |
| “Next greater/smaller” | Monotonic stack |
| “Longest substring / subarray” | Sliding window |
| “Sum equals K” | Prefix sum + HashMap |
| “Detect cycle” | Floyd’s algorithm / Union-Find |
| “Connected components” | BFS/DFS/Union-Find |
| “Shortest path” | BFS (unweighted) / Dijkstra (weighted) |
| “Insert/delete/search tree” | BST |
| “Min/max operations repeatedly” | Heap |
| “Choices + optimal” | Dynamic Programming |
| “Prerequisites / order of tasks” | Topological Sort |
| “Large constraints (10^5)” | O(n) or O(n log n) is required |

---

<h2 align="center">💡 Master these patterns and 90% of DSA problems become predictable.</h2>
