class Solution {
    public int[] solution(int n, int k) {
        int a=0;
        for(int i=1; i*k<=n; i++){
            a++;
        }
        int[] answer = new int[a];
        a=0;
        for(int i=1; i*k<=n; i++){
            answer[a]=i*k;
            a++;
        }
        return answer;
    }
}