# 🌳 Trees — Complete Notes + Definitions + Patterns + Base Codes

Trees are one of the MOST important topics in Data Structures and appear in almost every interview.

This file includes:
✔ Tree basics  
✔ Binary tree structure  
✔ DFS traversals  
✔ BFS (level-order traversal)  
✔ Height, diameter  
✔ Balanced tree  
✔ Path sum  
✔ LCA

---

# 🟦 1. What Is a Tree?

A **tree** is a non-linear, hierarchical data structure.

Contains:
- **Node** (value)
- **Left child**
- **Right child**
- **Root** (top node)
- **Height** (max depth)
- **Leaf nodes** (no children)

---

# 🟩 2. Types of Trees

### ✔ Binary Tree  
Each node has ≤ 2 children.

### ✔ Binary Search Tree (BST)  
Left < root < right

### ✔ Perfect Binary Tree  
All levels completely filled.

### ✔ Full Binary Tree  
Every node has 0 or 2 children.

### ✔ Complete Binary Tree  
Every level filled except last; left aligned.

---

# 🟥 3. Pattern Recognition — When to Use Trees?

| Problem Statement | Pattern |
|------------------|---------|
| “root-to-leaf”, “path” | DFS |
| “level order”, “minimum depth” | BFS Queue |
| “balanced?”, “height?” | DFS |
| “diameter of tree” | Height + DFS |
| “LCA” | DFS |
| “sum of paths” | Recursion |
| “serialize / deserialize” | Preorder + null markers |

---

# 🟦 4. Basic Tree Node (Kunal Style)

```java
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}
```

---

# 🟧 5. Pattern 1: DFS Traversals (Recursive)

### ✔ Preorder → Root, Left, Right  
### ✔ Inorder → Left, Root, Right  
### ✔ Postorder → Left, Right, Root  

---

## 🧠 Thought Process  
Follow recursive structure:  
```
visit node
traverse left subtree
traverse right subtree
```

---

## ✅ Preorder, Inorder, Postorder Traversals

```java
public class Traversals {

    public static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
}
```

---

# 🟩 6. Pattern 2: Level Order Traversal (BFS)

## ✔ When to Use  
- Print by levels  
- Find minimum depth  
- BFS problems  

---

## 🧠 Thought Process  
Use Queue → left → right

---

## ✅ Level Order Traversal

```java
import java.util.*;

public class LevelOrder {

    public static void bfs(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            System.out.print(node.val + " ");

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }
}
```

---

# 🟥 7. Pattern 3: Height of a Tree

## ✔ Height = longest path from root to leaf  

---

## 🧠 Thought Process  
Use recursion:  
```
height = 1 + max(height(left), height(right))
```

---

## ✅ Height

```java
public class Height {

    public static int height(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
}
```

---

# 🟦 8. Pattern 4: Count Leaves

```java
public class LeafCount {

    public static int countLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        return countLeaves(root.left) + countLeaves(root.right);
    }
}
```

---

# 🟧 9. Pattern 5: Diameter of Tree (Longest Path)

## ✔ Diameter = longest path between any two nodes  

---

## 🧠 Thought Process  
At each node:
```
diameter = leftHeight + rightHeight
```

---

## ✅ Diameter

```java
public class Diameter {

    static int diameter;

    public static int findDiameter(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter;
    }

    private static int height(TreeNode root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        diameter = Math.max(diameter, lh + rh);

        return 1 + Math.max(lh, rh);
    }
}
```

---

# 🟥 10. Pattern 6: Balanced Binary Tree

## ✔ A balanced tree has:
```
|height(left) - height(right)| ≤ 1
```

---

## 🧠 Thought Process  
Compute heights bottom-up.

---

## ✅ Balanced Tree Check

```java
public class Balanced {

    public static boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }

    private static int check(TreeNode root) {
        if (root == null) return 0;

        int lh = check(root.left);
        if (lh == -1) return -1;

        int rh = check(root.right);
        if (rh == -1) return -1;

        if (Math.abs(lh - rh) > 1) return -1;

        return 1 + Math.max(lh, rh);
    }
}
```

---

# 🟧 11. Pattern 7: Root-to-Leaf Path Sum

## ✔ When to Use  
- “path sum exists?”  
- “sum of paths”  

---

## 🧠 Thought Process  
Subtract value from sum → go left & right.

---

## ✅ Path Sum

```java
public class PathSum {

    public static boolean hasPath(TreeNode root, int target) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return target == root.val;
        }

        return hasPath(root.left, target - root.val)
            || hasPath(root.right, target - root.val);
    }
}
```

---

# 🟥 12. Pattern 8: Lowest Common Ancestor (LCA)

## ✔ Used In  
- Ancestor queries  
- Path-related questions  

---

## 🧠 Thought Process  
If both values lie in different subtrees → current node is LCA.

---

## ✅ LCA in Binary Tree

```java
public class LCA {

    public static TreeNode lca(TreeNode root, int p, int q) {
        if (root == null) return null;

        if (root.val == p || root.val == q) return root;

        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);

        if (left != null && right != null) return root;

        return (left != null) ? left : right;
    }
}
```

---

# 🟩 13. Pattern 9: Maximum Depth (Same as Height)

```java
public class MaxDepth {

    public static int depth(TreeNode root) {
        if (root == null) return 0;

        int left = depth(root.left);
        int right = depth(root.right);

        return 1 + Math.max(left, right);
    }
}
```

---

# 🟧 14. Pattern 10: Tree Traversals (Iterative)

### ✔ Inorder Iterative

```java
import java.util.*;

public class InorderIterative {

    public static void inorder(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();

        while (root != null || !st.isEmpty()) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }

            root = st.pop();
            System.out.print(root.val + " ");
            root = root.right;
        }
    }
}
```

---

# 🎯 FINAL SUMMARY

You now have complete Tree notes including:
✔ DFS / BFS  
✔ Height, leaves, diameter  
✔ Balanced tree  
✔ Path sum  
✔ LCA  
✔ Iterative traversals  


