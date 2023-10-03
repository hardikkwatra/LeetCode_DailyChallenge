class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int ans = 0;
        
        for (int i = 0; i < nums.length; i++) {
            ans += count[nums[i] - 1];
            count[nums[i] - 1]++;
        }

        return ans;
    }
}
