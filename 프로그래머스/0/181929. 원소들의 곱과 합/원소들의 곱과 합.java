class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int ad=0;
        int mp=1;
        for(int i=0; i<num_list.length; i++){
            ad+=num_list[i];
            mp*=num_list[i];
            
            if(ad*ad<mp){
                answer=0;
            }
            else{
                answer=1;
            }
        }
        return answer;
    }
}