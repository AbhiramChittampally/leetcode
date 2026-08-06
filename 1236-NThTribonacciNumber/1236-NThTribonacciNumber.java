// Last updated: 8/6/2026, 10:33:08 AM
class Solution {
    public int tribonacci(int n) {
        int a[]=new int[38];
        a[0]=0;
        a[1]=1;
        a[2]=1;
        for(int i=3;i<a.length;i++){
            a[i]=a[i-1]+a[i-2]+a[i-3];
            
        }
        return a[n];
        
    }
}