// Last updated: 8/6/2026, 10:35:40 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[] ans=new int[nums1.length+nums2.length];
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                ans[k++]=nums1[i++];

            }
            else{
                ans[k++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            ans[k++]=nums1[i++];
        }
        while(j<nums2.length){
            ans[k++]=nums2[j++];
        }
        if(ans.length%2==0){
            int mid1=ans.length/2;
            int mid2=mid1-1;
            int an=ans[mid1]+ans[mid2];
            return an/2.0;

        }
        else{
            int mid=ans.length/2;
            return (double)ans[mid];
        }
        
    }
}