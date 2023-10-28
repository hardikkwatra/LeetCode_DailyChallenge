class Solution {
    public int arrangeCoins(int n) {
        int j = 1;
        while(n > 0){
            j++;
            n = n - j;
        }
        return j-1;
    }
}