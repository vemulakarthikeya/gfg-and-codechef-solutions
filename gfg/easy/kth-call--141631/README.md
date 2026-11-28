# Kth call

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a function  **utility()** which prints  **count** every time it is called. The function will be called by the driver's code  **n** times.

You just need to declare count variable in its right place in the code.

 **Examples:** 

```
Input: n = 4
Output: 1 2 3 4
```

```
Input: n = 2
Output: 1 2
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T12:56:43.190Z  

```java
class Solution {
    // declare the variable count here
    int count = 0;
    void utility() {

        // increases the value of count by 1
        count++;

        // print count
        System.out.print(count);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/kth-call--141631/1)