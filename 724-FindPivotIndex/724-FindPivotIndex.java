// Last updated: 8/6/2026, 10:33:32 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sumleft[]=new int[n];
        int sumright[]=new int[n];
        int r=0;
        int l=0;
        int idx=0;

        for(int i=0;i<n;i++){
            if(i==0){
                l+=0;
            }
            else{
                l+=nums[i-1];
            }
            sumleft[i]=l;


        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                r+=0;
            }
            else{
                r+=nums[i+1];
            }
            sumright[i]=r;
            
        }
        
        for(int i=0;i<n;i++){
            if(sumleft[i]==sumright[i]){
                return i;
            }
            
        }
        return -1;
        
    }
}