// Last updated: 8/6/2026, 10:33:39 AM
import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        
        HashSet<Integer> hs=new HashSet<>();
        
        int dupe=0;
        int miss=0;
        for(int i=0;i<nums.length;i++){
           
            if(!hs.contains(nums[i])){
                
                hs.add(nums[i]);
            }
            else{
                dupe=nums[i];
                
            }
           
        }
         for(int i=1;i<=nums.length;i++){
                if(!hs.contains(i)){
                    miss=i;
                }
            }
        int arr[]={dupe,miss};
        return arr;

      
        
    }
}