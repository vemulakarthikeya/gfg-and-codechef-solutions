class Solution {
    int sumOfSeries(int n) {
        // code here
        int sum=0,cube=0;
        while(n > 0){
            cube = n*n*n;
            sum = sum + cube;
            n--;
        }
        return sum;
    }
}