class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,-1};
        int[] ans = new int[2];
        //ans[0] = first occurence of target 
        //ans[1] = last occurence of target
        ans[0] = getFirstOccurence(nums,target);
        ans[1] = getLastOccurence(nums,target);
        return ans;
    }
    public int getFirstOccurence(int[] nums, int target){
        int ans = Integer.MAX_VALUE;
        int left = 0,right=nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;  //TODO: handle overflow
            if(nums[mid] >= target){
                // mid is possible first occurence
                if(nums[mid]==target)
                    ans = Math.min(ans,mid);
                right=mid-1;
            }
            else
                left = mid+1;
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public int getLastOccurence(int[] nums,int target){
        int ans = Integer.MIN_VALUE;
        int left = 0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            // mid is possible last occurence
            if(nums[mid]<=target){
                if(nums[mid] == target)
                    ans = Math.max(ans,mid);
                left = mid+1;
            }
            else
                right = mid-1;
        }
        return ans==Integer.MIN_VALUE? -1: ans;
    }
}