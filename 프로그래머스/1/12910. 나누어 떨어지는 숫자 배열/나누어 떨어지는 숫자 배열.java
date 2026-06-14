import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int len=0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]%divisor==0) len++;
        if(len==0){
            int[] answer=new int[]{-1};
            return answer;
        }
        
        int[] answer = new int[len];
        
        int idx=0;
        for(int i=0; i<arr.length; i++)
            if(idx<answer.length && arr[i]%divisor==0){
                answer[idx]=arr[i];
                idx++;
            }
        Arrays.sort(answer);
        return answer;
    }
}