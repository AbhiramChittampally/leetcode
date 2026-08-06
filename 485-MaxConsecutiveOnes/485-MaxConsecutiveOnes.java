// Last updated: 8/6/2026, 10:33:55 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==1){
                count+=1;
                System.out.println(count);
            }
            ans=Math.max(count,ans);
            if(nums[i]==0){
                
                count=0;
            }


        }
        return ans;
        
    }
}