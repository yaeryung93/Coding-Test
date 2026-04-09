class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int i=n/10;
        int a=n*12000;
        int b=k*2000;
        if(n<10){
            answer=a+b;
        }
        else{
            answer=a+b-(i*2000);
        }
        return answer;
    }
}