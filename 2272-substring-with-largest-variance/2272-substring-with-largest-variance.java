class Solution {
    public int largestVariance(String s) {
        int ans = 0;
        int[] counter = new int[26];
        for (char ch : s.toCharArray()) {
            counter[(int)(ch - 'a')]++;
        } 
        String s1 = "";
        for(char ch1 = 'a'; ch1 <= 'z'; ch1++){
            for(char ch2 = 'a'; ch2 <= 'z'; ch2++){
                if(ch1 == ch2 || counter[ch1-'a'] == 0 || counter[ch2-'a'] == 0){
                    continue;
                }
                
                int cnt1 = 0;
                int cnt2 = 0;
                int remA = counter[ch2 - 'a'];
                
                for(char ch : s.toCharArray()){
                    if(ch == ch1){
                        cnt1++;
                    }
                    if(ch == ch2){
                        cnt2++;
                        remA--;
                    }
                    
                    if(cnt1 < cnt2 && remA >= 1){
                        
                        cnt1 = 0;
                        cnt2 = 0;
                    }
                    
                    if(cnt1 > 0 && cnt2 > 0){
                        
                        ans = Math.max(ans, cnt1 - cnt2);
                    }
                    
                }
            
            }
        }
        return ans;
    }
}