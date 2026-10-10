# CTMNMF36

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T16:54:38.974Z  

```java
import java.util.*;
class Codechef {
    public static void main(String[] args) {
        
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF36)