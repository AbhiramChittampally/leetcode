// Last updated: 8/6/2026, 10:34:13 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0;
        int s=k+1;
        for(int r=0;r<nums.length;r++){
            int c=nums[r];
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(r-l==s){
                int rc=nums[l];
                hm.put(rc,hm.get(rc)-1);
                if(hm.get(rc)==0){
                    hm.remove(rc);
                }
                l++;
            }
            if(hm.get(c)>1){
                return true;
            }
           
            
            
        }
        return false;
        
            
        
        
    }
}