import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int len=0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9')
                len++;
        }
        int[] answer = new int[len];
        int idx=0;
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
                answer[idx]=my_string.charAt(i)-'0';
                idx++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}