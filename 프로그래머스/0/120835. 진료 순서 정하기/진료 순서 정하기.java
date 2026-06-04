import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] com=new int[emergency.length];
        for(int i=0; i<com.length; i++)
            com[i]=emergency[i];
        Arrays.sort(com);
        for(int i=0; i<com.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(com[i]==emergency[j]){
                    answer[i]=(com.length-j);
                    break;
                }
            }
        }
        return answer;
    }
}