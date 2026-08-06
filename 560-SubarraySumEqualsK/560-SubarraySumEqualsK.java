// Last updated: 8/6/2026, 10:33:52 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int ps=0;int ans=0;
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            if(hm.containsKey(ps-k)){
                ans+=hm.get(ps-k);
            }
            hm.put(ps,hm.getOrDefault(ps,0)+1);
        }
        return ans;
        
    }
}