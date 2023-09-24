class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int n= arr.length;
        char temp = '0';
        for(int i = 0; i<n/2; i++){
            if(arr[i] == '0' ){
                temp = arr[i];
                arr[i] = arr[n-i-2];
                arr[n-i-2] = temp;
            }
            
        }
        String str = new String(arr);
        return str;
        
        
    }
}