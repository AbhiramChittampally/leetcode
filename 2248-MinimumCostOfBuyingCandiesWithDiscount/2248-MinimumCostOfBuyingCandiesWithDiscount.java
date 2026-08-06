// Last updated: 8/6/2026, 10:32:13 AM
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0;
        if(cost.length<3){
            for(int i=0;i<cost.length;i++){
                ans+=cost[i];
            }
        }
        else{
            int l=cost.length-1;
            for(int r=cost.length-1;r>=0;r--){
            if(l-r==2){
                ans+=cost[r+1]+cost[l];
                l-=3;
                r-=2;

            }
            if(l==0){
                ans+=cost[0];
            }
            if(l==1){
                ans+=cost[0]+cost[1];
            }
        }
        }
      
       
        
        
        return ans;
        
    }
}