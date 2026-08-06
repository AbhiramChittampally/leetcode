// Last updated: 8/6/2026, 10:32:24 AM
import java.util.*;
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(int i=0;i<operations.length;i++){
            String temp=operations[i];
            if (temp.equals("X++")){
                ans=ans+1;
            }
            if (temp.equals("X--")){
                ans=ans-1;
            }
            if (temp.equals("++X")){
                ans=ans+1;

            }
            if (temp.equals("--X")){
                ans=ans-1;

            }
        }
        return ans;
        
    }
}