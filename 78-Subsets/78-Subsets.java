// Last updated: 8/6/2026, 10:34:55 AM
class Solution {
    static void rec(int i,int[] nums, List<List<Integer>> al,List<Integer> ds){
        if(i==nums.length){
            al.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[i]);
        rec(i+1,nums,al,ds);
        ds.remove(ds.size()-1);
        rec(i+1,nums,al,ds);

        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> al =new ArrayList<>();
        rec(0,nums,al,new ArrayList<>());
        return al;

        
    }
}