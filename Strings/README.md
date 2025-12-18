# 📂 Strings

# 🔤 Strings — Complete Guide (Concepts + Pattern Recognition + Interview Roadmap)

Strings are one of the MOST frequently asked DSA topics.  
String problems test:
✔ logic  
✔ pattern recognition  
✔ hashing  
✔ sliding window  
✔ two-pointer techniques  
✔ dynamic programming  

This folder includes:
✔ String fundamentals  
✔ ASCII/Unicode basics  
✔ Substring & subsequence concepts  
✔ Two-pointer patterns  
✔ Sliding window patterns  
✔ Hashing for strings  
✔ Palindrome logic  
✔ Interview categories  
✔ Folder structure  

---

# 🟦 1. What Is a String?

A **string** is a sequence of characters stored in memory.

Example:
```
"hello"
```

Internally represented as:
```
['h', 'e', 'l', 'l', 'o']
```

Strings are immutable in many languages (Java, Python).

---

# 🟩 2. ASCII, Unicode & Character Basics

### ✔ ASCII  
Represents characters using values 0–127.

### ✔ Extended ASCII  
0–255  

### ✔ Unicode  
Represents global characters.

### ✔ Why this matters?
Character problems often require:
- mapping characters  
- converting char ↔ int  
- frequency arrays of size 26/128/256  

---

# 🟥 3. Substring vs Subsequence

### ✔ Substring  
Continuous part of the string.  
Example: `"abc"` from `"zabcx"`

### ✔ Subsequence  
Characters in order but not necessarily continuous.  
Example: `"ace"` from `"abcde"`

Many DP string problems deal with subsequences.

---

# 🟧 4. Common String Operations

- Finding length  
- Comparing strings  
- Searching substring  
- Reversing  
- Uppercase/lowercase  
- Character frequency  
- Tokenizing (splitting)  
- Removing spaces  
- Checking palindromes  
- Pattern matching  

---

# 🟦 5. Pattern Recognition — When to Use Which String Technique?

| Problem Keyword | Pattern |
|-----------------|---------|
| “longest substring” | Sliding window |
| “no repeat characters” | HashSet + sliding window |
| “at most K distinct” | HashMap + window |
| “anagrams” | Frequency maps |
| “permutation in string” | Sliding window + freq |
| “palindrome” | Two-pointer |
| “reverse words/characters” | Two-pointer |
| “compare versions / big numbers” | Pointer-based parsing |
| “word break” | DP + hashing |
| “edit distance / subsequence” | DP |
| “encode/decode” | Stack or parsing |

If characters must be counted — **use hashing** (freq arrays or HashMap).

If checking ranges in string — **use sliding window**.

If checking mirror properties — **use two pointers**.

---

# 🟪 6. Major String Patterns 

---

## 🟩 A. Sliding Window (Most Important)
Used for:
- Longest substring without repeating characters  
- Longest substring with at most K distinct  
- Minimum window substring  
- Permutation in string  
- Anagram search  

This is the most common string-solving technique.

---

## 🟧 B. Two-Pointer String Problems
Used for:
- Reverse string  
- Reverse words in place  
- Palindrome checking  
- Skip characters while comparing  
- Remove extra spaces  

Efficient for linear scans.

---

## 🟥 C. Hashing / Frequency Arrays
Used for:
- Anagrams  
- Character frequency  
- Isomorphic strings  
- Unique char substring  
- String compression  

---

## 🟦 D. Palindrome Patterns
Includes:
- Check palindrome  
- Valid palindrome with removal allowed  
- Longest palindromic substring  
- Longest palindromic subsequence (DP)  

---

## 🟫 E. Dynamic Programming on Strings
Used for:
- LCS  
- Edit distance  
- Word break  
- Regex match (hard)  

String DP is crucial for hard problems.

---

## 🟨 F. Stack-Based String Problems
Used for:
- Decode string  
- Remove adjacent duplicates  
- Simplify paths  
- Basic calculator (with strings)  

---

## 🟩 G. Pattern Matching Algorithms (Advanced)
- KMP (Knuth–Morris–Pratt)  
- Rabin–Karp hashing  
- Z-algorithm  

Useful for:
- substring search  
- large pattern scanning  

---

# 🟦 7. Real Interview Problem Categories

### 🔹 A. Basic String Manipulation  
- Reverse string  
- Reverse words  
- Remove extra spaces  

### 🔹 B. Sliding Window Problems  
- Longest substring without repeating  
- Minimum window substring  
- Permutation in string  

### 🔹 C. Anagram & Hash Problems  
- Valid anagram  
- Group anagrams  
- Isomorphic strings  
- Word pattern  

### 🔹 D. Palindrome Problems  
- Valid palindrome  
- Palindrome II (remove 1 char)  
- Longest palindromic substring (expand center)  
- Longest palindromic subsequence (DP)  

### 🔹 E. Two-Pointer Comparisons  
- Compare version numbers  
- Backspace string compare  

### 🔹 F. DP on Strings  
- Edit distance  
- LCS  
- Word break  
- Regex matching  

### 🔹 G. Encoding/Decoding  
- Decode string  
- String compression  
- Count & say sequence  

---

# 🟧 8. Types

```
Strings/
 ├── README 
 ├── TwoPointer/
 │    ├── ReverseString 
 │    ├── PalindromeCheck 
 │    └── ReverseWords 
 ├── SlidingWindow/
 │    ├── LongestSubstringNoRepeat 
 │    ├── AtMostKDistinct 
 │    ├── MinimumWindowSubstring 
 │    └── PermutationInString 
 ├── Hashing/
 │    ├── ValidAnagram 
 │    ├── GroupAnagrams 
 │    ├── IsomorphicStrings 
 │    └── WordPattern 
 ├── PalindromePatterns/
 │    ├── LongestPalindromicSubstring 
 │    └── LongestPalindromicSubsequence 
 ├── DP/
 │    ├── EditDistance 
 │    ├── LCS 
 │    └── WordBreak 
 ├── StackBased/
 │    ├── DecodeString 
 │    ├── RemoveAdjacentDuplicates 
 │    └── BasicCalculator 
 ├── PatternMatching/
 │    ├── KMP 
 │    ├── RabinKarp 
 │    └── ZAlgorithm 
 └── Practice/
```

---

# 🟫 9. Complexity Overview

| Technique | Time | Use Case |
|----------|------|----------|
| Two-pointer | O(n) | Palindromes, reversing |
| Sliding window | O(n) | Longest substring, anagrams |
| Hashing | O(n) | Frequency problems |
| Stack | O(n) | Encoding/decoding |
| Expand around center | O(n²) | Palindromic substring |
| DP on strings | O(n²) | LCS, edit distance |
| KMP | O(n) | Pattern matching |
| Rabin–Karp | O(n) | Faster multi-search |

---

# 🎯 10. Tips to Master String Problems

✔ Convert strings to char arrays for easier manipulation  
✔ Use sliding window for substring problems  
✔ Use hashing for character counting  
✔ For palindromes → use two pointers or expand center  
✔ Practice dynamic programming problems — they are asked often  
✔ Draw examples for tricky index manipulation  
✔ For substring search → learn KMP  

---

