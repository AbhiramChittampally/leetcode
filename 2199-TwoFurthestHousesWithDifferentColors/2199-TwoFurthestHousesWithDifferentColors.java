// Last updated: 8/6/2026, 10:32:20 AM
class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                if(colors[j]>colors[i]||colors[i]>colors[j]){
                    int diff=Math.abs(i-j);
                    
                    ans=Math.max(ans,diff);
                    
                }
                
            }
        }
        return ans;
    }
    
}