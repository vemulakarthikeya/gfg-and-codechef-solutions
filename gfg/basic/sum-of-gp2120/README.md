# Sum of GP

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given  **n**,  **a**  and  **r**  as the number of terms, first term and common ratio respectively of a Geometric Progression series. Find the sum of the series up to  **nth**  term.

The Geometric Progression series looks like :- a, ar, ar2, ar3, ar4,.....      

 **Examples:** 

```
Input: n = 3, a = 3, r = 2
Output: 21
Explanation: Series upto 3rd term is 3 6 12, so sum will be 21.

```

```
Input: n = 3, a = 1, r = 2
Output: 7
Explanation: Series upto 3rd term is 1 2 4, so sum will be 7.

```

 **Constra**  **i**  **nts:** 

1 ≤ n, a, r ≤ 9

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T06:19:33.471Z  

```java
class Solution {
    public int sumOfGP(int n, int a, int r) {
        // code here
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum = sum + (int)(a*Math.pow(r,i));
        }
        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-gp2120/1)