class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int count=0;
        while(true){
            if(chicken==0) break;
            else{
                chicken--;
                count++;
                if(count==10){
                    count=0;
                    chicken++;
                    answer++;
                }
            }
        }
        return answer;
    }
}