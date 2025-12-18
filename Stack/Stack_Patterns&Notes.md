# 📘 Stacks — Complete Notes + Definitions + Patterns + Base Codes

A **stack** is a linear data structure that follows:

#️⃣ **LIFO → Last In First Out**

This file includes:
✔ Stack basics  
✔ Array & LinkedList implementation  
✔ Stack using two queues  
✔ Monotonic stacks  
✔ Next greater element  
✔ Valid parentheses  
✔ Min stack  
✔ Largest rectangle in histogram (advanced)  
✔ Pattern recognition   

---

# 🟦 1. What Is a Stack?

Stack is a structure where:
- Push → insert at top  
- Pop → remove from top  
- Peek → read top element  

---

# 🟩 2. Where Are Stacks Used?

✔ Function call stack  
✔ Parentheses matching  
✔ Balanced expressions  
✔ Undo/redo operations  
✔ Backtracking  
✔ Monotonic stack problems  
✔ DFS  

---

# 🟥 3. Stack Operations

| Operation | Meaning |
|----------|---------|
| `push(x)` | Insert element on top |
| `pop()` | Remove top element |
| `peek()` | Return top without removing |
| `isEmpty()` | Check if empty |
| `isFull()` | (Only for fixed-size stack) |

---

# 🟧 4. Pattern Recognition — When to Use a Stack?

| Problem Keyword | Use Stack? |
|------------------|------------|
| “reverse”, “undo” | Yes |
| “balanced parentheses” | Yes |
| “next greater/smaller element” | Monotonic stack |
| “span”, “stock span” | Stack |
| “largest rectangle in histogram” | Monotonic stack |
| “decode string” | Stack |
| “evaluate postfix/prefix” | Stack |
| “remove duplicates” | Stack |

---

# 🟦 5. Stack Implementation (Array-Based)

```java
public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) return false;
        data[++ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack is empty");
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) throw new Exception("Stack is empty");
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
```

---

# 🟩 6. Stack Implementation Using Linked List

```java
public class LinkedListStack {

    private Node head;

    private static class Node {
        int value;
        Node next;

        Node(int value) { this.value = value; }
    }

    public void push(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public int pop() throws Exception {
        if (head == null) throw new Exception("Stack empty!");
        int val = head.value;
        head = head.next;
        return val;
    }

    public int peek() throws Exception {
        if (head == null) throw new Exception("Stack empty!");
        return head.value;
    }
}
```

---

# 🟥 7. Stack Using Two Queues

## 🧠 Thought Process  
To mimic LIFO:
- Push → costly  
- Pop → easy  

---

## ✅ Stack Using Queues

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

# 🟦 8. Pattern 1: Valid Parentheses

## ✔ When to Use  
- Balanced brackets  
- Matched expressions  

---

## 🧠 Thought Process  
Push opening brackets → pop when closing bracket appears.  
Mismatch → invalid.

---

## ✅ Valid Parentheses

```java
import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;

                char open = st.pop();
                if ((ch == ')' && open != '(') ||
                    (ch == ']' && open != '[') ||
                    (ch == '}' && open != '{')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
```

---

# 🟩 9. Pattern 2: Next Greater Element (Monotonic Stack)

## ✔ When to Use  
- Stock span  
- Weather temperature problems  
- Next greater/smaller element  

---

## 🧠 Thought Process  
Use decreasing stack → ensures next greater element is found efficiently.

---

## ✅ Next Greater Element

```java
import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        return ans;
    }
}
```

---

# 🟧 10. Pattern 3: Min Stack (O(1) min Retrieval)

## ✔ When to Use  
- Track minimum with stack operations  

---

## 🧠 Thought Process  
Maintain another stack storing minimum at each level.

---

## ✅ Min Stack

```java
import java.util.*;

public class MinStack {

    Stack<Integer> main = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int x) {
        main.push(x);
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        } else {
            min.push(min.peek());
        }
    }

    public int pop() {
        min.pop();
        return main.pop();
    }

    public int top() {
        return main.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
```

---

# 🟥 11. Pattern 4: Largest Rectangle in Histogram (ADVANCED)

## ✔ When to Use  
- Hard LeetCode problems  
- Largest area under histogram bars  

---

## 🧠 Thought Process  
Use monotonic increasing stack  
Store indices of bars  
When current bar < previous bar:
- continuously calculate area  

---

## ✅ Largest Rectangle in Histogram

```java
import java.util.*;

public class LargestRectangle {

    public static int largestRectangle(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];

            while (!st.isEmpty() && h < heights[st.peek()]) {
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            st.push(i);
        }

        return maxArea;
    }
}
```

---

# 🟦 12. Pattern 5: Evaluate Postfix Expression

## ✔ When to Use  
- Postfix evaluation  
- Calculator design  

---

## 🧠 Thought Process  
Operators → apply on two popped operands  
Push result back.

---

## ✅ Postfix Evaluation

```java
import java.util.*;

public class PostfixEval {

    public static int evaluate(String exp) {
        Stack<Integer> st = new Stack<>();

        for (char ch : exp.toCharArray()) {
            if (Character.isDigit(ch)) {
                st.push(ch - '0');
            } else {
                int b = st.pop();
                int a = st.pop();

                switch (ch) {
                    case '+': st.push(a + b); break;
                    case '-': st.push(a - b); break;
                    case '*': st.push(a * b); break;
                    case '/': st.push(a / b); break;
                }
            }
        }

        return st.pop();
    }
}
```

---

# 🎯 FINAL SUMMARY

You now have complete stacks notes including:
✔ Stack basics  
✔ Array & LinkedList implementations  
✔ Stack using queues  
✔ Valid parentheses  
✔ Next greater element  
✔ Min stack  
✔ Largest rectangle (monotonic stack)  
✔ Postfix evaluation  


