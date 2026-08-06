// Last updated: 8/6/2026, 10:34:07 AM
class Solution {
    public int missingNumber(int[] nums) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<=nums.length;i++){
            hm.put(i,0);
        }
        
        for(int i:nums){
            hm.put(i,1);

            
        }
        for(int i:hm.keySet()){
            if(hm.get(i)==0){
                return i;

            }
        }
        return -1;
        
    }
}