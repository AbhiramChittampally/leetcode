// Last updated: 8/6/2026, 10:34:56 AM
class Solution {
    public void sortColors(int[] nums) {
        int ones=0;
        int twos=0;
        int zs=0;
        for(int i:nums){
            if(i==0){
                zs++;
            }
            else if(i==1){
                ones++;
            }
            else{
                twos++;
            }
        }
        for(int i=0;i<zs;i++){
            nums[i]=0;
        }
        for(int i=zs;i<zs+ones;i++){
            nums[i]=1;
        }
        for(int i=zs+ones;i<zs+ones+twos;i++){
            nums[i]=2;
        }
    }
}