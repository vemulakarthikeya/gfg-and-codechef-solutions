class Solution {
    int sumOfSeries(int n) {
        // code here
        int sum=0,cube=0;
        while(n > 0){
            cube = (int)Math.pow(n,3);
            sum = sum + cube;
            n--;
        }
        return sum;
    }
}