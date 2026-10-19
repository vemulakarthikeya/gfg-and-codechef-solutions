class Solution {
    int factorial(int n) {
        // code here
        int fact = 1;
        while(n >= 1){
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
