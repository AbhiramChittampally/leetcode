// Last updated: 8/6/2026, 10:32:45 AM
class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        

        for(int i=0;i<word1.length();i++){
            char ch=word1.charAt(i);
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<word2.length();i++){
            char ch=word2.charAt(i);
            h2.put(ch,h2.getOrDefault(ch,0)+1);
        }
        if(h1.keySet().equals(h2.keySet())){
            for(int i:h1.values()){
                a1.add(i);
                

            }
            for(int i:h2.values()){
                a2.add(i);

            }
            Collections.sort(a1);
            Collections.sort(a2);
           
            
            

        }
        else{
            return false;
        }
        return a1.equals(a2);
        

          
    }
    
}