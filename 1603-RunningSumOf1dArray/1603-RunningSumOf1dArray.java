// Last updated: 8/6/2026, 10:32:52 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        ans[0]=nums[0];
        
        int t=nums[0];
        for(int r=1;r<n;r++){
            t+=nums[r];
            ans[r]=t;
            

        }
        return ans;

        
    }
   
}