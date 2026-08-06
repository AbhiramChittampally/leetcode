// Last updated: 8/6/2026, 10:33:42 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s = 0;
        int max = Integer.MIN_VALUE;  
        
        for (int i = 0; i < k; i++) {
            s += nums[i];
        }
        max = s;
        
        
        for (int i = k; i < nums.length; i++) {
            s += nums[i] - nums[i - k];  
            max = Math.max(max, s);  
        }
        
        return (double) max / k;  
    }
}