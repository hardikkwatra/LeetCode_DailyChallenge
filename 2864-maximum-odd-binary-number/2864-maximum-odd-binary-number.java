class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] b = s.toCharArray();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.getNumericValue(b[i]) == 1){
                count++;
            }
        }
        for(int i = 0; i < count-1; i++){
            b[i] = '1';
        }
        for(int i = count-1; i < s.length(); i++){
            b[i] = '0';
        }
        b[s.length() - 1] = '1';
        String str = new String(b);
        
        return str;
        
    }
}