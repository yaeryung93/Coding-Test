class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int a=1;
        for(int i=0; i<t; i++){
            a=a*2;
        }
        answer=n*a;
        return answer;
    }
}