# Size of Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array **arr[]**, find the size of the array.

 **Examples :** 

```
Input: arr[] = [1, 2, 3]
Output: 3
Explanation: The size of the array is 3.
```

```
Input: arr[] = [1, 2, 3, 5, 4]
Output: 5
Explanation: The size of the array is 5.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T15:44:08.571Z  

```java
class Solution {
    public int getSize(int[] arr) {
        // code here
        int j = 0;
        for(int i = j ; i < arr.length ; i++){
            j++;
        }
        return j;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/size-of-an-array/1)