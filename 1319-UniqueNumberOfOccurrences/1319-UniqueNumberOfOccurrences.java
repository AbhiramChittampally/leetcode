// Last updated: 8/6/2026, 10:33:05 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        

        for(int i:hm.values()){
            
            if(hs.contains(i)){
                return false;
            }
            hs.add(i);
        }
        
        return true;
        
    }
    
}