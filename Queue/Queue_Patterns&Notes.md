# 📘 Queues — Complete Notes + Definitions + Patterns + Base Codes

Queues are one of the most important data structures in DSA used in graphs, scheduling, OS, trees, and many real-world applications.

This file includes:
✔ Queue definitions  
✔ FIFO concept  
✔ Operations  
✔ Circular queue  
✔ Queue using stacks  
✔ Stack using queue  
✔ Deque (double-ended queue)  
✔ Pattern recognition  

---

# 🟦 1. What Is a Queue?

A **Queue** is a linear data structure that follows:

#️⃣ **FIFO → First In First Out**

Example in real life:
- People standing in a line  
- Printer jobs  
- CPU scheduling  

---

# 🟩 2. Why Use Queues?

✔ Perfect for order-based tasks  
✔ Used in:
- BFS (Graph traversal)  
- Level order traversal in trees  
- Operating system scheduling  
- Producer-consumer pattern  

✔ Enqueue & dequeue are **O(1)**

---

# 🟦 3. Queue Operations

| Operation | Meaning |
|----------|---------|
| `enqueue(x)` | Insert at end |
| `dequeue()` | Remove from front |
| `peek()` | See front element |
| `isEmpty()` | Check if empty |
| `isFull()` | (For fixed-size queues) |

---

# 🟧 4. Queue Implementation Options

### ✔ 1. Using Array  
### ✔ 2. Using Linked List  
### ✔ 3. Circular Queue (Array-based)  
### ✔ 4. Queue using Two Stacks  
### ✔ 5. Stack using Two Queues  
### ✔ 6. Deque (Double Ended Queue)  

---

# 🟥 5. Pattern Recognition — When to Use Queues?

| Problem Phrase | Use |
|----------------|-----|
| “level order traversal” | BFS with queue |
| “shortest path in unweighted graph” | BFS queue |
| “process in order of arrival” | Queue |
| “sliding window max/min” | Deque |
| “first non-repeating character” | Queue + frequency map |
| “circular rotation” | Circular queue |

---

# 🟦 6. Basic Queue Implementation (Array-Based)

```java
public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int front = 0;
    int end = 0;
    int size = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) return false;

        data[end++] = item;
        end = end % data.length;
        size++;

        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty!");

        int removed = data[front++];
        front = front % data.length;
        size--;

        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty!");
        return data[front];
    }
}
```

---

# 🟧 7. Circular Queue (Most Common in DSA)

Circular queue avoids wasted space by wrapping around.

## 🧠 Thought Process
Index moves using:
```
i = (i + 1) % size
```

---

## ✅ Circular Queue Code 

```java
public class CircularQueue {
    private int[] data;
    private int front = 0;
    private int end = 0;
    private int size = 0;

    public CircularQueue(int capacity) {
        data = new int[capacity];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) return false;

        data[end] = item;
        end = (end + 1) % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) throw new Exception("Queue empty!");

        int item = data[front];
        front = (front + 1) % data.length;
        size--;
        return item;
    }

    public int front() throws Exception {
        if (isEmpty()) throw new Exception("Queue empty!");
        return data[front];
    }
}
```

---

# 🟥 8. Queue Using Linked List

Node-based implementation eliminates fixed size limitations.

---

## ✅ Queue Using Linked List

```java
public class LinkedListQueue {

    private Node head;
    private Node tail;

    private static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int value) {
        Node node = new Node(value);

        if (tail != null) {
            tail.next = node;
        }
        tail = node;

        if (head == null) {
            head = tail;
        }
    }

    public int dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty");

        int value = head.value;
        head = head.next;

        if (head == null) tail = null;

        return value;
    }

    public int peek() throws Exception {
        if (isEmpty()) throw new Exception("Queue is empty");
        return head.value;
    }
}
```

---

# 🟩 9. Queue Using Two Stacks

### ✔ When to Use  
To achieve queue behavior using stack operations only.

---

## 🧠 Thought Process
Stack1: for enqueue  
Stack2: for dequeue  

When Stack2 is empty → move all elements from Stack1 to Stack2.

---

## ✅ Queue Using Two Stacks

```java
import java.util.*;

public class QueueUsingStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() throws Exception {
        if (s1.isEmpty() && s2.isEmpty())
            throw new Exception("Queue is empty!");

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public int peek() throws Exception {
        if (s1.isEmpty() && s2.isEmpty())
            throw new Exception("Queue is empty!");

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }
}
```

---

# 🟥 10. Stack Using Two Queues (Reverse Concept)

---

## 🧠 Thought Process
To mimic stack (LIFO):
- Push element into q2  
- Move all elements of q1 → q2  
- Swap q1 and q2  

---

## ✅ Stack Using Two Queues

```java
import java.util.*;

public class StackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() throws Exception {
        if (q1.isEmpty()) throw new Exception("Stack empty");
        return q1.remove();
    }

    public int top() throws Exception {
        if (q1.isEmpty()) throw new Exception("Stack empty");
        return q1.peek();
    }
}
```

---

# 🟦 11. Deque (Double Ended Queue)

## ✔ What is Deque?
A **Deque** allows insertion & deletion at BOTH ends.

Operations:
- addFirst  
- addLast  
- removeFirst  
- removeLast  

Used for:
- Sliding window maximum  
- Palindrome checking  
- BFS variants  
- Monotonic queues  

---

## ✔ Deque Implementation (Java Built-in)

```java
Deque<Integer> dq = new ArrayDeque<>();

dq.addFirst(10);
dq.addLast(20);
dq.removeFirst();
dq.removeLast();
```

---

# 🟨 12. Hard Pattern: Sliding Window Maximum (Deque-Based)

This is one of the most famous Deque problems.

---

## 🧠 Thought Process
Maintain a decreasing deque:
- Front of deque holds max element  
- Remove out-of-window indices  
- Maintain decreasing order  

---

## ✅ Sliding Window Maximum

```java
import java.util.*;

public class SlidingWindowMax {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {

            // Remove out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            if (i >= k - 1) {
                ans[idx++] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}
```

---

# 🎯 FINAL SUMMARY

You now have complete Queue notes including:
✔ Queue definitions  
✔ Array + LinkedList implementations  
✔ Circular queue  
✔ Queue using stacks  
✔ Stack using queues  
✔ Deque  
✔ Sliding window maximum  


