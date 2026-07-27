import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] total1=new int[score.length];
        Integer[] total2=new Integer[score.length];
        for(int i=0; i<total1.length; i++){
            total1[i]=(score[i][0]+score[i][1]);
            total2[i]=(score[i][0]+score[i][1]);
        }
        int idx=0;
        Arrays.sort(total2, Collections.reverseOrder());
        for(int i=0; i<total1.length; i++){
            for(int j=0; j<total2.length; j++){
                if(total2[j]==total1[i]){
                    answer[idx]=(j+1);
                    idx++;
                    break;
                }
            }
        }
        return answer;
    }
}