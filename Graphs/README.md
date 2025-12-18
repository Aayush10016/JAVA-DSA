# 📂 Graphs

# 🌐 Graphs — Complete Guide (Concepts + Pattern Recognition + Real Interview Patterns)

Graphs are one of the most powerful and widely used data structures in computer science.  
They model real-world systems such as maps, social networks, communication systems, dependency systems, and more.

This file includes:
✔ Graph fundamentals  
✔ Types of graphs  
✔ BFS, DFS, Cycle Detection  
✔ Shortest path algorithms  
✔ Topological sorting  
✔ Union-Find (DSU)  
✔ Graph pattern recognition  
✔ Recommended folder structure  

---

# 🟦 1. What Is a Graph?

A **graph** is a collection of:
- **Nodes (vertices)**  
- **Edges (connections between nodes)**  

Graphs can represent relationships, dependencies, or connections between entities.

---

# 🟩 2. Types of Graphs

### ✔ Based on Edges
- **Undirected** (roads, friendships)  
- **Directed (Digraph)** (links, dependencies)  

### ✔ Based on Weights
- **Weighted** (paths with cost)  
- **Unweighted** (simple connections)  

### ✔ Based on Cycles
- **Cyclic**
- **Acyclic (DAG)**

### ✔ Based on Density
- **Sparse** (few edges, adjacency list preferred)
- **Dense** (many edges, adjacency matrix preferred)

---

# 🟥 3. Graph Representations

### ✔ Adjacency List
Most popular for competitive programming.

### ✔ Adjacency Matrix
Used for dense graphs or Floyd–Warshall.

### ✔ Edge List
Used in algorithms like Kruskal’s.

---

# 🟨 4. When to Use Graphs?

If the problem involves:
✔ Connections  
✔ Dependencies  
✔ "Paths"  
✔ "Routes"  
✔ "Reachability"  
✔ "Shortest distance"  
✔ "Components"  

→ It is almost certainly a graph problem.

---

# 🟦 5. Graph Pattern Recognition (Very Important!)

| Problem Keyword | Graph Technique |
|------------------|-------------------|
| “find if reachable” | BFS / DFS |
| “connected components” | DFS / BFS / Union-Find |
| “contains cycle?” | DFS cycle-detection |
| “shortest path” | BFS (unweighted) / Dijkstra (weighted) |
| “minimum spanning tree” | Kruskal / Prim |
| “topological order” | Kahn’s BFS or DFS |
| “course schedule / dependencies” | Topological sort (DAG only) |
| “detect bipartite graph” | BFS coloring |
| “flood fill” | BFS / DFS |
| “friend circles / provinces” | Union-Find or DFS |

Graph problems almost always fall into one of these categories.

---

# 🟧 6. Fundamental Graph Traversals

These are the base of all graph algorithms.

---

## 1️⃣ BFS — Breadth First Search  
Level-by-level traversal.  
Used for:
✔ Unweighted shortest path  
✔ Level processing  
✔ Checking bipartite  
✔ Tree/graph traversal  

---

## 2️⃣ DFS — Depth First Search  
Recursive/stack-based traversal.  
Used for:
✔ Cycle detection  
✔ Topological sort  
✔ Connected components  
✔ Backtracking on graphs  

---

# 🟪 7. Classic Graph Patterns


---

## 🟦 A. Cycle Detection  
### ✔ Directed graph → DFS with recursion stack  
### ✔ Undirected graph → DFS + parent check  
Used for:
- Course scheduling  
- Dependency resolution  
- Infinite loops in graphs  

---

## 🟧 B. Topological Sort (DAG Only)  
Two methods:
- DFS  
- BFS (Kahn’s Algorithm)

Used when:
- “Course schedule”  
- “Order of tasks”  
- “Prerequisites”  

---

## 🟩 C. Connected Components  
Used for:
- Grouping nodes  
- Provinces / Friend circles  
- Clusters in networks  

Implementable using:
- DFS  
- BFS  
- Union-Find (DSU)  

---

## 🟥 D. Shortest Path Problems

### ✔ BFS → Unweighted shortest path  
### ✔ Dijkstra → Weighted shortest path without negative edges  
### ✔ Bellman-Ford → Negative weights allowed  
### ✔ Floyd–Warshall → All-pairs shortest paths  
### ✔ 0-1 BFS → Graphs with weights 0 or 1  
### ✔ Multi-source BFS → BFS from multiple starting nodes  

Problems include:
- Minimum steps  
- Path with least cost  
- Network delays  
- Grid shortest paths  

---

## 🟪 E. Minimum Spanning Tree (MST)  
Used in network design problems.

Two algorithms:
- **Kruskal (Uses Union-Find)**  
- **Prim (Uses Priority Queue)**  

---

## 🟫 F. Bipartite Graph Check  
Used for:
- Graph coloring  
- Odd-cycle detection  
- Many two-set scheduling problems  

Technique:
- BFS with 2-coloring  
- DFS with coloring  

---

## 🟦 G. Flood Fill (Graph on Grid)  
Used in:
- Image processing  
- Number of islands  
- Surrounded regions  

Graph is represented as:
```
matrix[row][col]
```
Edges exist between adjacent cells.

---

# 🚩 8. Advanced Graph Topics (Optional but Useful)

### ✔ Bridges & Articulation Points  
Used for finding vulnerable points in networks.

### ✔ Strongly Connected Components (SCC)  
Algorithms:
- Kosaraju  
- Tarjan  

### ✔ Eulerian Path / Circuit  
Used in:
- Route design  
- Hierholzer’s algorithm  

### ✔ Graph Compression & BFS on states  
Used for:
- Hard LeetCode DP → Graph conversions  
- BFS on bitmask states  

---

# 📁 9. Types

```
Graphs/
 ├── README.md  
 ├── Traversals/
 │    ├── BFS  
 │    ├── DFS  
 ├── CycleDetection/
 │    ├── Undirected  
 │    └── Directed  
 ├── ShortestPaths/
 │    ├── BFSShortestPath  
 │    ├── Dijkstra  
 │    ├── BellmanFord  
 │    └── FloydWarshall  
 ├── TopologicalSort/
 │    ├── DFS  
 │    └── KahnsAlgorithm  
 ├── MST/
 │    ├── Kruskal  
 │    ├── Prim  
 ├── UnionFind/
 │    ├── Basics  
 │    └── Applications  
 ├── GridGraphs/
 │    ├── FloodFill  
 │    ├── NumberOfIslands  
 └── Advanced/
      ├── SCC  
      ├── Bridges  
      └── ArticulationPoints  
```

---

# 🎯 10. How to Think in Graph Problems

When stuck, ask:

### ✔ What represents the nodes?  
### ✔ What represents the edges?  
### ✔ Directed or undirected?  
### ✔ Weighted or unweighted?  
### ✔ Is it asking for:  
- reachability? → BFS/DFS  
- dependencies? → Topological Sort  
- shortest path? → BFS / Dijkstra  
- grouping? → Components or Union-Find  
- cycle detection? → DFS cycle algorithms  

Once you categorize the problem, the solution becomes clear.

---



