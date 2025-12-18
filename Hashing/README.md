# 📂 Hashing

# #️⃣ Hashing — Complete Guide (Concepts + Pattern Recognition + Interview Roadmap)

Hashing is one of the MOST powerful tools in DSA and real-world development.  
It enables fast lookups, fast inserts, fast deletions — often in **O(1)**.

This folder contains:
✔ Hashing fundamentals  
✔ Hash functions & collisions  
✔ HashMap / HashSet operations  
✔ Pattern recognition  
✔ Frequency maps  
✔ Prefix-sum hashing  
✔ Common interview questions  
✔ Folder structure for organizing problems  

---

# 🟦 1. What Is Hashing?

**Hashing** is a technique to convert data into a fixed-size value (hash) using a **hash function**, and store it in a table for quick lookup.

### Hashing = Key → Hash Function → Index in Array

Example:
```
hash("apple") = 42
```

Hashing powers:
- HashMap  
- HashSet  
- Caches  
- Databases  
- Blockchain (“hashes” are core to blocks)  

---

# 🟩 2. Why Hashing Is Important?

Hashing provides:

### ✔ O(1) Average Time  
For:
- Insert  
- Search  
- Delete  

### ✔ Easy frequency counting  
### ✔ Detect duplicates efficiently  
### ✔ Supports large datasets  
### ✔ Crucial in sliding window + prefix problems  

Hashing is used in almost every medium/hard LeetCode problem.

---

# 🟥 3. Key Concepts in Hashing

### ✔ Hash Function  
Maps a key to an index.

### ✔ Collision  
Occur when two keys map to the same index.  
Handled using:
- Chaining (linked list / bucket)  
- Open addressing  
- Probing  

### ✔ Load Factor  
`size_of_elements / table_size`  
If too high → rehashing is triggered.

### ✔ Rehashing  
Resize table (usually doubling size) when it becomes too full.

---

# 🟨 4. Hashing Data Structures

### ✔ HashMap  
Key → value mappings  
Stores frequencies, indexes, data records.

### ✔ HashSet  
Stores unique items only.

### ✔ LinkedHashMap  
Maintains insertion order.

### ✔ TreeMap  
Sorted keys (not hashing but same use case category).

---

# 🟦 5. Pattern Recognition — When to Use Hashing?

| Keyword / Clue | Hashing Pattern |
|----------------|------------------|
| “frequency”, “count” | HashMap |
| “first repeating”, “first unique” | HashMap / LinkedHashMap |
| “find pair with sum k” | HashSet |
| “subarray sum equals k” | Prefix sum + HashMap |
| “longest substring without repeat” | Sliding window + HashSet |
| “anagrams” | Character frequency map |
| “two numbers appear once” | XOR + hashing |
| “intersection/union” | Sets |
| “store seen states” | HashSet |

When brute force is O(n²) → Hashing usually makes it O(n).

---

# 🟥 6. Key Hashing Patterns

---

## 🟦 A. Frequency Map Pattern  
Used for:
- Majority element  
- Anagrams  
- Character counting  
- Top-K elements  

Core idea:  
Use `HashMap<Element, Count>`.

---

## 🟩 B. Set Based Lookup Pattern  
Used for:
- Two sum  
- Detect duplicates  
- Unique elements  
- Intersection / union  

Core idea:  
Check existence in O(1).

---

## 🟧 C. Prefix Sum + HashMap  
One of the MOST powerful patterns.

Used for:
- Subarray sum = k  
- Count subarrays with sum k  
- Longest subarray with target sum  
- Zero-sum subarrays  

Core idea:
```
if prefix[i] - prefix[j] = k
→ subarray (j+1 to i) has sum k
```

---

## 🟥 D. Sliding Window + Hashing  
Used for:
- Longest substring without repeating characters  
- Longest subarray with at most k distinct  
- Anagram substring search  

Combine:
```
window expansion + HashMap tracking
```

---

## 🟦 E. Hashing Based Sorting (Bucket + Frequency)  
Used for:
- Top K frequent  
- Sort by frequency  
- Grouping elements  

---

# 🟪 7. Real Interview Problem Categories (Very Important)

### 🔹 1. Frequency Based  
- Valid anagram  
- Group anagrams  
- Majority element  
- Ransom note  

### 🔹 2. Set Based  
- Contains duplicate  
- Longest consecutive sequence  
- Happy number  

### 🔹 3. Prefix Sum + HashMap  
- Subarray sum equals K  
- Continuous array  
- Zero-sum subarrays  

### 🔹 4. Hashing + Sliding Window  
- Longest substring without repeating chars  
- Minimum window substring  
- Permutation in string  

### 🔹 5. Map of Maps / Multisets  
- Grouping problems  
- Character frequency maps  
- Word frequency problems  

---

# 🟦 8. Time Complexities

| Operation | HashMap | HashSet |
|----------|---------|---------|
| Insert | O(1) avg | O(1) avg |
| Search | O(1) avg | O(1) avg |
| Delete | O(1) avg | O(1) avg |
| Worst Case | O(n) (rare) | O(n) |

Worst case occurs when too many collisions (Java handles via tree-based buckets).

---

# 🟧 9. Types

```
Hashing/
 ├── README 
 ├── FrequencyMap 
 ├── HashSetPatterns 
 ├── PrefixSumHashing 
 ├── SlidingWindowHashing 
 ├── BucketHashing 
 └── Practice/
```

---

# 🎯 10. Tips to Master Hashing

✔ Always think HashMap first when counting anything  
✔ Use HashSet for duplicate or membership checks  
✔ Prefix sum + HashMap is a superpower  
✔ Draw examples with small inputs  
✔ Rehearse classic problems (majority element, anagrams, 2-sum)  
✔ Understand difference between HashMap vs TreeMap vs LinkedHashMap  

Mastering hashing simplifies MANY complex array, string, DP, and sliding window problems.

---


