# 📂 Trees

# 🌳 Trees — Complete Guide (Concepts + Pattern Recognition + Interview Patterns)

A **Tree** is a hierarchical data structure with a root and children nodes.  
Trees form the basis of many advanced structures:
✔ Binary Trees  
✔ Binary Search Trees (BST)  
✔ AVL Trees  
✔ Heaps  
✔ Tries  
✔ Segment Trees  
✔ Sparse Trees  

Tree problems heavily test recursion, DFS/BFS thinking, and structural patterns.

This folder includes:
✔ Tree fundamentals  
✔ Types of trees  
✔ Inorder/Preorder/Postorder traversals  
✔ Binary Search Tree properties  
✔ Height, depth, diameter  
✔ Boundary/zigzag/level order traversals  
✔ LCA, subtree problems  
✔ Recommended folder structure  

---

# 🟦 1. What Is a Tree?

A **tree** is a non-linear data structure with nodes connected through edges.

Each node has:
- a value  
- left child  
- right child (for binary tree)  

Example:

```
        1
       / \
      2   3
     / \
    4   5
```

---

# 🟩 2. Why Do We Use Trees?

Trees are used when:
✔ hierarchical data is involved  
✔ fast searching/insertion needed (BST)  
✔ dynamic data structures (heap, trie)  
✔ recursion-based problems  
✔ representing file systems, DOM, NLP parse trees  

Trees form the core of nearly every advanced algorithm.

---

# 🟥 3. Types of Trees

### ✔ Binary Tree  
Each node has at most 2 children.

### ✔ Binary Search Tree (BST)  
Left child < root < right child  
Used for:
- fast search  
- fast insertion  
- range queries  

### ✔ AVL / Red-Black Trees  
Self-balancing trees.

### ✔ Complete & Full Trees  
Specific structure constraints.

### ✔ Heap  
A complete binary tree used for priority queues.

### ✔ Trie  
Tree for strings/prefix queries.

---

# 🟧 4. Depth, Height & Levels

### ✔ Depth  
Distance from root to node.

### ✔ Height  
Longest path from node to leaf.

### ✔ Levels  
Layer of nodes in BFS.

Understanding these helps solve:
- diameter  
- balanced tree  
- LCA problems  

---

# 🟨 5. Fundamental Tree Traversals

### A. DFS Traversals (Depth-First)

#### ✔ Preorder (Root → Left → Right)  
Used for:  
- constructing trees  
- prefix expression  

#### ✔ Inorder (Left → Root → Right)  
**Only works for sorted traversal of a BST.**

#### ✔ Postorder (Left → Right → Root)  
Used for:  
- deleting tree  
- subtree building  
- evaluating expressions  

---

### B. BFS Traversal (Level Order)

Used for:
- shortest path in trees  
- zigzag traversal  
- vertical/horizontal views  

Level order uses a **queue**.

---

# 🟦 6. Pattern Recognition — When to Use Which Tree Technique?

| Problem Keyword | Use Technique |
|-----------------|---------------|
| “root to leaf” | DFS |
| “path sum” | DFS recursion |
| “level by level” | BFS |
| “zigzag / vertical order” | BFS + map |
| “sorted array → BST” | Inorder properties |
| “find kth smallest/largest” | BST inorder |
| “balanced tree” | recursion + height |
| “lowest common ancestor” | DFS backtracking |
| “diameter / max depth” | DFS with heights |
| “is subtree” | DFS + matching |

If recursion naturally fits → **DFS**.  
If problem speaks of *levels* → **BFS**.

---

# 🟪 7. Key Tree Patterns 

---

## 🟧 A. DFS Structural Problems  
✔ Max depth  
✔ Diameter  
✔ Symmetric tree  
✔ Balanced tree  
✔ Sum tree  
✔ Count nodes  
✔ Leaf-related problems  

---

## 🟦 B. Root-to-Leaf Path Problems  
✔ Path sum  
✔ All root-to-leaf paths  
✔ Max/min path sum  
✔ Path sum II (lists of valid paths)  

---

## 🟥 C. BST (Binary Search Tree) Patterns  
Used for:
- search  
- insertion  
- deletion  
- find successor/predecessor  
- kth smallest  
- kth largest  
- lowest common ancestor in BST  

Inorder traversal gives sorted sequence.

---

## 🟨 D. Tree Views  
✔ Left view  
✔ Right view  
✔ Top view  
✔ Bottom view  
✔ Vertical order  

Often use BFS + hashing on column index.

---

## 🟫 E. Tree + HashMap Patterns  
✔ Most frequent subtree sum  
✔ Duplicate subtrees  
✔ Serialization/deserialization  

Maps store structural patterns.

---

## 🟩 F. LCA (Lowest Common Ancestor)  
Important for:
- subtree relationships  
- common ancestor queries  
- graph-like tree questions  

---

## 🟧 G. Iterative Traversals (Stack-Based)  
✔ iterative inorder  
✔ iterative preorder  
✔ iterative postorder  

Useful when recursion depth is too large.

---

# 🟦 8. Real Interview Problem Categories

### 🌱 Simple Tree Problems  
- Preorder / inorder / postorder  
- Height of tree  
- Count nodes  
- Check balanced  

### 🌳 Medium Tree Problems  
- LCA  
- Boundary traversal  
- Zigzag order  
- Vertical order  
- Symmetric tree  
- Path sum variants  
- Subtree check  

### 🌲 Hard Tree Problems  
- Maximum path sum  
- Recover BST  
- Serialize/deserialize tree  
- Count complete tree nodes (log n solution)  
- Construct binary tree from inorder & preorder/postorder  

---

# 🟧 9. Types

```
Trees/
 ├── README 
 ├── Traversals/
 │    ├── Preorder 
 │    ├── Inorder 
 │    ├── Postorder 
 │    ├── LevelOrder 
 │    └── Iterative 
 ├── Properties/
 │    ├── Height 
 │    ├── Diameter 
 │    ├── BalancedTree 
 │    └── SymmetricTree 
 ├── RootToLeaf/
 │    ├── PathSum 
 │    ├── AllPaths 
 │    └── PathSumII 
 ├── BST/
 │    ├── SearchBST 
 │    ├── InsertBST 
 │    ├── DeleteBST 
 │    ├── KthSmallest 
 │    └── BSTSuccessorPredecessor 
 ├── Views/
 │    ├── LeftView 
 │    ├── RightView 
 │    ├── TopView 
 │    └── VerticalOrder 
 ├── Advanced/
 │    ├── SerializeDeserialize 
 │    ├── DuplicateSubtrees 
 │    └── RecoverBST 
 └── Practice/
```

---

# 🟫 10. Time Complexity Summary

| Operation | Binary Tree | BST (Balanced) |
|----------|--------------|----------------|
| Search | O(n) | O(log n) |
| Insert | O(n) | O(log n) |
| Delete | O(n) | O(log n) |
| Traversal | O(n) | O(n) |

Height of balanced BST ≈ log n  
Height of skewed BST = n

---

# 🎯 11. Tips to Master Tree Problems

✔ Always visualize tree diagrams  
✔ Recursion is the strongest tool — learn its patterns  
✔ Understand BST properties deeply  
✔ Practice DFS + BFS equally  
✔ Learn iterative traversals  
✔ Solve classic problems (diameter, LCA, max path sum)  
✔ For view problems → use BFS + column index  
✔ For subtree problems → use hashing/serialization  

---
