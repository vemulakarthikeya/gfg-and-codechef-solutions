# Logical Operators

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two boolean variables  **x**  and  **y**, perform the following logical operations:

- p: Logical AND of x and y.
- q: Logical OR of x and y.
- r: Logical NOT of x.
- s: Logical NOT of y.

 **Examples:** 

```
Input: x = true, y = false
Output: False True False True
Explanation: The given logical operations are performed:
Logical AND of x and y = False
Logical OR of x and y = True
Logical NOT of x = False
Logical NOT of y = True
Hence, the output is False True False True.
```

```
Input: x = true, y = true
Output: True True False False
Explanation: The given logical operations are performed:
Logical AND of x and y = True
Logical OR of x and y = True
Logical NOT of x = False
Logical NOT of y = False
Hence, the output is True True False False.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T15:54:43.231Z  

```java
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean x = sc.nextBoolean();
        boolean y = sc.nextBoolean();
        

        // code here
        boolean p = x & y;
        boolean q = x || y;
        boolean r = !x;
        boolean s = !y;

        System.out.printf("%s %s %s %s", p ? "True" : "False", q ? "True" : "False",
                          r ? "True" : "False", s ? "True" : "False");
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/logical-operators-1605596247--132814/1)