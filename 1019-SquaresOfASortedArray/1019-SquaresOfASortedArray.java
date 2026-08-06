// Last updated: 8/6/2026, 10:33:17 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(ans);
        return ans;
        
    }
}