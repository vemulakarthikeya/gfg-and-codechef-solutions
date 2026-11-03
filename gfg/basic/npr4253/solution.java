class Solution {
    public long nPr(int n, int r) {
        // code here
        long sum1 = 1,sum2 = 1;
        for(long i = 1 ; i <= n ; i++){
            sum1 = sum1 * i;
        }
        for(long j = 1 ; j <= (n-r) ; j++){
            sum2 = sum2 * j;
        }
        return sum1/sum2;
    }
}