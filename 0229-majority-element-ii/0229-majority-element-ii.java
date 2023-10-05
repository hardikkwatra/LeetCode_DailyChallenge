class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = -1;
        int el2 = -1;

        for(int i = 0; i < nums.length; i++){
            if(cnt1 == 0 && el2 != nums[i]){
                cnt1++;
                el1 = nums[i];
            }
            else if(cnt2 == 0 && el1 != nums[i]){
                cnt2++;
                el2 = nums[i];
            }
            else if(el2 == nums[i]) cnt2++;
            else if(el1 == nums[i]) cnt1++;

            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        cnt1 = 0;  cnt2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(el1 == nums[i]){
                cnt1++;
            }
            else if(el2 == nums[i]){
                cnt2++;
            }
        }
        int min = nums.length/3 + 1;
        if(cnt1 >= min){
            list.add(el1);
        }
        if(cnt2 >= min){
            list.add(el2);
        }
        return list;
    }
}