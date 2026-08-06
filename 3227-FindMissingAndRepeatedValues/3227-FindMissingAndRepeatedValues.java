// Last updated: 8/6/2026, 10:31:55 AM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        HashSet<Integer> hs=new HashSet<>();
        int n=grid.length;
        
        ans[1]=((n * n) * ((n * n) + 1)) / 2;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(hs.contains(grid[i][j])){
                    ans[0]=grid[i][j];
                    ans[1]+=grid[i][j];
                }
                hs.add(grid[i][j]);
                ans[1]-=grid[i][j];

            }
        }
        
        return ans;
        
    }
}