// Last updated: 8/6/2026, 10:33:02 AM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> arr=new ArrayList<>();
        HashSet<Integer> h1 =new HashSet<>();
        HashSet<Integer> h2 =new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            h1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            int n=nums2[i];
            if(h1.contains(n)){
                h1.remove(n);
            }
        }
        for(int i=0;i<nums2.length;i++){
            h2.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            int n=nums1[i];
            if(h2.contains(n)){
                h2.remove(n);
            }
        }
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        
        int idx1=0;
        int idx2=0;

        for(int i : h1){
            a1.add(i);

        }
        for(int i:h2){
            a2.add(i);

        }
        arr.add(a1);
        arr.add(a2);
        return arr;

    

        
    }
}