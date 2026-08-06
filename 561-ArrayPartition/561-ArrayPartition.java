// Last updated: 8/6/2026, 10:33:49 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(r-l==1){
                ans+=nums[l];
                l+=2;
                r++;
               

            }

        }
        return ans;
        

        
    }
}