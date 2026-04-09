class Solution {
    public int[] solution(int[] num_list) {
        int[] answer =new int[2];
        int a=0;
        for(int i=0; i<num_list.length; i++){
            int num=num_list[i]%2;
            if(num==0){
                answer[0]+=1;
            }
            else{
                answer[1]+=1;
            }
        }
        return answer;
    }
}