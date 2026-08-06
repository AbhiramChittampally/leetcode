// Last updated: 8/6/2026, 10:35:14 AM
class Solution {
    static void findC(int i,int target,int[] arr,List<List<Integer>> al, List<Integer> ds){
        if(target==0){
            al.add(new ArrayList<>(ds));
            return;
        }
        for(int j=i;j<arr.length;j++){
            if(j>i && arr[j]==arr[j-1])continue;
            if(arr[j]>target)break;
            ds.add(arr[j]);
            findC(j+1,target-arr[j],arr,al,ds);
            ds.remove(ds.size()-1);

        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> al=new ArrayList<>();
        findC(0,target,candidates,al,new ArrayList<>());
        return al;
        
    }
}