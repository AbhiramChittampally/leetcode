// Last updated: 8/6/2026, 10:31:59 AM
class Solution {
    public String reverse(String s){
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        return ans;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int lol=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                String c=words[i];
                String b=words[j];
                String revb=reverse(b);
                if(revb.equals(c)){
                    lol++;

                
                }

            }
            
        }
        return lol;
        
    }
}