// Last updated: 8/6/2026, 10:32:59 AM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int ans=0;
        int avg=0;
        int temp=0;
        int l=0;
        for(int i=0;i<k;i++){
            ans+=arr[i];
        }
        avg=ans;
        if(avg/k>=threshold){
            temp+=1;
        }
        for(int i=k;i<arr.length;i++){
            avg=avg + arr[i]-arr[i-k];
            
            
            if(avg/k>=threshold){
                temp+=1;
            }
        }
        
       
        return temp;
        
    }
}