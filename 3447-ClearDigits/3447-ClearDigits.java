// Last updated: 8/6/2026, 10:32:00 AM
class Solution {
    public String rev(String s){
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t+=s.charAt(i);
        }
        return t;
    }
    public String clearDigits(String s) {
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=48&&ch<=57){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(st);
        String ans="";
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        System.out.println(ans);
        return rev(ans);
    }
}