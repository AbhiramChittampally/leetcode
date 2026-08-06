// Last updated: 8/6/2026, 10:34:09 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] sol=new int[nums.length];
        Arrays.fill(sol,1);
        for(int i=1;i<nums.length;i++){
            sol[i]=sol[i-1]*nums[i-1];

        }
        int suf=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            sol[i]*=suf;
            suf*=nums[i];
;
        }
        return sol;
        
    }
}