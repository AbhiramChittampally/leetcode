// Last updated: 8/6/2026, 10:32:26 AM
class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int ans=-1;
        
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int upper=nums[j];
                int lower=nums[i];
                int temp=upper-lower;
               
                
                ans=Math.max(temp,ans);
                if(ans==0){
                    ans=ans-1;
                }
            }
           
        }      
        return ans;
    }    

}