// Last updated: 8/6/2026, 10:33:35 AM
class Solution {
    public int sum(Stack<Integer> s){
        int temp=0;
        while(!s.isEmpty()){
            temp+=s.pop();
        }
        return temp;

    }
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack();
        for(int i=0;i<operations.length;i++){
            String st=operations[i];
            if(st.equals("+")){
                int p1=s.pop();
                int p2=s.peek();
                s.push(p1);
                s.push(p1+p2);
            }
            else if(st.equals("D")){
                int p1=s.peek();
                s.push(2*p1);
            }
            else if(st.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.valueOf(st));
            }
        }        
        return sum(s);
    }
}