// Last updated: 8/6/2026, 10:33:59 AM
class Solution {
    public String reverseVowels(String s) {
        String v="";
        String m="";
        int l=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                v=v+s.charAt(i);

            }
        }
        System.out.print(v);
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                m+=v.charAt(l++);
                
                

                
            }
            else{
                m+=s.charAt(i);
            }
           
            
            
            
            
        }
        return m;
        
    }
}