// Last updated: 8/6/2026, 10:35:34 AM
class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        int b=x;
        if(x<0){
            return false;
        }
        while(x>0){
            int tp=x%10;
            ans=ans*10+tp;
            x=x/10;

        }
        return(ans==b);
        
        
    }
}