// Last updated: 8/6/2026, 10:32:51 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(hm.containsKey(n)){
                int t=hm.get(n);
                ans+=(hm.get(n));
                hm.put(n,t+1);
                
            }
            else{
                hm.put(n,1);
            }
        }
        return ans;
        

        
        
    }
}