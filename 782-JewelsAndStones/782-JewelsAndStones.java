// Last updated: 8/6/2026, 10:33:30 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char t=stones.charAt(i);
            hm.put(t,hm.getOrDefault(t,0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            if(hm.containsKey(jewels.charAt(i))){
                ans=ans+hm.get(jewels.charAt(i));
            }
        }
        return ans;
        
        
    }
}