// Last updated: 8/6/2026, 10:34:26 AM
class Solution {
    public int majorityElement(int[] nums) {
        
        
       
        Arrays.sort(nums);
        
        return nums[nums.length/2];

    }
}