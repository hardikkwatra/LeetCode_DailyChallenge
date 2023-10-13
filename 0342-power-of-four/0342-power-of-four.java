class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        
        double logBase4 = Math.log(n) / Math.log(4);
        return Math.abs(logBase4 - Math.round(logBase4)) < 1e-10;
    }
}
