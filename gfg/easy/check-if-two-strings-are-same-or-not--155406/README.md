# Check Same Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1**  and  **s2**, determine if they are  **exactly**  the same, considering case sensitivity.

 **Examples:** 

```
Input: s1 = "abc", s2 = "abc" 
Output: true
```

```
Input: s1 = " ", s2 = " "
Output: true
```

```
Input: s1 = "geeks", s2 = "Geeks"
Output: false
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T11:53:52.456Z  

```java
class Solution {
    public static boolean areStringsSame(String s1, String s2) {
        // code here
        if(s1.equals(s2)){ //used to check weather the two strings are equal or not por non primitive data types
            return true;
        }
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-two-strings-are-same-or-not--155406/1)