// Last updated: 8/6/2026, 10:32:39 AM
class Solution {
    public int lnum(int n[]){
        int m=Integer.MIN_VALUE;
        

        for(int i=0;i<n.length;i++){
            m=Math.max(m,n[i]);
            
        }
        System.out.println(m);
        return m;
        
    }
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int a[]=new int[n+1];
        a[0]=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            a[i+1]=sum;
        }
        
        int ans=lnum(a);
        return ans;
    }
}