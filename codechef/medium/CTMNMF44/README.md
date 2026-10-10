# CTMNMF44

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T16:59:30.931Z  

```java
class Codechef {
    public static void main(String[] args) {
        int i = 1; // Initialize counter

        while (i <= 10) { // Loop from 1 to 10
            if (i % 2 == 0) { // Skip multiples of 2
                i++; // Move to the next number
                continue; // Skip this iteration
            }
            System.out.println(i); // Print odd numbers
            i++; // Increment counter
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF44)