# 📘 Hashing (HashMap / HashSet) — Complete Notes + Definitions + Pattern Recognition + Base Codes

Hashing is one of the MOST powerful tools in DSA.  
It helps solve problems efficiently in **O(1)** average time.

This file includes:
✔ Hashing definitions  
✔ How HashMap & HashSet actually work  
✔ Collision handling  
✔ Pattern recognition  
✔ Frequency counting  
✔ Duplicate detection  
✔ Hash + Sliding Window  
✔ Hashing for strings  

---

# 🟦 1. What is Hashing?

Hashing converts data into a numerical value called a **hash**, which is used for indexing and fast lookup.

In Java:
- `HashSet` stores **unique values**
- `HashMap` stores **key–value pairs**

---

# 🟩 2. Why Hashing?

### ✔ O(1) average time for:
- Search  
- Insert  
- Delete  

### ✔ Best for:
- Frequency counting  
- Duplicate detection  
- Mapping values  
- Problems with "count", "exists", “how many times?”  

---

# 🟥 3. How HashMap Works (Simple Explanation)

1. Key → hash function → index in array  
2. Value stored at that index  
3. If two keys map to same index → **collision**

### ✔ Collision Handling (Java uses):
- **Separate chaining** (linked lists at each index)
- **Treeifying** (turning chains into balanced trees for speed)

---

# 🟦 4. Pattern Recognition — When to Use Hashing?

| Problem Keyword | Use Hashing |
|------------------|-------------|
| "frequency" | HashMap |
| "duplicates" | HashSet |
| "first non-repeating" | HashMap |
| "check anagram" | Frequency map |
| "two sum" | HashMap |
| "subarray sum equals k" | Prefix sum + HashMap |
| "longest substring without repeating" | HashSet |
| "count distinct elements" | HashSet |
| "group anagrams" | HashMap (sorted key) |

---

# 🟧 5. Pattern 1: Frequency Counting

## ✔ When to Use
- Find which character appears how many times  
- Check if two strings are anagrams  
- Count elements  

---

## 🧠 Thought Process
HashMap → character → frequency  
Example:
```
banana → {b:1, a:3, n:2}
```

---

## ✅ Code: Character Frequency 
```java
import java.util.*;

public class CharFrequency {

    public static Map<Character, Integer> freq(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {
        System.out.println(freq("banana"));
    }
}
```

---

# 🟧 6. Pattern 2: Detecting Duplicates

## ✔ When to Use
- “Does duplicate exist?”  
- “Return first duplicate”  
- “Check if array contains duplicates”  

---

## 🧠 Thought Process
Use HashSet:  
If element is already in set → duplicate found.

---

## ✅ Code: Contains Duplicate
```java
import java.util.*;

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[]{1,2,3,1}));
    }
}
```

---

# 🟧 7. Pattern 3: Two Sum Using HashMap

## ✔ When to Use
- “Find two numbers that sum to target”  
- Classic interview question  

---

## 🧠 Thought Process
Store:  
`target - nums[i]`  
If exists → answer found.

---

## ✅ Two Sum (HashMap)
```java
import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int need = target - arr[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }
}
```

---

# 🟦 8. Pattern 4: Hashing + Strings (Anagrams)

### ✔ Key Idea  
Sort the string → use sorted version as key.

Example:  
```
eat, tea, ate → "aet" as key
```

---

## 🧠 Thought Process
Group all strings that share same sorted form.

---

## ✅ Group Anagrams
```java
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> group(String[] arr) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : arr) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
```

---

# 🟥 9. Pattern 5: Subarray Sum = K (Prefix Sum + HashMap)

## ✔ When to Use
- “number of subarrays with sum k”
- “subarray sum equals k?”

---

## 🧠 Thought Process
Use hashmap to store prefix sums.

If:
```
currentSum - k = previousPrefixSum
```
→ subarray exists.

---

## ✅ Subarray Sum Equals K
```java
import java.util.*;

public class SubarraySumK {

    public static int countSubarrays(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
```

---

# 🟪 10. Pattern 6: Longest Substring Without Repeating Characters (HashSet + Sliding Window)

## ✔ Why Hashing?
Need to check if char exists → O(1)

---

## 🧠 Thought Process
- Expand window  
- If duplicate found → shrink window  

---

## ✅ Longest Unique Substring
```java
import java.util.*;

public class LongestUniqueSubstring {

    public static int longest(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
```

---

# 🟦 11. Pattern 7: First Non-Repeating Character

## ✔ When to Use
- “first unique”  
- “non-repeating index”  

---

## 🧠 Thought Process
1. Build frequency map  
2. Traverse string, return first index with freq 1  

---

## ✅ First Unique Character
```java
import java.util.*;

public class FirstUniqueChar {

    public static int firstUnique(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}
```

---

# 🟥 12. Pattern 8: HashSet for Distinct Elements

## ✔ When to Use
- “count unique numbers”
- “how many distinct values?”

---

## 🧠 Thought Process
HashSet automatically removes duplicates.

---

## ✔ Count Distinct
```java
import java.util.*;

public class DistinctCount {

    public static int countDistinct(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int n : arr) {
            set.add(n);
        }

        return set.size();
    }
}
```

---

# 🟦 13. Pattern 9: HashMap for Index Mapping

Used in:
- Two sum  
- Character last index store  
- Sliding window problems  

---

## 🧠 Thought Process
Store last seen index:
```
map.put(char, index)
```

---

## ✔ Last Occurrence Map Template
```java
Map<Character, Integer> last = new HashMap<>();
last.put('a', 5);
```

---

# 🎯 FINAL SUMMARY

You now have full hashing notes:
✔ Hashing fundamentals  
✔ When to use HashMap vs HashSet  
✔ Collision basics  
✔ Pattern recognition  
✔ Frequency maps  
✔ Duplicate detection  
✔ Subarray sum using prefix hashing  
✔ Unique substring  
✔ Grouping anagrams  
✔ Kunal-style base codes
