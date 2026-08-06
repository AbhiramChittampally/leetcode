// Last updated: 8/6/2026, 10:35:09 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            max=Math.max(curr,max);
        }
        return max;
        
    }
}