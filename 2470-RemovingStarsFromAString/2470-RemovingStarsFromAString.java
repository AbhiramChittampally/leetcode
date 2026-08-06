// Last updated: 8/6/2026, 10:32:08 AM
class Solution {
    public String rev(String s){
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t+=s.charAt(i);

        }
        return t;
    }
    public String removeStars(String s) {
        String ans="";
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return rev(ans);
    }
}