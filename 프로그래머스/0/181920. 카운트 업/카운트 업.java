class Solution {
    public int[] solution(int start_num, int end_num) {
        int a=0;
        for(int i=start_num; i<=end_num; i++){
            a++;
        }
        int[] answer = new int[a];
        for(int i=0; i<answer.length; i++){
            answer[i]=start_num;
            start_num++;
        }
        return answer;
    }
}