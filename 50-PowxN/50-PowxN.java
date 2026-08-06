// Last updated: 8/6/2026, 10:35:11 AM
class Solution {
    
        
        
    
    public double myPow(double x, int n) {
    long N = n; // prevent overflow

    if (N < 0) {
        x = 1 / x;
        N = -N;
    }

    return fastPow(x, N);
}

private double fastPow(double x, long n) {
    if (n == 0) return 1;

    if (n % 2 == 0) {
        return fastPow(x * x, n / 2);
    }

    return x * fastPow(x, n - 1);
}

}