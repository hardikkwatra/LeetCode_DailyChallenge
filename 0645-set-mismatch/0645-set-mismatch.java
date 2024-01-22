class Solution {
    public int[] findErrorNums(int[] nums) {
        int first = 0;
        int second = 0;
        
        int[] count = new int[nums.length + 1];
        count[nums[0]] += 1;
        for (int i = 1; i < nums.length; i++) {
            count[nums[i]] += 1;
        }

        for (int j = 1; j < count.length; j++) {
            if (count[j] > 1) {
                first = j;
            }
            if (count[j] == 0) {
                second = j;
            }
        }

        return new int[]{first, second};
    }
}