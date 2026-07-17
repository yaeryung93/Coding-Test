class Solution {
    public int solution(int a, int b) {
        if(a>b){
            for(int i=1; i<=b; i++){
                if(a%i==0 && b%i==0){
                    a/=i;
                    b/=i;
                }
            }
        }
        else{
            for(int i=1; i<=a; i++){
                if(a%i==0 && b%i==0){
                    a/=i;
                    b/=i;
                }
            }
        }
        while(true){
            if(b%2==0)
                b/=2;
            if(b%5==0)
                b/=5;
            if(b%2!=0 && b%5!=0)
                break;
        }
        boolean tf=false;
        for(int i=2; i<=b; i++){
            if(b%i==0 && i!=2 && i!=5)
                tf=true;
        }
        if(tf) return 2;
        return 1;
    }
}