// Last updated: 8/6/2026, 10:34:20 AM
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int temp[]=new int[nums.length];
        int l=k;
        int rp=nums.length-k;
        int t=rp;
        for(int i=0;i<k;i++){
            temp[i]=nums[t++];
        }
        for(int i=0;i<rp;i++){
            temp[l++]=nums[i];

        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        
    }
}