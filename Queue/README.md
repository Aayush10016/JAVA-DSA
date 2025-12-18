# 📂 Queue

# 📦 Queue — Complete Guide (Concepts + Pattern Recognition + Interview Roadmap)

A **Queue** is a linear data structure that follows the **FIFO** principle:

#️⃣ **First In → First Out**

Queues are foundational in:
✔ BFS  
✔ Scheduling  
✔ Sliding window problems  
✔ Tree traversal  
✔ Multi-source BFS  
✔ Producer-consumer systems  

This folder includes:
✔ Queue basics  
✔ Types of queues  
✔ Pattern recognition  
✔ Monotonic queue  
✔ BFS-based graph patterns  
✔ Real interview problems  
✔ Recommended folder structure  

---

# 🟦 1. What Is a Queue?

A Queue is an ordered collection where:
- **Insertions** happen at the **rear**  
- **Deletions** happen at the **front**

Representation:
```
front → [2, 5, 7, 9] → rear
```

Operations:
- `enqueue(x)` → push element  
- `dequeue()` → remove element  
- `peek()` → read front  
- `isEmpty()`  

---

# 🟩 2. Why Do We Use Queues?

### ✔ Real-world behavior simulation  
Jobs, tickets, requests are all processed in arrival order.

### ✔ Essential for BFS (graph & tree traversal)  
Shortest path in unweighted graph = BFS = Queue

### ✔ Sliding window optimization  
Monotonic queue solves:
- sliding window maximum  
- sliding window minimum  

### ✔ Scheduling  
Round-robin scheduling uses Circular Queue.

---

# 🟥 3. Types of Queues

### ✔ Simple Queue (Linear)
Basic FIFO queue.

### ✔ Circular Queue
Rear wraps around to start.
Used in:
- OS scheduling  
- Fixed-size buffers  

### ✔ Deque (Double Ended Queue)
Insertion/removal allowed from BOTH ends.
Used in:
- Monotonic queue  
- Sliding windows  
- Optimized BFS  
- Palindrome checking  

### ✔ Priority Queue (Heap)
Not FIFO — highest priority first.
Used in:
- Dijkstra  
- Median stream  
- Scheduling tasks  

---

# 🟧 4. Queue Operations & Complexity

| Operation | Time |
|----------|------|
| Enqueue | O(1) |
| Dequeue | O(1) |
| Peek | O(1) |
| Search | O(n) |

---

# 🟦 5. Pattern Recognition — When to Use Queues?

| Problem Keyword / Structure | Queue Technique |
|------------------------------|----------------------|
| “level order traversal” | BFS queue |
| “shortest path (unweighted)” | BFS |
| “min steps to reach X” | BFS |
| “process items in order” | Queue |
| “sliding window max/min” | Monotonic deque |
| “multi-source BFS” | Multi-start queue |
| “topological sort (Kahn)” | BFS with in-degree queue |
| “first non-repeating character” | Frequency + queue |
| “rotten oranges” | BFS grid |
| “flood fill” | BFS grid |
| “circular behavior” | Circular queue |

If a problem requires sequential processing or "first come first serve", it’s a queue.

---

# 🟨 6. Real Interview Patterns 

---

## 🟦 A. BFS (Breadth-First Search)  
✔ Shortest path in unweighted graphs  
✔ Binary tree level order traversal  
✔ Multi-source BFS (fire spread, rotten oranges)

---

## 🟧 B. Sliding Window + Monotonic Queue  
Used for:
- Sliding Window Maximum  
- Sliding Window Minimum  
- Stock Span

Deques maintain:
- Increasing sequence  
- Decreasing sequence  

This gives O(n) sliding window.

---

## 🟥 C. Queue Using Stacks  
Classic problem:
- Implement queue using two stacks

---

## 🟩 D. Stack Using Queues  
Inverse of the above.

---

## 🟪 E. Circular Queue  
Important for:
- Buffer systems  
- Scheduling  
- Hardware queues  

---

## 🟫 F. Deque (Double Ended Queue)  
Used for:
- Palindromes  
- Sliding window  
- BFS optimizations  
- Tree traversals  

---

## 🟦 G. Topological Sort (Kahn’s Algorithm)  
Built entirely on queue behavior:
- Push nodes with in-degree 0  
- Remove from queue  
- Decrease neighbors’ in-degrees  
- Repeat  

---

## 🟧 H. Multi-Source BFS  
Initialize queue with multiple starting nodes simultaneously.

Used in:
- Word ladder  
- Rotting oranges  
- Fire spread  
- Social network propagation  

---

# 🟥 7. Queue in Trees

Queues help in:
- Level order traversal  
- Zig-zag traversal  
- Right/left view of binary tree  
- Height/width of tree  

Any time you need **level by level**, use queue.

---

# 🟦 8. Queue in Graphs

Queues help in:
- BFS  
- Shortest path (unit weights)  
- Components detection (BFS alternative)  
- Bipartite graph check (BFS coloring)  
- Topological sort  

One of the most powerful uses of queues.

---

# 🟧 9. Types

```
Queue/
 ├── README 
 ├── BasicQueue 
 ├── CircularQueue 
 ├── DequeBasics 
 ├── SlidingWindow/
 │    ├── MonotonicQueue 
 │    ├── SlidingWindowMaximum 
 │    └── SlidingWindowMinimum 
 ├── BFS/
 │    ├── GraphBFS 
 │    ├── TreeLevelOrder 
 │    └── MultiSourceBFS 
 ├── Implementations/
 │    ├── QueueUsingStacks 
 │    └── StackUsingQueues 
 └── Applications/
      ├── RottenOranges 
      ├── FloodFill 
      └── TopologicalSort 
```

---

# 🟫 10. Time & Space Summary

| Structure | Insert | Remove | Use Case |
|----------|--------|--------|----------|
| Queue | O(1) | O(1) | BFS, level order |
| Circular Queue | O(1) | O(1) | Scheduling |
| Deque | O(1) | O(1) | Sliding window |
| Priority Queue | log(n) | log(n) | Shortest paths |

---

# 🎯 11. Tips to Master Queues

✔ Always visualize front & rear pointers  
✔ Use queues for level-based or shortest-step problems  
✔ Use dequeue for sliding window optimization  
✔ Learn BFS deeply — many problems reduce to it  
✔ Practice monotonic queue (advanced but extremely useful)  
✔ Understand wrapper problems (queue using stack & vice-versa)  

---



Use this space to organize all queue-related patterns and problems.

