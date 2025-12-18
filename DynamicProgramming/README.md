# 📂 Dynamic Programming

# 🧠 Dynamic Programming (DP) — Complete Concept Guide + Pattern Recognition

Dynamic Programming (DP) is one of the MOST important and challenging parts of DSA.  

This file includes:
✔ DP fundamentals  
✔ How to identify DP problems  
✔ Recursion → Memoization → Tabulation sequence  
✔ State definition + transitions  
✔ Types of DP  
✔ Classic DP categories  

---

# 🟦 1. What Is Dynamic Programming?

Dynamic Programming is an optimization technique that solves complex problems by:

### ✔ Breaking them into smaller subproblems  
### ✔ Solving each subproblem once  
### ✔ Storing results to avoid recomputation  

DP = Recursion + Memory

---

# 🟩 2. Why Do We Use DP?

DP is used when:
- Subproblems overlap  
- Optimal substructure exists  
- Brute force recursion is too slow  

Examples:
- Fibonacci  
- Knapsack  
- Longest subsequence problems  
- Grid/maze problems  
- Partitioning problems  

---

# 🟥 3. How to Identify a DP Problem?

DP recognition is the MOST important skill.

Look for these keywords:

| Keyword / Clue | DP Pattern |
|----------------|------------|
| “maximum/minimum” | Optimization DP |
| “count ways” | Combinatorics DP |
| “true/false” | Boolean DP |
| “pick/don’t pick” | Subset/Knapsack |
| “longest increasing/subsequence” | LIS/LCS |
| “partition array/string” | Partition DP |
| “grid movement paths” | 2D DP |
| “min cost path” | Pathfinding DP |
| “overlapping recursion” | Memoized DP |

If recursion repeats the same subproblem → **That’s DP**.

---

# 🟧 4. Two Ways to Solve DP

DP has **two standard approaches**:

---

# 1️⃣ Top-Down (Recursion + Memoization)

You write recursion first, then use a memo array to store results.

✔ Easy to write  
✔ Good for beginners  
✔ Matches natural problem structure  

---

# 2️⃣ Bottom-Up (Tabulation)

You use a DP table and iteratively fill it.

✔ Faster  
✔ No recursion overhead  
✔ Better for interview optimization  

---

# 🟦 5. The DP Process (VERY IMPORTANT)

### Step 1️⃣ — Identify the variable(s) that define state  
Examples:
- Index  
- Sum  
- Remaining items  
- Position in grid  

---

### Step 2️⃣ — Write Recurrence Relation (Transition Formula)

Example:  
`dp[i] = dp[i-1] + dp[i-2]`

---

### Step 3️⃣ — Apply memoization or tabulation

Memoization → Add dp array + base case  
Tabulation → Fill table iteratively  

---

### Step 4️⃣ — Optimize Space (Optional but important)
Techniques:
- Store only 2 rows  
- Use rolling arrays  
- Reduce 2D → 1D if dependencies allow  

---

# 🟩 6. Types of Dynamic Programming Problems

This folder will have separate pattern files for EACH type:

---

## 🟦 A. Fibonacci / Simple Recursion DP  
Basic transition-based DP  
Examples:
- Fibonacci  
- Climbing stairs  
- Frog jump  

---

## 🟧 B. 0/1 Knapsack & Subset DP  
Problems involving **choose or skip**  
Examples:
- Subset sum  
- Partition equal subset  
- 0/1 knapsack  
- Minimum difference partition  

---

## 🟪 C. Unbounded Knapsack  
Examples:
- Coin change  
- Rod cutting  
- Unbounded knapsack itself  

---

## 🟩 D. DP on Subsequences  
Common in string/array problems:  
Examples:
- LIS (Longest Increasing Subsequence)  
- LCS (Longest Common Subsequence)  
- Edit distance  
- Longest palindromic subsequence  

---

## 🟥 E. DP on Strings  
Examples:
- Palindrome partitions  
- Minimum insertions  
- Distinct subsequences  

---

## 🟦 F. Grid DP (2D DP)  
Movement in matrix/grid:  
Examples:
- Minimum path sum  
- Unique paths  
- Paths with obstacles  
- Gold mine problem  

---

## 🟧 G. Digit DP (Advanced)  
Counting numbers with constraints on digits.  

---

## 🟪 H. Bitmask DP (Advanced)  
Used in:  
- Traveling salesman problem (TSP)  
- Maximum compatible subsets  

---

# 🟨 7. DP Problem Categories (Useful for Interview Organization)

### 🔹 Optimization DP
Maximize/minimize cost.

### 🔹 Boolean DP
Return true/false (subset sum, word break).

### 🔹 Counting DP
Count number of ways.

### 🔹 Combinatorics DP
Paths, sequences, partitions.

### 🔹 Partition DP
Split string/array to minimize cost.

### 🔹 Palindromic DP
Substrings, subsequences, partitions.

---

# 🟥 8. Visualizing DP Problems: Recursion Tree → DP Table

Most DP problems start with recursion that explodes:

```
           solve(n)
       /                \
 solve(n-1)          solve(n-2)
   /     \              /      \
...
```

DP compresses this tree into a **1D or 2D table**.

This is the key to understanding DP.

---

# 🟦 9. Common Mistakes in DP (Avoid These!)

❌ Not writing recursion first  
❌ Confusing indexes and boundaries  
❌ Forgetting base cases  
❌ Wrong transition formula  
❌ Using incorrect table size  
❌ Not analyzing overlapping subproblems  
❌ Mixing tabulation and memoization logic  

---

# 🟩 10. Patterns

```
Dynamic_Programming/
 ├── README.md
 ├── 1D-DP/
 │    ├── Fibonacci.
 │    ├── ClimbStairs
 │    ├── HouseRobber
 │    └── FrogJump
 ├── 2D-DP/
 │    ├── GridPaths
 │    ├── MinPathSum
 │    └── DPwithObstacles
 ├── Knapsack/
 │    ├── 0-1Knapsack
 │    ├── SubsetSum
 │    ├── EqualPartition
 │    └── UnboundedKnapsack
 ├── Strings-DP/
 │    ├── LCS
 │    ├── EditDistance
 │    ├── LongestPalindromicSubseq
 │    └── PalindromePartition
 ├── Subsequence-DP/
 │    ├── LIS
 │    ├── PrintLIS
 │    └── CountSubseq
 └── Advanced/
      ├── BitmaskDP
      ├── DigitDP
      └── MatrixDP
```

---

# 🟧 11. How to Practice DP Effectively

✔ ALWAYS start with recursion  
✔ Simplify the problem using smaller examples  
✔ Draw recursion tree  
✔ Identify repeating states  
✔ Convert to memoization  
✔ Convert to tabulation  
✔ Optimize space  

Mastery sequence:
```
recursion → memoization → tabulation → space optimization
```

---


