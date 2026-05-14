class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int e=1;
        int o=1;
        int len=num_list.length;
        for(int i=1; i<=len; i++){
            if(num_list[len-i]%2==0){
                answer+=num_list[len-i]*e;
                e*=10;
            }
            else{
                answer+=num_list[len-i]*o;
                o*=10;
            }
        }
        return answer;
    }
}