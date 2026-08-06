// Last updated: 8/6/2026, 10:34:52 AM

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=nums1.length-1;
        int p2=0;
        
        for(int i=nums1.length-1;i>=nums1.length-n;i--){
            if(nums1[p1]==0){
                nums1[p1]=nums2[p2];
                p1--;
                p2++;
            }
           
            else{
                break;

            }

        }
        Arrays.sort(nums1);
        
    }
}