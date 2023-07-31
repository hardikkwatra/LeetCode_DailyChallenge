class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0, k = 0, t = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                t = nums[i];
                nums[i] = 0;
                nums[k++] = t;
            }
        }
    }
}