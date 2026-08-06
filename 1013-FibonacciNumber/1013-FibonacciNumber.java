// Last updated: 8/6/2026, 10:33:18 AM
class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}