// Last updated: 8/6/2026, 10:34:03 AM
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return nums[i];
            }
            else{
                hs.add(nums[i]);
            }

        }
        return -1;
    }
}