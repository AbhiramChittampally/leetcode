// Last updated: 8/6/2026, 10:34:17 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean y=false;
        String x=t;
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char v=t.charAt(i);
            if(!hm.containsKey(ch)){
                if(!hm.containsValue(v)){
                    hm.put(ch,t.charAt(i));
                }
                else{
                    hm.put(ch,' ');
                }

                
            }
            
            
        }
        
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char val=hm.get(ch);
            ans+=val;
        }
        System.out.print(ans);
        return ans.equals(t);
        
    }
}