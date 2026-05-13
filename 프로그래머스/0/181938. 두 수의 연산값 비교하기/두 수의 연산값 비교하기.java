class Solution {
    public int solution(int a, int b) {
        int len=b;
        int i=10;
        while(len>=10){
            len/=10;
            i*=10;
        }
        if((a*i)+b>=2*a*b) return a*i+b;
        else return 2*a*b;
    }
}