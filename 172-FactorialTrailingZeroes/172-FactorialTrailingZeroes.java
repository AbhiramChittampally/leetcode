// Last updated: 8/6/2026, 10:34:22 AM
class Solution {
    public int rec(int n){
        int count =0;
        while(n>=5){
            n/=5;
            count+=n;

        }
        return count;
    }
    public int trailingZeroes(int n) {
        

        return rec(n);
    }
}