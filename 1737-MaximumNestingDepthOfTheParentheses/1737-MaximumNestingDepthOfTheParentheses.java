// Last updated: 8/6/2026, 10:32:48 AM
class Solution {
    public int maxDepth(String s) {
        int max=Integer.MIN_VALUE;
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            max=Math.max(max,st.size());
            
            if(ch==')'){
                st.pop();
            }
            else{
                continue;
            }
            
        }
        return max;
        
    }
   
}