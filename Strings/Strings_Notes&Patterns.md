# 📘 STRINGS — Complete Notes + Definitions + Pattern Recognition + Kunal Kushwaha Base Codes

Strings are one of the most important topics in DSA and interviews.  
A strong understanding of string manipulation unlocks many problems involving text, patterns, sliding windows, and hashing.

These notes explain:
- ✔ What each concept is  
- ✔ Why it exists  
- ✔ How to recognize patterns in problems  
- ✔ How to think  
- ✔ Kunal-Kushwaha-style base codes  

---

# 🟦 1. What Is a String?

A **string** is an ordered collection of characters stored in contiguous memory.

In Java:
- Strings are **immutable** → once created, they cannot be modified.
- Operations like concatenation create **new strings**, which is costly.

This is why we often use:
- `StringBuilder` → fast modification
- `char[]` → for in-place algorithms

### 💡 Why do interviews ask string questions?
Because they test:
- Thinking in linear scans  
- Pattern recognition  
- Window-based logic  
- Hashing & frequency counting  
- Recursion skills  

---

# 🟩 2. Fundamental Concepts in Strings

## ✔ Character Array
A string can be converted to a `char[]` to modify characters:
```java
char[] arr = s.toCharArray();
```
✔ ASCII & Unicode
-Characters map to numbers.
-Useful for:

-Frequency arrays

-Sorting characters

✔ StringBuilder
-Used for:

-Fast building

-Removing characters

-Filtering

-Time complexity becomes O(n), not O(n²).

🟦 3. How to Recognize String Patterns
Understanding patterns is the MOST important thing.
Below is a problem → pattern mapping:

Problem Phrase	Pattern to Use
"reverse", "palindrome"	Two Pointers
"longest substring", "window"	Sliding Window
"contains all characters", "minimum window"	Sliding Window + HashMap
"remove", "filter", "construct"	StringBuilder
"count occurrences", "frequency"	HashMap / Frequency Array
"subsequence", "skip this character"	Two pointers OR recursion
"arrange", "group anagrams"	Sorting / HashMap

🟧 4. Pattern 1: Two Pointer Technique (Strings)
✔ Definition
-Two pointers is a technique where:

-One pointer starts from the left

-Another starts from the right

-Both move towards each other based on logic

✔ Why we use it?
-O(n) time

-Perfect for symmetric problems (palindrome)

-Used when problem logic depends on comparing ends

🧠 Thought Process
-Look at both ends of the string

-If mismatch → not a palindrome

-Swap operations become efficient

✅ Base Code: Palindrome Check
```java
public class PalindromeCheck {

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }
}
```
✅ Reverse String (Two Pointers)
```java
public class ReverseString {

    public static String reverse(String s) {
        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
```
🟥 5. Pattern 2: Sliding Window
✔ Definition
-Sliding window is a technique to process a contiguous substring efficiently by expanding and shrinking a window.

✔ Why we use it?
-To avoid O(n²) brute force methods.

-Sliding window brings it down to O(n).

✔ When to use?
-Look for these words:

-“Longest substring”

-“At most K…”

-“Without repeating characters”

-“Minimum window substring”

🧠 Thought Process
-Expand window by moving right

-When invalid → shrink using left

-Keep tracking the best window

✅ Base Code: Longest Substring Without Repeating Characters
```java
import java.util.*;

public class LongestUniqueSubstring {

    public static int longestUnique(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestUnique("abcabcbb")); 
    }
}
```
🟦 6. Pattern 3: Frequency Counting (HashMap / Array)
✔ Definition
-Count occurrences of characters using:

-int[26] for lowercase a–z

-HashMap<Character, Integer> for all characters

✔ When to use?
-Anagrams

-Comparing two strings

-Character frequency questions

🧠 Thought Process
-Count all characters in s

-Count all characters in t

-Compare arrays/maps

✅ Base Code: Check Anagrams
```java

public class AnagramCheck {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            freq[ch - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }
}
```
🟩 7. Pattern 4: StringBuilder Techniques
✔ Definition
-StringBuilder allows O(1) amortized modifications.

✔ When to Use?
-Removing characters

-Filtering

-Fast concatenation

🧠 Thought Process
-Instead of:

```java

s = s + "a";  // creates new string (slow)
```
Use:

```java
sb.append("a");
```
✅ Base Code: Remove All Occurrences of a Character
```java

public class RemoveCharacter {

    public static String removeChar(String s, char target) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != target) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeChar("banana", 'a'));
    }
}
```
🟪 8. Pattern 5: Sorting Strings
✔ Definition
-Sort string → convert to char array → apply Arrays.sort()

-Useful for:

-Normalizing strings

-Grouping anagrams

🧠 Thought Process
-Sorted versions of two anagrams are identical.

✅ Base Code: Sort Characters
```java

import java.util.Arrays;

public class SortCharacters {

    public static String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(sortString("dcba"));
    }
}
```
🟥 9. Pattern 6: Minimum Window Substring (HARD)
✔ Definition
-Find the smallest substring in s that contains all characters of t.

✔ When to Use?
Look for:

-"contains all characters"

-"minimum window"

-This is the advanced sliding window pattern.

🧠 Thought Process
-Expand window until valid

-Shrink window to minimize

-Track smallest possible window

✅ Base Code (Clean Version)
```java

import java.util.*;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        Map<Character, Integer> need = new HashMap<>();
        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int required = need.size();
        int formed = 0;

        Map<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch) && window.get(ch).intValue() == need.get(ch).intValue()) {
                formed++;
            }

            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
```
🟧 10. Pattern 7: Subsequence Pattern
✔ Definition
-A subsequence is a string we derive by removing SOME characters without changing the order.

Example:

-“ace” is a subsequence of “abcde”

-“aec” is NOT (order breaks)

✔ When to Use?
-LCS

-Checking subsequence

-DP problems

🧠 Thought Process
-Two-pointer walk:

-If match → move both

-If not → move only long string pointer

✅ Base Code: Is Subsequence
```java

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
}
```
🟦 11. Pattern 8: Recursion on Strings (Kunal Style)
✔ Definition
Use recursion to:

-Remove characters

-Filter

-Build new strings

🧠 Thought Process
-At each recursion call:

-Look at first character

-Either skip or include

-Recur for the rest

✅ Base Code: Remove Char Recursively
```java
Copy code
public class RemoveCharRecursively {

    public static String remove(String s, char target) {
        if (s.isEmpty()) return "";

        char ch = s.charAt(0);

        if (ch == target) {
            return remove(s.substring(1), target);
        }

        return ch + remove(s.substring(1), target);
    }

    public static void main(String[] args) {
        System.out.println(remove("banana", 'a'));
    }
}
```
