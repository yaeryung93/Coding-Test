class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] num=new int[10];
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<num.length; j++){
                if(numbers[i]==j){
                    num[j]++;
                    break;
                }
            }
        }
        for(int i=0; i<num.length; i++){
            if(num[i]==0) answer+=i;
        }
        return answer;
    }
}