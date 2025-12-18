# 📘 Dynamic Programming (DP) — Full Notes + Definitions + Pattern Recognition + Base Codes

Dynamic Programming (DP) is one of the most important DSA topics.  
Every medium/hard interview problem is either **DP**, **Greedy**, or **Graph**.

These notes give:  
✔ DP definitions  
✔ Pattern recognition  
✔ How to think DP  
✔ Recursion → Memoization → Tabulation transitions  


---

# 🟦 1. What Is Dynamic Programming?

Dynamic Programming is a technique used to solve problems by breaking them into **overlapping subproblems** and saving solutions to avoid repeated computation.

### ✔ DP applies when:
- There are overlapping subproblems  
- The problem has optimal substructure  
- A recursive solution repeats work  
- You can store results in a dp array/map  

---

# 🟩 2. Two Major Approaches in DP

### ⭐ **1. Memoization (Top-Down DP)**
- Write recursive solution  
- Store answer in dp array  
- Reuse stored values  
- Easy to think  

### ⭐ **2. Tabulation (Bottom-Up DP)**
- Build dp table iteratively  
- No recursion  
- Usually more optimized  

---

# 🟥 3. How to Recognize a DP Problem

Look for these patterns:

| Hint | Pattern |
|------|---------|
| “maximum/minimum” | DP |
| “count the number of ways” | DP |
| "choices", “pick or skip” | DP |
| “subsequence” | DP |
| “partition/knapsack” | DP |
| “break into pieces” | DP |
| “longest / shortest” | DP |
| “optimal cost” | DP + Greedy or DP + Recursion |

### 💡 Golden Rule  
If you see **multiple choices at each step**, it's DP or Backtracking.

---

# 🟦 4. How to Think in DP 

### Step 1 → **Write a recursive solution**  
Base cases + recurrence relation.

### Step 2 → **See overlapping subproblems**  
Same function is called repeatedly → DP is needed.

### Step 3 → **Add dp array (memoization)**  
Prevent re-computation.

### Step 4 → **Convert to tabulation** (optional)  
Faster + avoids recursion stack.

---

# 🟨 5. Types of DP Problems (Very Important)

### ✔ 1. **Fibonacci / Climbing Stairs Type**  
One dimension DP → dp[i] depends on dp[i-1], dp[i-2]

### ✔ 2. **Knapsack Type**  
Choice of pick/not pick → recursion → DP

### ✔ 3. **Subsequence / Strings DP**  
LCS, LIS, edit distance, DP on sequences

### ✔ 4. **Partition DP**  
Cutting rod, palindrome partition

### ✔ 5. **Grid DP**  
Paths in grid → move down/right → obstacles

### ✔ 6. **DP on Trees / Graphs**  
DFS + DP  

---

# 🟩 6. Pattern 1: Fibonacci / Climbing Stairs

## ✔ Definition
Problems where the answer depends on previous 1–2 states.

---

## 🧠 Thought Process
- Identify recurrence: `f(n) = f(n-1) + f(n-2)`  
- Memoize or tabulate  

---

## ✅ Base Code: Fibonacci (Memoization)

```java
public class FibonacciMemo {

    static int[] dp;

    public static int fib(int n) {
        if (n < 2) return n;

        if (dp[n] != -1) return dp[n];

        dp[n] = fib(n-1) + fib(n-2);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fib(n));
    }
}
```
✅ Base Code: Fibonacci (Tabulation)
```java

public class FibonacciTab {

    public static int fib(int n) {
        int[] dp = new int[n+1];

        dp[0] = 0;
        if (n >= 1) dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
```
🟥 7. Pattern 2: Knapsack (Pick or Skip)
✔ Definition
Choice-based DP:

-At each index:

-Pick item

-Don’t pick item

-Classic recurrence:

```sql

maxValue = max(
  pick,
  skip
)
```
🧠 Thought Process
-Whenever the problem says:

-“pick or skip”

-“take or don't take”
→ It’s knapsack-style DP.

✅ Base Code: 0/1 Knapsack (Memoization)
```java

public class KnapsackMemo {

    static int[][] dp;

    public static int solve(int idx, int capacity, int[] weights, int[] values) {
        if (idx == weights.length) return 0;
        if (dp[idx][capacity] != -1) return dp[idx][capacity];

        int skip = solve(idx + 1, capacity, weights, values);

        int pick = 0;
        if (weights[idx] <= capacity) {
            pick = values[idx] + solve(idx + 1, capacity - weights[idx], weights, values);
        }

        return dp[idx][capacity] = Math.max(pick, skip);
    }
}
```
🟦 8. Pattern 3: Subsequence DP (LCS, LIS)
✔ Definition
-DP on sequences:

-Longest Increasing Subsequence (LIS)

-Longest Common Subsequence (LCS)

-Edit distance

🧠 Thought Process
-State usually defined as:

```powershell

dp[i][j] = answer using s1[0..i] and s2[0..j]
```
✅ Base Code: LCS (Tabulation)
```java

public class LCS {

    public static int lcs(String a, String b) {
        int n = a.length(), m = b.length();
        int[][] dp = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } 
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }
}
```
🟩 9. Pattern 4: LIS (Longest Increasing Subsequence)
✔ Definition
DP problem where:

```perl

dp[i] = LIS ending at index i
```
🧠 Thought Process
Traverse array:

-For each element, check previous smaller ones

-Build LIS

✅ Base Code: LIS (O(n²) DP)
```java

public class LIS {

    public static int lis(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int max = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
```
🟦 10. Pattern 5: Grid DP
✔ Definition
-Move inside a grid → usually right or down.

🧠 Thought Process
DP State:

```pgsql

dp[i][j] = ways or cost to reach (i, j)
```
✅ Base Code: Unique Paths (Tabulation)
```java

public class GridDP {

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}
```
🟥 11. Pattern 6: Partition DP (Rod Cutting / Palindrome Partition)
✔ Definition
Problem requires partitioning:

-Cut rod

-Partition string

🧠 Thought Process
-Try all partitions:

```pgsql

for (cut = 1 to n):
    pick best partition
```
✅ Base Code: Minimum Cost to Cut Rod (Structure Only)
```java

public class RodCutting {

    static int[] dp;

    public static int cut(int n, int[] prices) {
        if (n == 0) return 0;

        if (dp[n] != -1) return dp[n];

        int max = 0;

        for (int cut = 1; cut <= n; cut++) {
            max = Math.max(max, prices[cut] + cut(n - cut, prices));
        }

        return dp[n] = max;
    }
}
```
🟧 12. Pattern 7: DP on Trees / Graphs
✔ Definition
-Combine DP with DFS:

-Every subtree returns info

-Use for tree diameter, max path sum

🧠 Thought Process
Build recurrence per node:

```sql
Copy code
ans = max(left, right) + node.val
```
🟪 13.  DP Template (Universal)
Use this whenever you start a DP problem:

```java

static int[] dp;

static int solve(int n) {
    if (n <= 1) return n;

    if (dp[n] != -1) return dp[n];

    return dp[n] = solve(n-1) + solve(n-2);  // modify according to recurrence
}
```
