// Last updated: 8/6/2026, 10:35:18 AM
class Solution {
    static void findC(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findC(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findC(ind+1,arr,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans=new ArrayList<>();
        findC(0,candidates,target,ans,new ArrayList<>());
        return ans;

    }
}