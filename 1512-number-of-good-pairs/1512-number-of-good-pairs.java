class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int ans = 0;
        
        for(int i = 0; i < nums.length; i++){
                count[nums[i]-1]++;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] >= 1){
                ans = ans + (count[i] * (count[i] - 1)) / 2;
            }
        }
        return ans;
    }
}