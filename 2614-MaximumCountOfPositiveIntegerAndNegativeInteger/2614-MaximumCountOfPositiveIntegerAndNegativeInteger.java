// Last updated: 8/6/2026, 10:31:58 AM
class Solution {
    public int maximumCount(int[] nums) {
        int n=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                n++;
            }
            else if(nums[i]>0){
                p++;
            }
            else{
                continue;
            }

        }
        return(Math.max(n,p));
        
    }
}