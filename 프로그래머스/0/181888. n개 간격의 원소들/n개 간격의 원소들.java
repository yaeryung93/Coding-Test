class Solution {
    public int[] solution(int[] num_list, int n) {
        int len=0;
        for(int i=0; i<num_list.length; i+=n){
            len++;
        }
        int idx=0;
        int[] answer = new int[len];
        for(int i=0; i<len; i++){
            answer[i]=num_list[idx];
            idx+=n;
        }
        return answer;
    }
}