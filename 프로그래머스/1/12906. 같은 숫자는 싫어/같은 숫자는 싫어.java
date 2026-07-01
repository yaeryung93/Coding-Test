public class Solution {
    public int[] solution(int []arr) {
        int size=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1])
                size++;
        }
        int[] answer=new int[size+1];
        size=0;
        for(int i=0; i<arr.length-1; i++){
            if(size<answer.length && arr[i]!=arr[i+1])
                answer[size++]=arr[i];
        }
        answer[size]=arr[arr.length-1];
        return answer;
    }
}