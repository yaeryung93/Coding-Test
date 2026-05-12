class Solution {
    public int[] solution(int[] numbers, String direction) {
        int j=numbers.length;
        int[] answer = new int[j];
        if(direction.equals("left")){
            for(int i=0; i<j; i++){
                if((i+1)==j){
                    answer[i]=numbers[0];
                }
                else{
                    answer[i]=numbers[i+1];
                }
            }
        }
        else{
            for(int i=0; i<j; i++){
                if(i==0){
                    answer[i]=numbers[j-1];
                }
                else{
                    answer[i]=numbers[i-1];
                }
            }
        }
        return answer;
    }
}