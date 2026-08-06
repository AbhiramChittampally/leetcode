// Last updated: 8/6/2026, 10:34:35 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int ans=1;
        int max=1;
        if(nums.length==0){
            return 0;
        }
        

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                ans+=1;
                max=Math.max(ans,max);
                

            }
            else if(nums[i]==nums[i-1]){
                continue;
                
            }
            else{
                ans=1;

            }


        }
        return max;
        
    }
}