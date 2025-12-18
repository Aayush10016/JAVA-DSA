# 📂 Searching

# 🔍 Searching — Complete Guide (Concepts + Pattern Recognition + Interview Roadmap)

Searching is one of the MOST fundamental operations in DSA.  
Nearly every problem involves finding something in an array, matrix, or search space.

This folder includes:
✔ Searching fundamentals  
✔ Linear search  
✔ Binary search & variations  
✔ Search on answer (advanced)  
✔ Rotated arrays  
✔ Peak element & mountain arrays  
✔ Pattern recognition  
✔ Interview problem categories  
✔ Recommended folder structure  

---

# 🟦 1. What Is Searching?

**Searching** means locating a target element (or condition) inside a dataset.

Two major types:

### ✔ Linear Search (O(n))  
Check each element sequentially.

### ✔ Binary Search (O(log n))  
Used for **sorted arrays** or **monotonic functions**.

Binary search is one of the MOST powerful tools in DSA interviews.

---

# 🟩 2. When to Use Searching?

Searching is suitable when:
- You need to locate a value  
- You want to check existence  
- You need first/last position  
- You must find boundaries  
- You want to minimize/maximize something (advanced BS)  

---

# 🟥 3. Pattern Recognition — When to Use Binary Search?

Binary search is applicable when:

### ✔ The data is sorted  
### ✔ The answer space is monotonic  
### ✔ You want a **threshold** (first true, last false)  
### ✔ You want a **minimum/maximum feasible value**  
### ✔ You want to search within ranges  

If the problem has monotonic behavior (increasing/decreasing/true-false), **BS applies even without arrays**.

---

# 🟧 4. Binary Search Template (Concept)

Binary search splits the search space:

```
mid = left + (right - left) / 2
```

Then decide:
- search left half  
- or search right half  

Binary search exists in MANY forms:
- arrays  
- rotated arrays  
- floating-point BS  
- answer search  
- peak finding  

---

# 🟥 5. Key Binary Search Variants


---

## 🟦 A. Classic Binary Search  
Search exact target in sorted array.

---

## 🟧 B. First & Last Occurrence  
Used when array contains duplicates.

---

## 🟪 C. Floor & Ceil  
Find:
- greatest element ≤ target  
- smallest element ≥ target  

---

## 🟩 D. Binary Search on Answer (Important for Hard Problems)

Used when:
- array is NOT sorted  
- but search **space** is monotonic

Examples:
- Allocate books  
- Ship packages  
- Aggressive cows  
- Minimize max distance  
- Koko eating bananas  
- Painters partition  

You search on **range of answers**, not array values.

---

## 🟫 E. Peak Element / Mountain Array  
Find peak (max value with neighbors lower).

Used for:
- Bitonic arrays  
- Mountain arrays  
- Rotated sorted arrays  

---

## 🟥 F. Rotated Sorted Array  
Search in array rotated at unknown pivot.

Includes:
- finding pivot  
- searching target in rotated sorted array  
- searching minimum in rotated array  

---

## 🟦 G. Binary Search on Floating Values  
Used for:
- Square root  
- Nth root  
- Minimize error  
- Geometry problems (circles, distances)  

---

# 🟪 6. Pattern Recognition Table (Super Useful)

| Problem Keyword | Use This |
|-----------------|----------|
| “sorted array” | Classic BS |
| “first/last occurrence” | Boundary binary search |
| “closest element” | Floor/ceil search |
| “pivot”, “rotation” | Rotated array BS |
| “peak”, “mountain” | Peak element BS |
| “minimize maximum…” | Binary search on answer |
| “maximize minimum…” | Binary search on answer |
| “capacity”, “speed”, “time” | Answer-based BS |
| “smallest positive…” | Boundary search |
| “search in matrix” | Row+Column BS or flatten BS |

---

# 🟧 7. Searching in 2D Matrices

Two approaches:

### ✔ 1. Binary Search Row + Column  
If each row and column is sorted.

### ✔ 2. Treat matrix as a sorted array  
If matrix obeys:
```
row sorted AND last element of row < first element of next row
```

Then search in flattened index space:
```
midIndex → row = mid/n, col = mid%n
```

---

# 🟫 8. Real Interview Problems Based on Searching


### Classic BS
- Binary search  
- First and last position  
- Floor and ceil  

### Answer Search
- Koko eating bananas  
- Ship packages  
- Allocate books  
- Minimize largest sum subarray  
- Painters partition  

### Rotated Array
- Search in rotated sorted array  
- Find pivot  
- Minimum in rotated array  

### Peak + Mountain Array
- Find peak element  
- Search in bitonic array  

### Matrix Searching
- Search in 2D matrix (two types)  

### Mathematical BS
- Find square root (precision)  
- Nth root  

---

# 🟦 9. Types

```
Searching/
 ├── README 
 ├── ClassicBS 
 ├── FirstLastOccurrence 
 ├── FloorCeil 
 ├── RotatedArray/
 │    ├── FindPivot 
 │    ├── SearchRotated 
 │    └── MinimumInRotated 
 ├── PeakMountain/
 │    ├── PeakElement 
 │    └── SearchBitonicArray 
 ├── Matrix/
 │    ├── Search2D-RowCol 
 │    └── Search2D-Flat 
 ├── BinarySearchOnAnswer/
 │    ├── AllocateBooks 
 │    ├── ShipPackages 
 │    ├── KokoEatingBananas 
 │    └── PaintersPartition 
 └── MathBS/
      ├── SquareRoot 
      └── NthRoot 
```

---

# 🟩 10. Time Complexity Summary

| Search Type | Time | Space |
|-------------|-------|--------|
| Linear Search | O(n) | O(1) |
| Binary Search | O(log n) | O(1) |
| Search in 2D matrix | O(log(m*n)) | O(1) |
| Binary Search on Answer | O(log(max possible answer) * check function) | O(1) |

---

# 🎯 11. Tips for Mastering Searching

✔ ALWAYS check if array is sorted  
✔ Don’t modify indices carelessly — avoid overflow  
✔ Know binary search boundaries clearly  
✔ Understand monotonic behavior for answer-based BS  
✔ Draw small examples before writing code  
✔ Master rotated array patterns — very common in interviews  
✔ Practice peak finding — bitonic arrays appear often  

---

