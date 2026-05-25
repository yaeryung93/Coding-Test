class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int a=0;
        int b=0;
        for(int i=0; i<num_list.length; i++){
            if(n+a>=num_list.length){
                answer[i]=num_list[b];
                b++;
            }
            else{
                answer[i]=num_list[n+a];
                a++;
            }
        }
        return answer;
    }
}