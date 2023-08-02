class Solution {
    public int pivotIndex(int[] nums) {
        int s = 0;
        int e = 0;

        for(int i = 0; i < nums.length; i++){
            e = e + nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            
            e = e - nums[i];

            if(e == s){
              return i;
            }

            s = s + nums[i];
        }
        return -1;
    }
}