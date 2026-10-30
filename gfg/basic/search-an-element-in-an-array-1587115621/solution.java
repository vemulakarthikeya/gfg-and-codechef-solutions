class Solution {
    public int search(int arr[], int x) {
        // code here
        int count = 0;
        for(int i = 0 ; i<= arr.length - 1 ; i++){
            if(arr[i] == x){
                return count;
            }else{
                count++;
            }
        }
        return -1;
    }
}
