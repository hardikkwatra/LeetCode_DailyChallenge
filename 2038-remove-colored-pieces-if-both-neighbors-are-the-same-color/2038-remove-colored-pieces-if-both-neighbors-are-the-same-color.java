class Solution {
    public boolean winnerOfGame(String colors) {
        int a=0,b=0;
        int a1=0,b1=0;
        for(char c : colors.toCharArray()){
            if(c=='A'){
                b1=0;
                a1++;
                if(a1>=3){
                    a++;
                }
            }
            else{
                a1=0;
                b1++;
                if(b1>=3){
                    b++;
                }
            }
        }
        if(a>b)
            return true;
        else
        return false;
        
    }
}