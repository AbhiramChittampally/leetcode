// Last updated: 8/6/2026, 10:34:34 AM
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hm=new HashSet<>();
        for(int i:nums){
            if(!hm.contains(i)){
                hm.add(i);
            }
            else{
                hm.remove(i);
            }
        }
        
        for(int i:hm){
            return i;
        }
        return -1;
    }
}