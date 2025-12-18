# 📘 Graphs — Complete Notes + Definitions + Pattern Recognition + Base Codes

Graphs are one of the most powerful topics in DSA and appear frequently in interviews.

These notes cover:
✔ Graph definitions  
✔ Types  
✔ BFS / DFS  
✔ Cycle detection  
✔ Topological sort  
✔ Shortest paths (BFS & Dijkstra)  
✔ Minimum Spanning Tree (Kruskal)  
✔ Connected components  

---

# 🟦 1. What is a Graph?

A **graph** consists of:
- Nodes (vertices)
- Edges (connections between nodes)

Graphs model relationships such as roads, networks, dependencies, friends, and more.

---

# 🟩 2. Types of Graphs

### ✔ By direction
- **Undirected**
- **Directed (DAG)**

### ✔ By weight
- **Weighted**
- **Unweighted**

### ✔ By structure
- **Cyclic**
- **Acyclic**

---

# 🟦 3. Graph Representations

### ✔ Adjacency List (preferred)
```java
ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
```

### ✔ Adjacency Matrix
```java
int[][] matrix = new int[n][n];
```

---

# 🟧 4. Pattern Recognition: How to Identify Graph Problems

| Problem Phrase | Use |
|----------------|-----|
| "reachable", "path exists" | BFS / DFS |
| "shortest path" | BFS or Dijkstra |
| "cycle exists" | DFS/BFS |
| "order tasks", "dependencies" | Topological Sort |
| "connect all nodes minimally" | MST (Prim/Kruskal) |
| "count groups", "islands" | DFS/BFS |

---

# 🟥 5. Pattern 1 — BFS (Level Order Traversal)

## ✔ When to Use
- Shortest path in **unweighted** graph
- Checking reachability
- Level-by-level processing

---

## 🧠 Thought Process
1. Use queue  
2. Start from source  
3. Mark visited  
4. Push neighbors  

---

## ✅ BFS Code 
```java
import java.util.*;

public class BFS {

    public static void bfs(int start, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
```

---

# 🟦 6. Pattern 2 — DFS (Depth First Search)

## ✔ When to Use
- Explore deeply
- Connected components
- Cycle detection
- Recursion-based problems

---

## 🧠 Thought Process
- Visit node  
- Visit neighbors recursively  
- Backtrack  

---

## ✅ DFS Code 
```java
public class DFS {

    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }
}
```

---

# 🟥 7. Pattern 3 — Cycle Detection

## ✔ Undirected Graph Cycle
Back-edge detection where a visited neighbor is NOT the parent.

---

## ✅ Cycle Detection (Undirected)
```java
public class CycleUndirected {

    public static boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited, adj)) return true;
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
}
```

---

## ✔ Directed Graph Cycle
Use recursion stack:
- visited[]
- path[]

---

## ✅ Cycle Detection (Directed)
```java
public class CycleDirected {

    public static boolean dfs(int node, boolean[] visited, boolean[] path, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        path[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, visited, path, adj)) return true;
            } else if (path[neighbor]) {
                return true;
            }
        }

        path[node] = false;
        return false;
    }
}
```

---

# 🟥 8. Pattern 4 — Topological Sort (DAG Only)

## ✔ Used For:
- Task scheduling
- Build systems
- Dependency resolution

---

## 🧠 Thought Process
Use indegree + queue = Kahn’s Algorithm.

---

## ✅ Topological Sort (Kahn’s Algorithm)
```java
public class TopologicalSort {

    public static void topo(int n, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) q.add(neighbor);
            }
        }
    }
}
```

---

# 🟦 9. Pattern 5 — Shortest Path in Unweighted Graph

Use BFS.

---

## 🧠 Thought Process
Each edge cost = 1  
→ BFS automatically gives shortest distance.

---

## ✅ Shortest Path (Unweighted Graph)
```java
public class ShortestPathUnweighted {

    public static int[] shortest(int start, ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        int[] dist = new int[n];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        dist[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neighbor : adj.get(node)) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[node] + 1;
                    q.add(neighbor);
                }
            }
        }

        return dist;
    }
}
```

---

# 🟧 10. Pattern 6 — Dijkstra (Weighted Graphs)

## ✔ Used For:
- Positive weighted edges
- Shortest path

---

## 🧠 Thought Process
Use:
- Priority queue
- Relax edges

---

## ✅ Dijkstra’s Algorithm 
```java
import java.util.*;

public class Dijkstra {

    static class Pair {
        int node, dist;
        Pair(int n, int d) { node = n; dist = d; }
    }

    public static int[] dijkstra(int n, ArrayList<ArrayList<int[]>> adj, int start) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        dist[start] = 0;
        pq.add(new Pair(start, 0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int node = cur.node;

            for (int[] edge : adj.get(node)) {
                int neighbor = edge[0];
                int weight = edge[1];

                if (dist[node] + weight < dist[neighbor]) {
                    dist[neighbor] = dist[node] + weight;
                    pq.add(new Pair(neighbor, dist[neighbor]));
                }
            }
        }

        return dist;
    }
}
```

---

# 🟥 11. Pattern 7 — Minimum Spanning Tree (Kruskal)

## ✔ Goal:
Connect all nodes with minimum cost.

---

## 🧠 Thought Process
Sort edges by weight → Union-Find → Add smallest safe edge.

---

## ✅ Kruskal’s MST (Union-Find)
```java
import java.util.*;

public class Kruskal {

    static int find(int x, int[] parent) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x], parent);
    }

    static void union(int a, int b, int[] parent, int[] rank) {
        a = find(a, parent);
        b = find(b, parent);
        if (a != b) {
            if (rank[a] < rank[b]) parent[a] = b;
            else if (rank[b] < rank[a]) parent[b] = a;
            else {
                parent[b] = a;
                rank[a]++;
            }
        }
    }

    public static int mst(int n, int[][] edges) {
        Arrays.sort(edges, (a, b) -> a[2] - b[2]);

        int[] parent = new int[n];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;

        int cost = 0;

        for (int[] e : edges) {
            if (find(e[0], parent) != find(e[1], parent)) {
                union(e[0], e[1], parent, rank);
                cost += e[2];
            }
        }

        return cost;
    }
}
```

---

# 🟦 12. Pattern 8 — Connected Components

## ✔ Used For:
- Counting islands
- Counting groups
- Determining disconnected parts

---

## 🧠 Thought Process
Run DFS/BFS on every unvisited node.

---

## ✅ Count Connected Components
```java
public class ConnectedComponents {

    public static int count(int n, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[n];
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                dfs(i, visited, adj);
            }
        }

        return components;
    }

    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }
}
```

---

# 🎯 END OF GRAPH PATTERNS  
You now have complete graph notes:
✔ Definitions  
✔ Traversal patterns  
✔ Shortest paths  
✔ MST  
✔ Cycle detection  
✔ Topological sorting  
 
