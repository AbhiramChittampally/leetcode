// Last updated: 8/6/2026, 10:33:01 AM
class Solution {
    public int numD(int n){
        int temp=0;
        while(n>0){
            temp+=1;
            n=n/10;
        }
        return temp;
       }
    public int Rev(int n){
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;

    }   
    public int divisorSubstrings(int num, int k) {
        int numd=numD(num);
        int numr=Rev(num);
        int temp=0;
        int m=(int)Math.pow(10,k);



        int s=0;
        int a[]=new int[numd];
        for(int i=0;i<numd;i++){
            int rev=numr%10;

            a[i]=rev;
            numr=numr/10;


        }

        for(int i=0;i<k;i++){
            s=s*10+a[i];


        }
        System.out.println(s);
        if(num%s==0){
            temp+=1;
        }
        for(int i=k;i<a.length;i++){
            s=s*10+a[i]-(m*a[i-k]);
            System.out.println(s);
            if(s==0){
                continue;
            }
            if(num%s==0){
                temp+=1;
            }
        }
        

       
       
        return temp;
    }
    
}