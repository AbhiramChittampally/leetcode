// Last updated: 8/6/2026, 10:32:54 AM
class Solution {
    public int maxVowels(String s, int k) {
        
        int l=0;
        int ans=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(s.charAt(r)=='a'||s.charAt(r)=='e'||s.charAt(r)=='i'||s.charAt(r)=='o'||s.charAt(r)=='u'){
                ans+=1;
                

            }
            if(r-l==k){
                if(s.charAt(l)=='a'||s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='o'||s.charAt(l)=='u'){
                    ans-=1;
                    

                }
                l++;
                
                
            }
            if(r-l+1==k){
                max=Math.max(ans,max);

            }
           
            

        }
        return max;
        
    }
}