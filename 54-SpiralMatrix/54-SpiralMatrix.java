// Last updated: 8/6/2026, 10:35:08 AM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al=new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        int srow=0;int scol=0;
        int erow=r-1;int ecol=c-1;
        while(srow<=erow && scol<=ecol){
            for(int j=scol;j<=ecol;j++){
                al.add(matrix[srow][j]);
            }
            for(int i=srow+1;i<=erow;i++){
                al.add(matrix[i][ecol]);
            }
            for(int j=ecol-1;j>=scol;j--){
                if(srow==erow){
                    break;
                }
                al.add(matrix[erow][j]);

            }
            for(int i=erow-1;i>=srow+1;i--){
                if(scol==ecol){
                    break;
                }
                al.add(matrix[i][scol]);
            }
            srow++;
            erow--;
            ecol--;
            scol++;

        }
        return al;
        
    }
}