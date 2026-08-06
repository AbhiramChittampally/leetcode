// Last updated: 8/6/2026, 10:32:11 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> p=new ArrayList<>();
        List<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                p.add(nums[i]);
            }
            else{
                n.add(nums[i]);
            }
        }
        int p1=0;
        int n1=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=p.get(p1++);
            }
            else{
                nums[i]=n.get(n1++);
            }
        }
        return nums;
        
    }
}