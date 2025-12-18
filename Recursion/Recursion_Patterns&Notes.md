# 🔁 Recursion — Complete Notes + Definitions + Pattern Recognition + Base Codes

Recursion is one of the MOST important topics in DSA.  
It appears in every major category: Arrays, Strings, Trees, Graphs, Backtracking, DP.

This file includes:
✔ What recursion is  
✔ Base case & recursive case  
✔ Recursion tree intuition  
✔ Pattern recognition  
✔ Tail recursion  
✔ Array recursion  
✔ String recursion  
✔ Backtracking patterns  
✔ Subsets & permutations  


---

# 🟦 1. What Is Recursion?

Recursion is a method where a function calls itself to solve smaller versions of the same problem.

Every recursive problem has two essential parts:

### ✔ Base Case  
The stopping point of recursion.

### ✔ Recursive Case  
Where the function reduces the problem and calls itself again.

---

# 🟩 2. Why Use Recursion?

Recursion is useful when:
- A problem can be broken into smaller identical subproblems  
- There's branching (choices per step)  
- Tree/graph traversal  
- Backtracking (N-Queens, Sudoku, subsets)  
- Divide & Conquer (Merge Sort, Quick Sort)

---

# 🟥 3. Pattern Recognition — How to Identify Recursion Problems

Look for keywords:

| Keywords | Pattern |
|----------|----------|
| "all possible…", "generate" | Backtracking |
| "subsets", "permutations" | Recursion tree |
| "divide array in half" | Divide & Conquer |
| "root-to-leaf", "paths" | Tree recursion |
| "repeated structure" | Recursion |
| "choices per level" | Backtracking |
| “return true/false if…” | DFS recursion |

If solving a smaller version of the same problem makes things easier → **it’s recursion.**

---

# 🌳 4. Recursion Tree Intuition (VERY IMPORTANT)

Every recursion can be visualized as a tree:

```
solve(n)
 ├── solve(n-1)
 │     ├── solve(n-2)
 │     └── solve(n-2)
 └── solve(n-1)
       ├── solve(n-2)
       └── solve(n-2)
```

This helps understand:
✔ Time complexity  
✔ Flow of recursive calls  
✔ Backtracking structure  

---

# 🧱 5. Standard Recursion Template

```java
public static void solve(int n) {
    // Base case
    if (n == 0) return;

    // Work before recursion
    System.out.println(n);

    // Recursive call
    solve(n - 1);

    // Work after recursion
}
```

---

# 🟦 6. Pattern 1: Basic Recursion (Number Problems)

### ✔ Print numbers from n → 1  
### ✔ Print numbers from 1 → n  
### ✔ Factorial  
### ✔ Sum of digits  

---

## 🧠 Thought Process
Reduce the problem until reaching smallest valid input.

---

## ✅ Print Numbers 1 to N (Forward Recursion)

```java
public static void print1toN(int n) {
    if (n == 0) return;
    print1toN(n - 1);
    System.out.println(n);
}
```

---

## ✅ Print Numbers N to 1 (Backward Recursion)

```java
public static void printNto1(int n) {
    if (n == 0) return;
    System.out.println(n);
    printNto1(n - 1);
}
```

---

## ✅ Factorial (n!)

```java
public static int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
```

---

# 🟧 7. Pattern 2: Recursion on Arrays

## ✔ Check sorted  
## ✔ Linear search  
## ✔ Find all occurrences  

---

## 🧠 Thought Process
Check first element → recursively check the rest.

---

## ✅ Check if Array Is Sorted

```java
public static boolean isSorted(int[] arr, int index) {
    if (index == arr.length - 1) return true;
    return arr[index] <= arr[index + 1] && isSorted(arr, index + 1);
}
```

---

## ✅ Linear Search with Recursion

```java
public static int search(int[] arr, int target, int index) {
    if (index == arr.length) return -1;
    if (arr[index] == target) return index;
    return search(arr, target, index + 1);
}
```

---

# 🟥 8. Pattern 3: Recursion on Strings

### ✔ Remove character  
### ✔ Reverse string  
### ✔ Skip substring  

---

## 🧠 Thought Process
Solve for first character → recursively solve remainder.

---

## ✅ Reverse a String

```java
public static String reverse(String s) {
    if (s.isEmpty()) return "";
    return reverse(s.substring(1)) + s.charAt(0);
}
```

---

## ✅ Remove all occurrences of a character

```java
public static String removeChar(String s, char ch) {
    if (s.isEmpty()) return "";
    char first = s.charAt(0);
    String rest = removeChar(s.substring(1), ch);
    return (first == ch) ? rest : first + rest;
}
```

---

# 🟦 9. Pattern 4: Subsequence Pattern (VERY IMPORTANT)

Used for:
- Subsets  
- Subsequences  
- Combinations  

**Recursion Tree:**
Each character has 2 choices:

```
include OR exclude
```

---

## ✅ Subsequence Generation

```java
public static void subseq(String processed, String unprocessed) {
    if (unprocessed.isEmpty()) {
        System.out.println(processed);
        return;
    }

    char ch = unprocessed.charAt(0);

    // include
    subseq(processed + ch, unprocessed.substring(1));

    // exclude
    subseq(processed, unprocessed.substring(1));
}
```

---

# 🟩 10. Pattern 5: Permutations

Factorial-time recursion (n!).

For "abc":
```
a_bc
 _abc
 b_ac
 c_ab
```

---

## 🧠 Thought Process  
Insert current character into every position of processed string.

---

## ✅ Permutations (Strings)

```java
public static List<String> permutations(String s) {
    List<String> result = new ArrayList<>();
    permute("", s, result);
    return result;
}

private static void permute(String p, String up, List<String> res) {
    if (up.isEmpty()) {
        res.add(p);
        return;
    }

    char ch = up.charAt(0);

    for (int i = 0; i <= p.length(); i++) {
        String start = p.substring(0, i);
        String end = p.substring(i);
        permute(start + ch + end, up.substring(1), res);
    }
}
```

---

# 🟥 11. Pattern 6: Backtracking

Used for:
- N-Queens  
- Sudoku  
- Maze pathfinding  
- Subsets with conditions  
- Combinational search problems  

---

## 🧠 Backtracking Template

```
1. Choose option
2. Explore
3. Undo choice
```

---

## ⭐ Example: Rat in a Maze (DFS + Backtracking)

```java
public static void maze(int r, int c, boolean[][] maze, String path) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
        System.out.println(path);
        return;
    }

    if (!maze[r][c]) return;

    maze[r][c] = false; // mark visited

    if (r < maze.length - 1) maze(r + 1, c, maze, path + 'D');
    if (c < maze[0].length - 1) maze(r, c + 1, maze, path + 'R');
    if (r > 0) maze(r - 1, c, maze, path + 'U');
    if (c > 0) maze(r, c - 1, maze, path + 'L');

    maze[r][c] = true; // backtrack
}
```

---

# 🟪 12. Pattern 7: Subset Pattern (Power Set)

### ✔ Very frequently asked  
### ✔ Same as include/exclude but applied to arrays  

---

## ✅ Subset Generation

```java
public static List<List<Integer>> subsets(int[] arr) {
    List<List<Integer>> ans = new ArrayList<>();
    generate(arr, 0, new ArrayList<>(), ans);
    return ans;
}

private static void generate(int[] arr, int index, List<Integer> ds, List<List<Integer>> ans) {
    if (index == arr.length) {
        ans.add(new ArrayList<>(ds));
        return;
    }

    // include
    ds.add(arr[index]);
    generate(arr, index + 1, ds, ans);

    // exclude
    ds.remove(ds.size() - 1);
    generate(arr, index + 1, ds, ans);
}
```

---

# 🟥 13. Pattern 8: N-Queens (Classic Backtracking)

### ✔ Place N queens on NxN board such that no two queens attack each other.

---

## 🧠 Thought Process
Try placing queens row by row.

---

## ✅ N-Queens Template

```java
public static boolean isSafe(char[][] board, int r, int c) {
    // check column
    for (int i = 0; i < r; i++) {
        if (board[i][c] == 'Q') return false;
    }

    // diag left
    for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 'Q') return false;
    }

    // diag right
    for (int i = r - 1, j = c + 1; i >= 0 && j < board.length; i--, j++) {
        if (board[i][j] == 'Q') return false;
    }

    return true;
}

public static void solveNQueens(char[][] board, int row) {
    if (row == board.length) {
        for (char[] r : board) System.out.println(Arrays.toString(r));
        System.out.println();
        return;
    }

    for (int col = 0; col < board.length; col++) {
        if (isSafe(board, row, col)) {
            board[row][col] = 'Q';
            solveNQueens(board, row + 1);
            board[row][col] = '.'; // backtrack
        }
    }
}
```

---

# 🟦 14. Pattern 9: Recursion + DP (Memoization)

Recursion + memoization = Dynamic Programming.

### ✔ Fibonacci with Memoization

```java
public static int fib(int n, int[] dp) {
    if (n <= 1) return n;

    if (dp[n] != -1) return dp[n];

    return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
}
```

---

# 🎯 FINAL SUMMARY

You now have complete recursion notes including:
✔ Core recursion principles  
✔ Base + recursive case  
✔ Recursion tree diagrams  
✔ Subsequence pattern  
✔ Permutation pattern  
✔ Backtracking pattern  
✔ Maze solving  
✔ Subsets  
✔ N-Queens  
✔ Array + String recursion  


Fully GitHub-ready.

