// Last updated: 8/6/2026, 10:32:10 AM
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm = new HashMap<>();
        int temp=97;
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(!hm.containsKey(ch)&&ch!=' '){
                
                hm.put(ch,(char)temp);
                temp++;
            }
            
        }
        String ans="";
        for(int i=0;i<message.length();i++){
            char ch=message.charAt(i);
            if(ch!=' '){
                char val=hm.get(ch);
                ans+=val;
            }
            else{
                ans+=" ";
            }
            

        }
        return ans;
        
    }
}