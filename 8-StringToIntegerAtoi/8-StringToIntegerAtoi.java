// Last updated: 8/6/2026, 10:35:35 AM
class Solution {
    static int max=Integer.MAX_VALUE;
    static int min=Integer.MIN_VALUE;
    public int helper(String s,int i, long num,int sign){
        if(i>=s.length() || !Character.isDigit(s.charAt(i))){
            return (int)(sign*num);
        }
        num=num*10+s.charAt(i)-'0';
        if (sign * num <= min) return min;
        if (sign * num >= max) return max;

        
        return helper(s, i + 1, num, sign);

    }
    public int myAtoi(String s) {
        int i=0;
        int sign=1;
        while(i<s.length()&&s.charAt(i)==' ')i++;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        return helper(s,i,0,sign);
        
    }
}