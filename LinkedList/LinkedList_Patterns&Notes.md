# 📘 Linked Lists — Complete Notes + Definitions + Pattern Recognition +Base Codes

Linked Lists are one of the most important data structures in DSA interviews.

This file includes:
✔ What is a linked list  
✔ Types of linked lists  
✔ Pattern recognition  
✔ Reversal  
✔ Fast/slow pointers  
✔ Cycle detection & removal  
✔ Middle of list  
✔ Merge lists  

---

# 🟦 1. What Is a Linked List?

A **Linked List** is a linear data structure in which each element is a **node** containing:
- data  
- a pointer/reference to the next node  

Unlike arrays, elements are **not stored in contiguous memory**.

---

# 🟩 2. Why Linked Lists?

### ✔ Advantages
- Dynamic size  
- Insert/delete in O(1) when node reference is known  
- No shifting like arrays  

### ✔ Disadvantages
- No random access  
- Extra memory for pointers  
- Reverse traversal difficult (unless doubly linked list)

---

# 🟦 3. Types of Linked Lists

### ✔ 1. Singly Linked List  
Each node → points to next

### ✔ 2. Doubly Linked List  
Node → next + previous

### ✔ 3. Circular Linked List  
Last node points to first

---

# 🟧 4. Pattern Recognition — When to Use Linked Lists?

| Problem Keyword | Pattern |
|------------------|---------|
| “reverse the list” | Pointer manipulation |
| “middle element” | Fast/slow pointers |
| “cycle exists?” | Floyd’s cycle detection |
| “merge lists” | Two-pointer merge |
| “kth node from end” | Two-pointer gap method |
| “palindrome list” | Reverse + compare |
| “remove duplicates” | Pointer manipulation |
| “rotate list” | Connect tail to head |

---

# 🟥 5. Core Concept: Node Structure

This is the **standard Node**:

```java
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
```

---

# 🟦 6. Kunal Kushwaha’s Linked List Template Class

Below is an extended but clean version of the class used in Kunal’s DSA Bootcamp.

```java
public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    // Insert at start
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    // Insert at end
    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    // Insert at index
    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // Display list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
```

---

# 🟩 7. Pattern 1: Find Middle of Linked List

## ✔ When to Use  
- “Find the middle”  
- Used in palindrome checking  
- Used in merge sort  

## 🧠 Thought Process  
Use slow = slow.next, fast = fast.next.next

---

## ✅ Code: Middle Node (Fast and Slow Pointer)
```java
public class MiddleNode {

    public static Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // middle
    }
}
```

---

# 🟧 8. Pattern 2: Reverse a Linked List

## ✔ When to Use  
- "reverse the list"  
- Palindrome linked list  
- Many advanced patterns  

## 🧠 Thought Process  
Iterate while reversing pointers.

---

## ✅ Reverse Iteratively (Kunal Style)
```java
public static Node reverse(Node head) {
    Node prev = null;
    Node current = head;

    while (current != null) {
        Node next = current.next;
        current.next = prev;

        prev = current;
        current = next;
    }

    return prev;
}
```

---

# 🟥 9. Pattern 3: Detect Cycle (Floyd’s Algorithm)

## ✔ When to Use  
- “Does cycle exist?”  
- “Find cycle length”  
- “Find cycle starting node”  

## 🧠 Thought Process  
fast moves 2 steps, slow moves 1  
If they meet → cycle exists

---

## ✅ Detect Cycle
```java
public static boolean hasCycle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) return true;
    }

    return false;
}
```

---

# 🟦 10. Pattern 4: Remove Cycle

## 🧠 Thought Process  
Step 1: Detect cycle  
Step 2: Reset slow = head  
Step 3: Move both by 1 until they meet → start of cycle  
Step 4: Break cycle  

---

## ✅ Remove Cycle
```java
public static void removeCycle(Node head) {
    Node slow = head;
    Node fast = head;

    // Detect cycle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            break;
        }
    }

    if (fast == null || fast.next == null) return;

    slow = head;

    while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }

    // find last node of cycle
    Node temp = fast;
    while (temp.next != slow) {
        temp = temp.next;
    }

    temp.next = null;
}
```

---

# 🟩 11. Pattern 5: Merge Two Sorted Lists

## ✔ When to Use  
- Standard interview question  
- Merge Sort  
- K-way merge  

---

## 🧠 Thought Process  
Two pointers comparing values.

---

## ✅ Merge Sorted Lists
```java
public static Node merge(Node list1, Node list2) {
    Node dummy = new Node(0);
    Node tail = dummy;

    while (list1 != null && list2 != null) {
        if (list1.value < list2.value) {
            tail.next = list1;
            list1 = list1.next;
        } else {
            tail.next = list2;
            list2 = list2.next;
        }

        tail = tail.next;
    }

    tail.next = (list1 != null) ? list1 : list2;

    return dummy.next;
}
```

---

# 🟧 12. Pattern 6: Remove Nth Node from End

## ✔ When to Use  
- Kth from end  
- Linked list deletion patterns  

---

## 🧠 Thought Process  
Two pointers with a gap of n nodes.

---

## ✅ Remove Nth Node from End
```java
public static Node removeNth(Node head, int n) {
    Node dummy = new Node(0, head);
    Node fast = dummy;
    Node slow = dummy;

    for (int i = 0; i < n; i++) {
        fast = fast.next;
    }

    while (fast.next != null) {
        fast = fast.next;
        slow = slow.next;
    }

    slow.next = slow.next.next;

    return dummy.next;
}
```

---

# 🟥 13. Hard Pattern: Palindrome Linked List

## ✔ When to Use  
- “Check if list is palindrome”

## 🧠 Thought Process  
1. Find middle  
2. Reverse 2nd half  
3. Compare  
4. Restore list (optional)

---

## ✅ Palindrome Linked List
```java
public static boolean isPalindrome(Node head) {
    if (head == null || head.next == null) return true;

    Node mid = middle(head);
    Node second = reverse(mid);

    Node first = head;

    while (second != null) {
        if (first.value != second.value) return false;
        first = first.next;
        second = second.next;
    }

    return true;
}
```

---

# 🎯 FINAL SUMMARY

You now have complete Linked List notes:
✔ What LL is  
✔ Why LL is used  
✔ All major patterns  
✔ Kunal-style LinkedList class  
✔ Fast/slow pointer patterns  
✔ Cycle detection + removal  
✔ Reversal  
✔ Merging lists  
✔ Kth from end  
✔ Palindrome  


