// Last updated: 8/6/2026, 10:33:14 AM
class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        for (int i=0;i<address.length();i++){
            
            if(address.charAt(i)!='.'){
                ans=ans+address.charAt(i);
            }
            else{
                ans=ans+"[.]";
            }
        }
        return ans;
        
    }
}