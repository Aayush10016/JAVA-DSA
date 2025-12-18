# JAVA-DSA

<h1 align="center">🚀 Data Structures & Algorithms in Java</h1>

<p align="center">
  A structured, beginner-friendly to advanced repository containing my personal notes, solved problems, and implementations of core DSA concepts in Java.
  <br>
  Ideal for interview preparation, coding practice, and mastering problem-solving.
</p>

---

## 📌 About This Repository
This repository contains my journey of learning and mastering **Data Structures and Algorithms (DSA)** using **Java**.  
It includes implementations, explanations, and solutions to popular coding problems from:

- LeetCode  
- HackerRank  
- GFG  
- Striver A2Z  
- Kunal Kushwaha Assignments 

Each topic follows a clean code structure with optimized solutions, comments, and time/space complexity analysis.

---

## 🧠 Topics Covered

### **📂 Basic Java Concepts**
- Loops, Arrays, Strings  
- Functions, Recursion  
- Time & Space Complexity  

### **📦 Data Structures**
- Arrays  
- Linked Lists  
- Stacks  
- Queues  
- HashMap / HashSet  
- Trees (Binary Trees, BST)  
- Graphs  
- Heaps & Priority Queues  
- Tries  

### **🧩 Algorithms**
- Searching (Linear, Binary Search)  
- Sorting (Quick, Merge, Heap, etc.)  
- Sliding Window  
- Two Pointer Techniques  
- Recursion & Backtracking  
- Greedy Algorithms  
- Dynamic Programming  
- Graph Algorithms (DFS, BFS, Dijkstra, etc.)  

---

## 🗂 Repository Structure

📦 DSA-Java
┣ 📂 Arrays
┣ 📂 Strings
┣ 📂 LinkedList
┣ 📂 Stack
┣ 📂 Queue
┣ 📂 Hashing
┣ 📂 Trees
┣ 📂 Graphs
┣ 📂 DynamicProgramming
┣ 📂 Sorting
┗ 📂 Searching

Each folder contains:
- Java implementation  
- Problem statements  
- Explanations  
- Approach + complexity  

---

## 🧪 Example Code Snippet

```java
public int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```
