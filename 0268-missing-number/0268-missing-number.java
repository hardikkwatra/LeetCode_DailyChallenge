class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int ans = 0;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i]; 
        }
        double sum2= (n*(n+1))/2;
        ans = (int)sum2 - sum;
        return ans;
    }
}