// Last updated: 8/6/2026, 10:32:38 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        int n=word1.length()+word2.length();
        String s="";
        while(true){
            if(i<word1.length()&&j<word2.length()){
                s+=word1.charAt(i++);
                s+=word2.charAt(j++);
            }

            if(i>=word1.length()&&j>=word2.length()){
                break;
            }
            if(i<word1.length()&&j>=word2.length()){
                s+=word1.charAt(i++);
            }
            if(i>=word1.length()&&j<word2.length()){
                s+=word2.charAt(j++);
            }
        }
        return s;


        
    }
}