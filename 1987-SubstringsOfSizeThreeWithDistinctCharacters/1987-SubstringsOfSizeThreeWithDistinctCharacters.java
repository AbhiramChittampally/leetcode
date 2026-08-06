// Last updated: 8/6/2026, 10:32:28 AM
class Solution {
    public int countGoodSubstrings(String s) {
       HashMap<Character,Integer> hs=new HashMap<>();
        int k=3;
        int t=0;
        int temp=0;
        if(s.length()<3){
            return 0;
        }
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }
        if(hs.size()==k){
            temp+=1;
        }
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            char tch=s.charAt(i-k);
            hs.put(tch,hs.get(tch)-1);
            if(hs.get(tch)==0){
                hs.remove(tch);
            }
            hs.put(ch,hs.getOrDefault(ch,0)+1);
            if(hs.size()==k){
                temp+=1;
            }
        }    

            
        return temp;
        
    }
}