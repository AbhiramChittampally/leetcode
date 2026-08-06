// Last updated: 8/6/2026, 10:32:37 AM
class Solution {
    public int secondHighest(String s) {
        int temp=0;
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=48&&ch<=57){
                al.add(ch-48);
                
            }
        }
        Collections.sort(al);
        if(al.size()==0){
            return -1;
        }
        int val=al.get(al.size()-1);
        for(int i=al.size()-1;i>=0;i--){
            if(al.get(i)!=val){
                return al.get(i);

            }
        }
        return -1;
        
    }
}