import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        int idx=5;
        for(int i=0; i<answer.length; i++, idx++){
            answer[i]=num_list[idx];
        }
        return answer;
    }
}